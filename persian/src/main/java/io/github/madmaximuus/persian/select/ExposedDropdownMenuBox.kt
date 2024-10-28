package io.github.madmaximuus.persian.select

import android.view.View
import android.view.ViewTreeObserver
import android.view.WindowManager
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.neverEqualPolicy
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.toComposeRect
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.LayoutCoordinates
import androidx.compose.ui.layout.layout
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInWindow
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.platform.SoftwareKeyboardController
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.constrainHeight
import androidx.compose.ui.unit.constrainWidth
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider
import androidx.compose.ui.window.PopupProperties
import io.github.madmaximuus.persian.foundation.PersianTheme
import io.github.madmaximuus.persian.input.OutlineInput
import io.github.madmaximuus.persian.internal.BackHandler
import io.github.madmaximuus.persian.menu.DropdownMenuContent
import io.github.madmaximuus.persian.menu.DropdownMenuItemScope
import io.github.madmaximuus.persian.menu.MenuColors
import io.github.madmaximuus.persian.menu.MenuDefaults
import io.github.madmaximuus.persian.menu.MenuSizes
import io.github.madmaximuus.persian.menu.MenuVerticalMargin
import io.github.madmaximuus.persian.menu.util.MenuPosition
import io.github.madmaximuus.persian.menu.util.calculateTransformOrigin
import kotlin.math.max
import kotlin.math.roundToInt

/**
 * Menus display a list of choices on a temporary surface. They appear when users interact with a
 * button, action, or other control.
 *
 * Exposed dropdown menus, sometimes also called "spinners" or "combo boxes", display the currently
 * selected item in a text field to which the menu is anchored. In some cases, it can accept and
 * display user input (whether or not it’s listed as a menu choice), in which case it may be used to
 * implement autocomplete.
 *
 * The [ExposedDropdownMenuBox] is expected to contain a [OutlineInput] and
 * [ExposedDropdownMenu][ExposedDropdownMenuBoxScope.ExposedDropdownMenu] as content. The
 * [menuAnchor][ExposedDropdownMenuBoxScope.menuAnchor] modifier should be passed to the text field.
 *
 * @param expanded whether the menu is expanded or not
 * @param onExpandedChange called when the exposed dropdown menu is clicked and the expansion state
 *   changes.
 * @param modifier the [Modifier] to be applied to this ExposedDropdownMenuBox
 * @param content the content of this ExposedDropdownMenuBox, typically a [OutlineInput] and an
 *   [ExposedDropdownMenu][ExposedDropdownMenuBoxScope.ExposedDropdownMenu].
 */
@Composable
fun ExposedDropdownMenuBox(
    expanded: Boolean,
    onExpandedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable ExposedDropdownMenuBoxScope.() -> Unit,
) {
    val config = LocalConfiguration.current
    val view = LocalView.current
    val density = LocalDensity.current

    val verticalMargin = with(density) { 48.dp.roundToPx() }

    var anchorCoordinates by remember { mutableStateOf<LayoutCoordinates?>(null) }
    var anchorWidth by remember { mutableIntStateOf(0) }
    var menuMaxHeight by remember { mutableIntStateOf(0) }

    val focusRequester = remember { FocusRequester() }
    val keyboardController = LocalSoftwareKeyboardController.current
    val anchorTypeState = remember { mutableStateOf(MenuAnchorType.PrimaryNotEditable) }

    val scope =
        remember(expanded, onExpandedChange, config, view, density) {
            object : ExposedDropdownMenuBoxScopeImpl() {
                override fun Modifier.menuAnchor(type: MenuAnchorType, enabled: Boolean): Modifier =
                    this
                        .focusRequester(focusRequester)
                        .then(
                            if (!enabled) Modifier
                            else
                                Modifier.expandable(
                                    expanded = expanded,
                                    onExpandedChange = {
                                        anchorTypeState.value = type
                                        onExpandedChange(!expanded)
                                    },
                                    anchorType = type,
                                    keyboardController = keyboardController,
                                )
                        )

                override val anchorType: MenuAnchorType
                    get() = anchorTypeState.value

                override fun Modifier.exposedDropdownSize(matchTextFieldWidth: Boolean): Modifier =
                    layout { measurable, constraints ->
                        val menuWidth = constraints.constrainWidth(anchorWidth)
                        val menuConstraints =
                            constraints.copy(
                                maxHeight = constraints.constrainHeight(menuMaxHeight),
                                minWidth =
                                if (matchTextFieldWidth) menuWidth else constraints.minWidth,
                                maxWidth =
                                if (matchTextFieldWidth) menuWidth else constraints.maxWidth,
                            )
                        val placeable = measurable.measure(menuConstraints)
                        layout(placeable.width, placeable.height) { placeable.place(0, 0) }
                    }
            }
        }

    Box(
        modifier.onGloballyPositioned {
            anchorCoordinates = it
            anchorWidth = it.size.width
            menuMaxHeight =
                calculateMaxHeight(
                    windowBounds = view.rootView.getWindowBounds(),
                    anchorBounds = anchorCoordinates.getAnchorBounds(),
                    verticalMargin = verticalMargin,
                )
        }
    ) {
        scope.content()
    }

    if (expanded) {
        SoftKeyboardListener(view, density) {
            menuMaxHeight =
                calculateMaxHeight(
                    windowBounds = view.rootView.getWindowBounds(),
                    anchorBounds = anchorCoordinates.getAnchorBounds(),
                    verticalMargin = verticalMargin,
                )
        }
    }

    SideEffect { if (expanded) focusRequester.requestFocus() }

    // Back events are handled in the Popup layer if the menu is focusable.
    // If it's not focusable, we handle them here.
    BackHandler(enabled = expanded) { onExpandedChange(false) }
}

@Composable
private fun SoftKeyboardListener(
    view: View,
    density: Density,
    onKeyboardVisibilityChange: () -> Unit,
) {
    // It would be easier to listen to WindowInsets.ime, but that doesn't work with
    // `setDecorFitsSystemWindows(window, true)`. Instead, listen to the view tree's global layout.
    DisposableEffect(view, density) {
        val listener =
            object : View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
                private var isListeningToGlobalLayout = false

                init {
                    view.addOnAttachStateChangeListener(this)
                    registerOnGlobalLayoutListener()
                }

                override fun onViewAttachedToWindow(p0: View) = registerOnGlobalLayoutListener()

                override fun onViewDetachedFromWindow(p0: View) = unregisterOnGlobalLayoutListener()

                override fun onGlobalLayout() = onKeyboardVisibilityChange()

                private fun registerOnGlobalLayoutListener() {
                    if (isListeningToGlobalLayout || !view.isAttachedToWindow) return
                    view.viewTreeObserver.addOnGlobalLayoutListener(this)
                    isListeningToGlobalLayout = true
                }

                private fun unregisterOnGlobalLayoutListener() {
                    if (!isListeningToGlobalLayout) return
                    view.viewTreeObserver.removeOnGlobalLayoutListener(this)
                    isListeningToGlobalLayout = false
                }

                fun dispose() {
                    unregisterOnGlobalLayoutListener()
                    view.removeOnAttachStateChangeListener(this)
                }
            }

        onDispose { listener.dispose() }
    }
}

/** Scope for [ExposedDropdownMenuBox]. */
sealed class ExposedDropdownMenuBoxScope {
    /**
     * Modifier which should be applied to an element inside the [ExposedDropdownMenuBoxScope],
     * typically a text field or an icon within the text field. It's responsible for expanding and
     * collapsing the menu on click, applying semantics to the component, and requesting focus.
     *
     * @param type the type of element that is anchoring the menu. See [MenuAnchorType].
     * @param enabled controls the enabled state. When `false`, the component will not expand or
     *   collapse the menu in response to user input, and menu semantics will be invisible to
     *   accessibility services. Note that this value only controls interactions with the menu. It
     *   does not affect the enabled state of other kinds of interactions, such as [OutlineInput]'s
     *   `enabled` parameter.
     */
    abstract fun Modifier.menuAnchor(type: MenuAnchorType, enabled: Boolean = true): Modifier

    /**
     * Modifier which should be applied to a menu placed inside the [ExposedDropdownMenuBoxScope].
     * It will set constraints on the width and height of the menu so it will not overlap the text
     * field or software keyboard.
     *
     * [ExposedDropdownMenu] applies this modifier automatically, so this is only needed when using
     * custom menu components.
     *
     * @param matchTextFieldWidth whether the menu's width should be forcefully constrained to match
     *   the width of the text field to which it's attached.
     */
    abstract fun Modifier.exposedDropdownSize(matchTextFieldWidth: Boolean = true): Modifier

    internal abstract val anchorType: MenuAnchorType

    /**
     * Popup which contains content for Exposed Dropdown Menu. Should be used inside the content of
     * [ExposedDropdownMenuBox].
     *
     * @param expanded whether the menu is expanded
     * @param onDismissRequest called when the user requests to dismiss the menu, such as by tapping
     *   outside the menu's bounds
     * @param modifier the [Modifier] to be applied to this menu
     * @param scrollState a [ScrollState] used by the menu's content for items vertical scrolling
     * @param matchTextFieldWidth whether the menu's width should be forcefully constrained to match
     *   the width of the text field to which it's attached.
     * @param shadowElevation the elevation for the shadow below the menu
     * @param content the content of the menu
     */
    @Composable
    fun ExposedDropdownMenu(
        expanded: Boolean,
        onDismissRequest: () -> Unit,
        modifier: Modifier = Modifier,
        scrollState: ScrollState = rememberScrollState(),
        matchTextFieldWidth: Boolean = true,
        shadowElevation: Dp = PersianTheme.elevation.large,
        colors: MenuColors = MenuDefaults.colors(),
        sizes: MenuSizes = MenuDefaults.sizes(),
        content: @Composable DropdownMenuItemScope.() -> Unit,
    ) {
        val keyboardSignalState = remember { mutableStateOf(Unit, neverEqualPolicy()) }
        val view = LocalView.current
        val density = LocalDensity.current
        val topWindowInsets = WindowInsets.statusBars.getTop(density)

        if (expanded) {
            SoftKeyboardListener(view, density) { keyboardSignalState.value = Unit }
        }

        val expandedState = remember { MutableTransitionState(false) }
        expandedState.targetState = expanded

        if (expandedState.currentState || expandedState.targetState) {
            val transformOriginState = remember { mutableStateOf(TransformOrigin.Center) }
            val popupPositionProvider =
                remember(density, topWindowInsets) {
                    ExposedDropdownMenuPositionProvider(
                        density = density,
                        topWindowInsets = topWindowInsets,
                        keyboardSignalState = keyboardSignalState,
                    ) { anchorBounds, menuBounds ->
                        transformOriginState.value =
                            calculateTransformOrigin(anchorBounds, menuBounds)
                    }
                }

            Popup(
                onDismissRequest = onDismissRequest,
                popupPositionProvider = popupPositionProvider,
                properties = ExposedDropdownMenuDefaults.popupProperties(anchorType),
            ) {
                DropdownMenuContent(
                    expandedState = expandedState,
                    transformOriginState = transformOriginState,
                    scrollState = scrollState,
                    shadowElevation = shadowElevation,
                    colors = colors,
                    sizes = sizes,
                    header = null,
                    matchAnchorWidth = matchTextFieldWidth,
                    modifier = modifier.exposedDropdownSize(matchTextFieldWidth),
                    content = content,
                )
            }
        }
    }
}

// Sealed classes don't allow dynamic anonymous subclasses.
private abstract class ExposedDropdownMenuBoxScopeImpl : ExposedDropdownMenuBoxScope()

/** The type of element that can serve as a dropdown menu anchor. */
@JvmInline
value class MenuAnchorType private constructor(private val name: String) {
    companion object {
        /**
         * A non-editable primary anchor of the dropdown menu, such as a read-only text field.
         *
         * An anchor of this type will open the menu with focus.
         */
        val PrimaryNotEditable = MenuAnchorType("PrimaryNotEditable")

        /**
         * An editable primary anchor of the dropdown menu, such as a text field that allows user
         * input.
         *
         * An anchor of this type will open the menu without focus in order to preserve focus on the
         * soft keyboard (IME).
         */
        val PrimaryEditable = MenuAnchorType("PrimaryEditable")

        /**
         * A secondary anchor of the dropdown menu that lives alongside an editable primary anchor,
         * such as an icon within an editable text field.
         *
         * If accessibility services are enabled, an anchor of this type will open the menu with
         * focus. Otherwise, the menu is opened without focus in order to preserve focus on the soft
         * keyboard (IME).
         */
        val SecondaryEditable = MenuAnchorType("SecondaryEditable")
    }

    override fun toString(): String = name
}

/** Contains default values used by Exposed Dropdown Menu. */
object ExposedDropdownMenuDefaults {

    /**
     * Creates a [PopupProperties] used for [ExposedDropdownMenuBoxScope.ExposedDropdownMenu].
     *
     * @param anchorType the type of element that is anchoring the menu. See [MenuAnchorType].
     */
    @Composable
    internal fun popupProperties(anchorType: MenuAnchorType): PopupProperties {
        var flags =
            WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH or
                    WindowManager.LayoutParams.FLAG_ALT_FOCUSABLE_IM

        // In order for a11y focus to jump to the menu when opened, it needs to be
        // focusable and touch modal (NOT_FOCUSABLE and NOT_TOUCH_MODAL are *not* set).
        // If typing on the IME is required, the menu should not be focusable
        // in order to prevent stealing focus from the input method.
        val imeRequired =
            anchorType == MenuAnchorType.PrimaryEditable ||
                    (anchorType == MenuAnchorType.SecondaryEditable)
        if (imeRequired) {
            flags = flags or WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
        }

        return PopupProperties(flags = flags)
    }
}

@Stable
internal class ExposedDropdownMenuPositionProvider(
    val density: Density,
    val topWindowInsets: Int,
    val keyboardSignalState: State<Unit>? = null,
    verticalMargin: Int = with(density) { MenuVerticalMargin.roundToPx() },
    val onPositionCalculated: (anchorBounds: IntRect, menuBounds: IntRect) -> Unit = { _, _ -> }
) : PopupPositionProvider {
    // Horizontal position
    private val startToAnchorStart = MenuPosition.startToAnchorStart()
    private val endToAnchorEnd = MenuPosition.endToAnchorEnd()
    private val leftToWindowLeft = MenuPosition.leftToWindowLeft()
    private val rightToWindowRight = MenuPosition.rightToWindowRight()

    // Vertical position
    private val topToAnchorBottom = MenuPosition.topToAnchorBottom()
    private val bottomToAnchorTop = MenuPosition.bottomToAnchorTop()
    private val topToWindowTop = MenuPosition.topToWindowTop(margin = verticalMargin)
    private val bottomToWindowBottom = MenuPosition.bottomToWindowBottom(margin = verticalMargin)

    override fun calculatePosition(
        anchorBounds: IntRect,
        windowSize: IntSize,
        layoutDirection: LayoutDirection,
        popupContentSize: IntSize
    ): IntOffset {
        // Workaround for b/326394521
        // Read the state because we want any changes to the state to trigger recalculation.
        // See PopupLayout.snapshotStateObserver and PopupLayout.onCommitAffectingPopupPosition
        // for more info.
        keyboardSignalState?.value

        // Workaround for b/256233441
        // Popup fails to account for window insets so we do it here instead
        @Suppress("NAME_SHADOWING")
        val windowSize = IntSize(windowSize.width, windowSize.height + topWindowInsets)

        val xCandidates =
            listOf(
                startToAnchorStart,
                endToAnchorEnd,
                if (anchorBounds.center.x < windowSize.width / 2) {
                    leftToWindowLeft
                } else {
                    rightToWindowRight
                }
            )
        var x = 0
        for (index in xCandidates.indices) {
            val xCandidate =
                xCandidates[index].position(
                    anchorBounds = anchorBounds,
                    windowSize = windowSize,
                    menuWidth = popupContentSize.width,
                    layoutDirection = layoutDirection
                )
            if (
                index == xCandidates.lastIndex ||
                (xCandidate >= 0 && xCandidate + popupContentSize.width <= windowSize.width)
            ) {
                x = xCandidate
                break
            }
        }

        val yCandidates =
            listOf(
                topToAnchorBottom,
                bottomToAnchorTop,
                if (anchorBounds.center.y < windowSize.height / 2) {
                    topToWindowTop
                } else {
                    bottomToWindowBottom
                }
            )
        var y = 0
        for (index in yCandidates.indices) {
            val yCandidate =
                yCandidates[index].position(
                    anchorBounds = anchorBounds,
                    windowSize = windowSize,
                    menuHeight = popupContentSize.height
                )
            if (
                index == yCandidates.lastIndex ||
                (yCandidate >= 0 && yCandidate + popupContentSize.height <= windowSize.height)
            ) {
                y = yCandidate
                break
            }
        }

        val menuOffset = IntOffset(x, y)
        onPositionCalculated(
            /* anchorBounds = */ anchorBounds,
            /* menuBounds = */ IntRect(offset = menuOffset, size = popupContentSize)
        )
        return menuOffset
    }
}

private fun Modifier.expandable(
    expanded: Boolean,
    onExpandedChange: () -> Unit,
    anchorType: MenuAnchorType,
    keyboardController: SoftwareKeyboardController?,
) =
    pointerInput(onExpandedChange) {
        awaitEachGesture {
            // Modifier.clickable doesn't work for text fields, so we use Modifier.pointerInput
            // in the Initial pass to observe events before the text field consumes them
            // in the Main pass.
            val downEvent = awaitFirstDown(pass = PointerEventPass.Initial)
            if (anchorType == MenuAnchorType.SecondaryEditable) {
                downEvent.consume()
            }
            val upEvent = waitForUpOrCancellation(pass = PointerEventPass.Initial)
            if (upEvent != null) {
                onExpandedChange()
            }
        }
    }
        .semantics {
            role = if (anchorType == MenuAnchorType.SecondaryEditable) {
                Role.Button
            } else {
                Role.DropdownList
            }
            onClick {
                onExpandedChange()
                if (anchorType == MenuAnchorType.PrimaryEditable) {
                    keyboardController?.show()
                }
                true
            }
        }

private fun calculateMaxHeight(
    windowBounds: Rect,
    anchorBounds: Rect?,
    verticalMargin: Int,
): Int {
    anchorBounds ?: return 0

    val marginedWindowTop = windowBounds.top + verticalMargin
    val marginedWindowBottom = windowBounds.bottom - verticalMargin
    val availableHeight =
        if (anchorBounds.top > windowBounds.bottom || anchorBounds.bottom < windowBounds.top) {
            (marginedWindowBottom - marginedWindowTop).roundToInt()
        } else {
            val heightAbove = anchorBounds.top - marginedWindowTop
            val heightBelow = marginedWindowBottom - anchorBounds.bottom
            max(heightAbove, heightBelow).roundToInt()
        }

    return max(availableHeight, 0)
}

private fun View.getWindowBounds(): Rect =
    android.graphics.Rect().let {
        this.getWindowVisibleDisplayFrame(it)
        it.toComposeRect()
    }

private fun LayoutCoordinates?.getAnchorBounds(): Rect {
    // Don't use `boundsInWindow()` because it can report 0 when the window is animating/resizing
    return if (this == null) Rect.Zero else Rect(positionInWindow(), size.toSize())
}
