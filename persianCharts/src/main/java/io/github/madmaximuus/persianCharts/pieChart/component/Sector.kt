package io.github.madmaximuus.persianCharts.pieChart.component

import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.DrawScope.Companion.DefaultBlendMode
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Fill
import io.github.madmaximuus.persianCharts.pieChart.utils.coerceCorner
import io.github.madmaximuus.persianCharts.pieChart.utils.polarToCartesian

internal fun DrawScope.drawSector(
    color: Color,
    startAngle: Float,
    sweepAngle: Float,
    outerRadius: Float,
    innerRadius: Float,
    angularInset: Float,
    cornerRadius: Float,
    alpha: Float = 1.0f,
    style: DrawStyle = Fill,
    colorFilter: ColorFilter? = null,
    blendMode: BlendMode = DefaultBlendMode
) {
    val (topLeftCornerRadius, topLeftCornerTravelAngle) = coerceCorner(
        arcRadius = outerRadius,
        width = outerRadius - innerRadius,
        sweepAngle = sweepAngle,
        cornerRadius = cornerRadius,
        weightXAxis = 1f,
        weightYAxis = 1f
    )

    val (topRightCornerRadius, topRightCornerTravelAngle) = coerceCorner(
        arcRadius = outerRadius,
        width = outerRadius - innerRadius,
        sweepAngle = sweepAngle,
        cornerRadius = cornerRadius,
        weightXAxis = 1f,
        weightYAxis = 1f
    )

    val path = Path().apply {
        val outerStart = polarToCartesian(
            center = center,
            radius = outerRadius,
            angle = startAngle
        )
        val outerStartInner = polarToCartesian(
            center = center,
            radius = outerRadius - topLeftCornerRadius,
            angle = startAngle
        )
        val outerStartOuter = polarToCartesian(
            center = center,
            radius = outerRadius,
            angle = startAngle + topLeftCornerTravelAngle
        )

        val outerEnd = polarToCartesian(
            center = center,
            radius = outerRadius,
            angle = startAngle + sweepAngle
        )
        val outerEndInner = polarToCartesian(
            center = center,
            radius = outerRadius - topRightCornerRadius,
            angle = startAngle + sweepAngle
        )

        moveTo(x = outerStartInner.x, y = outerStartInner.y)

        quadraticTo(
            x1 = outerStart.x,
            y1 = outerStart.y,
            x2 = outerStartOuter.x,
            y2 = outerStartOuter.y
        )

        arcTo(
            rect = Rect(center = center, radius = outerRadius),
            startAngleDegrees = startAngle + topLeftCornerTravelAngle,
            sweepAngleDegrees = sweepAngle - (topLeftCornerTravelAngle + topRightCornerTravelAngle),
            forceMoveTo = false
        )

        quadraticTo(outerEnd.x, outerEnd.y, outerEndInner.x, outerEndInner.y)

        if (innerRadius > 0f) {

            val (bottomRightCornerRadius, bottomRightCornerTravelAngle) = coerceCorner(
                arcRadius = innerRadius,
                width = outerRadius - innerRadius,
                sweepAngle = sweepAngle,
                cornerRadius = cornerRadius,
                weightXAxis = 1f,
                weightYAxis = 1f
            )

            val (bottomLeftCornerRadius, bottomLeftCornerTravelAngle) = coerceCorner(
                arcRadius = innerRadius,
                width = outerRadius - innerRadius,
                sweepAngle = sweepAngle,
                cornerRadius = cornerRadius,
                weightXAxis = 1f,
                weightYAxis = 1f
            )

            val innerEnd = polarToCartesian(
                center = center,
                radius = innerRadius,
                angle = startAngle + sweepAngle
            )
            val innerEndOuter = polarToCartesian(
                center = center,
                radius = innerRadius + bottomRightCornerRadius,
                angle = startAngle + sweepAngle
            )
            val innerEndInner = polarToCartesian(
                center = center,
                radius = innerRadius,
                angle = startAngle + sweepAngle - bottomRightCornerTravelAngle
            )

            val innerStart = polarToCartesian(
                center = center,
                radius = innerRadius,
                angle = startAngle
            )
            val innerStartOuter = polarToCartesian(
                center = center,
                radius = innerRadius + bottomLeftCornerRadius,
                angle = startAngle
            )

            lineTo(x = innerEndOuter.x, y = innerEndOuter.y)

            quadraticTo(
                x1 = innerEnd.x,
                y1 = innerEnd.y,
                x2 = innerEndInner.x,
                y2 = innerEndInner.y
            )

            arcTo(
                rect = Rect(center = center, radius = innerRadius),
                startAngleDegrees = startAngle + sweepAngle - bottomRightCornerTravelAngle,
                sweepAngleDegrees = -(sweepAngle - (bottomRightCornerTravelAngle + bottomLeftCornerTravelAngle)),
                forceMoveTo = false
            )

            quadraticTo(
                x1 = innerStart.x,
                y1 = innerStart.y,
                x2 = innerStartOuter.x,
                y2 = innerStartOuter.y
            )

            lineTo(x = outerStartInner.x, y = outerStartInner.y)
        } else {

            val midAngle = startAngle + sweepAngle / 2f
            val vertex = polarToCartesian(
                center = center,
                radius = angularInset,
                angle = midAngle
            )

            lineTo(x = vertex.x, y = vertex.y)
            close()
        }
    }

    drawPath(
        path = path,
        color = color,
        style = style,
        alpha = alpha,
        colorFilter = colorFilter,
        blendMode = blendMode
    )
}