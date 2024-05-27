package io.github.madmaximuus.persianSymbols.foundation

import androidx.compose.ui.graphics.vector.ImageVector
import io.github.madmaximuus.persianSymbols.address.book.AddressBook
import io.github.madmaximuus.persianSymbols.address.card.arrowDown.bottom.AddressCardArrowDownBottom
import io.github.madmaximuus.persianSymbols.address.card.arrowUp.top.AddressCardArrowUpTop
import io.github.madmaximuus.persianSymbols.address.card.bars.AddressCardBars
import io.github.madmaximuus.persianSymbols.address.card.email.AddressCardEmail
import io.github.madmaximuus.persianSymbols.arrow.down.base.ArrowDown
import io.github.madmaximuus.persianSymbols.arrow.down.circle.ArrowDownCircle
import io.github.madmaximuus.persianSymbols.arrow.down.toBracket.ArrowDownToBracket
import io.github.madmaximuus.persianSymbols.arrow.left.arrowRight.ArrowLeftArrowRight
import io.github.madmaximuus.persianSymbols.arrow.left.base.ArrowLeft
import io.github.madmaximuus.persianSymbols.arrow.left.circle.ArrowLeftCircle
import io.github.madmaximuus.persianSymbols.arrow.left.down.arrowRightUp.fromCenter.ArrowLeftDownArrowRightUpFromCenter
import io.github.madmaximuus.persianSymbols.arrow.right.base.ArrowRight
import io.github.madmaximuus.persianSymbols.arrow.right.circle.ArrowRightCircle
import io.github.madmaximuus.persianSymbols.arrow.right.fromBracket.ArrowRightFromBracket
import io.github.madmaximuus.persianSymbols.arrow.right.rotate.ArrowRightRotate
import io.github.madmaximuus.persianSymbols.arrow.right.toBracket.ArrowRightToBracket
import io.github.madmaximuus.persianSymbols.arrow.right.up.fromBox.ArrowRightUpFromBox
import io.github.madmaximuus.persianSymbols.arrow.trend.down.ArrowTrendDown
import io.github.madmaximuus.persianSymbols.arrow.trend.up.ArrowTrendUp
import io.github.madmaximuus.persianSymbols.arrow.up.base.ArrowUp
import io.github.madmaximuus.persianSymbols.arrow.up.circle.ArrowUpCircle
import io.github.madmaximuus.persianSymbols.arrow.up.fromBracket.ArrowUpFromBracket
import io.github.madmaximuus.persianSymbols.at.At
import io.github.madmaximuus.persianSymbols.backward.base.Backward
import io.github.madmaximuus.persianSymbols.backward.fast.BackwardFast
import io.github.madmaximuus.persianSymbols.backward.five.Backward5
import io.github.madmaximuus.persianSymbols.backward.step.BackwardStep
import io.github.madmaximuus.persianSymbols.backward.ten.Backward10
import io.github.madmaximuus.persianSymbols.backward.thirty.Backward30
import io.github.madmaximuus.persianSymbols.ban.Ban
import io.github.madmaximuus.persianSymbols.bars.base.Bars
import io.github.madmaximuus.persianSymbols.bars.filter.base.BarsFilter
import io.github.madmaximuus.persianSymbols.bars.filter.slash.BarsFilterSlash
import io.github.madmaximuus.persianSymbols.bars.sort.BarsSort
import io.github.madmaximuus.persianSymbols.battery.empty.base.BatteryEmpty
import io.github.madmaximuus.persianSymbols.battery.empty.bolt.BatteryEmptyBolt
import io.github.madmaximuus.persianSymbols.battery.exclamation.BatteryExclamation
import io.github.madmaximuus.persianSymbols.battery.five.base.Battery5
import io.github.madmaximuus.persianSymbols.battery.five.bolt.Battery5Bolt
import io.github.madmaximuus.persianSymbols.battery.four.base.Battery4
import io.github.madmaximuus.persianSymbols.battery.four.bolt.Battery4Bolt
import io.github.madmaximuus.persianSymbols.battery.full.base.BatteryFull
import io.github.madmaximuus.persianSymbols.battery.full.bolt.BatteryFullBolt
import io.github.madmaximuus.persianSymbols.battery.one.base.Battery1
import io.github.madmaximuus.persianSymbols.battery.one.bolt.Battery1Bolt
import io.github.madmaximuus.persianSymbols.battery.question.BatteryQuestion
import io.github.madmaximuus.persianSymbols.battery.six.base.Battery6
import io.github.madmaximuus.persianSymbols.battery.six.bolt.Battery6Bolt
import io.github.madmaximuus.persianSymbols.battery.three.base.Battery3
import io.github.madmaximuus.persianSymbols.battery.three.bolt.Battery3Bolt
import io.github.madmaximuus.persianSymbols.battery.two.base.Battery2
import io.github.madmaximuus.persianSymbols.battery.two.bolt.Battery2Bolt
import io.github.madmaximuus.persianSymbols.bell.base.Bell
import io.github.madmaximuus.persianSymbols.bell.exclamation.BellExclamation
import io.github.madmaximuus.persianSymbols.bell.on.BellOn
import io.github.madmaximuus.persianSymbols.bluetooth.base.Bluetooth
import io.github.madmaximuus.persianSymbols.bluetooth.connected.BluetoothConnected
import io.github.madmaximuus.persianSymbols.bluetooth.scan.BluetoothScan
import io.github.madmaximuus.persianSymbols.bluetooth.slash.BluetoothSlash
import io.github.madmaximuus.persianSymbols.bolt.base.Bolt
import io.github.madmaximuus.persianSymbols.bolt.circle.BoltCircle
import io.github.madmaximuus.persianSymbols.bookmark.Bookmark
import io.github.madmaximuus.persianSymbols.bookmarks.Bookmarks
import io.github.madmaximuus.persianSymbols.box.Box
import io.github.madmaximuus.persianSymbols.brightness.auto.BrightnessAuto
import io.github.madmaximuus.persianSymbols.brightness.exclamation.BrightnessExclamation
import io.github.madmaximuus.persianSymbols.brightness.high.BrightnessHigh
import io.github.madmaximuus.persianSymbols.brightness.low.BrightnessLow
import io.github.madmaximuus.persianSymbols.brightness.medium.BrightnessMedium
import io.github.madmaximuus.persianSymbols.building.columns.BuildingColumns
import io.github.madmaximuus.persianSymbols.calendar.base.Calendar
import io.github.madmaximuus.persianSymbols.calendar.check.CalendarCheck
import io.github.madmaximuus.persianSymbols.calendar.day.CalendarDay
import io.github.madmaximuus.persianSymbols.calendar.days.CalendarDays
import io.github.madmaximuus.persianSymbols.calendar.event.CalendarEvent
import io.github.madmaximuus.persianSymbols.calendar.range.CalendarRange
import io.github.madmaximuus.persianSymbols.camera.base.Camera
import io.github.madmaximuus.persianSymbols.camera.plus.CameraPlus
import io.github.madmaximuus.persianSymbols.camera.video.base.CameraVideo
import io.github.madmaximuus.persianSymbols.camera.video.plus.CameraVideoPlus
import io.github.madmaximuus.persianSymbols.camera.video.slash.CameraVideoSlash
import io.github.madmaximuus.persianSymbols.caretDown.base.CaretDown
import io.github.madmaximuus.persianSymbols.caretDown.circle.CaretDownCircle
import io.github.madmaximuus.persianSymbols.caretLeft.base.CaretLeft
import io.github.madmaximuus.persianSymbols.caretRight.CaretRight
import io.github.madmaximuus.persianSymbols.caretUp.CaretUp
import io.github.madmaximuus.persianSymbols.cart.shopping.CartShopping
import io.github.madmaximuus.persianSymbols.category.Category
import io.github.madmaximuus.persianSymbols.chart.donut.simple.ChartDonutSimple
import io.github.madmaximuus.persianSymbols.check.badge.CheckBadge
import io.github.madmaximuus.persianSymbols.check.base.Check
import io.github.madmaximuus.persianSymbols.check.box.CheckBox
import io.github.madmaximuus.persianSymbols.check.circle.CheckCircle
import io.github.madmaximuus.persianSymbols.check.double.CheckDouble
import io.github.madmaximuus.persianSymbols.check.line.CheckLine
import io.github.madmaximuus.persianSymbols.chevronDown.base.ChevronDown
import io.github.madmaximuus.persianSymbols.chevronDown.circle.ChevronDownCircle
import io.github.madmaximuus.persianSymbols.chevronLeft.base.ChevronLeft
import io.github.madmaximuus.persianSymbols.chevronLeft.toLine.ChevronLeftToLine
import io.github.madmaximuus.persianSymbols.chevronRight.base.ChevronRight
import io.github.madmaximuus.persianSymbols.chevronRight.toLine.ChevronRightToLine
import io.github.madmaximuus.persianSymbols.chevronUp.base.ChevronUp
import io.github.madmaximuus.persianSymbols.chevronUp.circle.ChevronUpCircle
import io.github.madmaximuus.persianSymbols.circle.base.Circle
import io.github.madmaximuus.persianSymbols.circle.dot.CircleDot
import io.github.madmaximuus.persianSymbols.clock.alarm.ClockAlarm
import io.github.madmaximuus.persianSymbols.clock.base.Clock
import io.github.madmaximuus.persianSymbols.clock.rotate.left.ClockRotateLeft
import io.github.madmaximuus.persianSymbols.clock.rotate.right.ClockRotateRight
import io.github.madmaximuus.persianSymbols.clock.timer.ClockTimer
import io.github.madmaximuus.persianSymbols.code.Code
import io.github.madmaximuus.persianSymbols.comment.bars.CommentBars
import io.github.madmaximuus.persianSymbols.comment.plus.CommentPlus
import io.github.madmaximuus.persianSymbols.compress.Compress
import io.github.madmaximuus.persianSymbols.creditCard.CreditCard
import io.github.madmaximuus.persianSymbols.delete.left.DeleteLeft
import io.github.madmaximuus.persianSymbols.device.computer.arrowDown.top.DeviceComputerArrowDownTop
import io.github.madmaximuus.persianSymbols.device.computer.mac.DeviceComputerMac
import io.github.madmaximuus.persianSymbols.device.computer.unknown.DeviceComputerUnknown
import io.github.madmaximuus.persianSymbols.device.computer.windows.DeviceComputerWindows
import io.github.madmaximuus.persianSymbols.device.laptop.macbook.DeviceLaptopMacbook
import io.github.madmaximuus.persianSymbols.device.laptop.unknown.DeviceLaptopUnknown
import io.github.madmaximuus.persianSymbols.device.laptop.windows.DeviceLaptopWindows
import io.github.madmaximuus.persianSymbols.device.mobile.android.DeviceMobileAndroid
import io.github.madmaximuus.persianSymbols.device.mobile.arrowDown.top.DeviceMobileArrowDownTop
import io.github.madmaximuus.persianSymbols.device.mobile.iPhone.one.DeviceMobileIPhone1
import io.github.madmaximuus.persianSymbols.device.mobile.iPhone.three.DeviceMobileIPhone3
import io.github.madmaximuus.persianSymbols.device.mobile.iPhone.two.DeviceMobileIPhone2
import io.github.madmaximuus.persianSymbols.device.mobile.unknown.DeviceMobileUnknown
import io.github.madmaximuus.persianSymbols.device.tablet.android.DeviceTabletAndroid
import io.github.madmaximuus.persianSymbols.device.tablet.iPad.DeviceTabletIPad
import io.github.madmaximuus.persianSymbols.device.tablet.unknown.DeviceTabletUnknown
import io.github.madmaximuus.persianSymbols.device.tv.DeviceTv
import io.github.madmaximuus.persianSymbols.devices.Devices
import io.github.madmaximuus.persianSymbols.dollar.rectangle.DollarRectangle
import io.github.madmaximuus.persianSymbols.dollar.rotate.DollarRotate
import io.github.madmaximuus.persianSymbols.ellepsis.grid.EllipsisGrid
import io.github.madmaximuus.persianSymbols.ellepsis.horiz.EllipsisHoriz
import io.github.madmaximuus.persianSymbols.ellepsis.vert.EllipsisVert
import io.github.madmaximuus.persianSymbols.envelope.arrowRight.bottom.EnvelopeArrowRightBottom
import io.github.madmaximuus.persianSymbols.envelope.base.Envelope
import io.github.madmaximuus.persianSymbols.envelope.check.EnvelopeCheck
import io.github.madmaximuus.persianSymbols.envelope.dot.EnvelopeDot
import io.github.madmaximuus.persianSymbols.envelope.lock.EnvelopeLock
import io.github.madmaximuus.persianSymbols.envelope.paperClip.EnvelopePaperClip
import io.github.madmaximuus.persianSymbols.envelope.pen.EnvelopePen
import io.github.madmaximuus.persianSymbols.equalizer.Equalizer
import io.github.madmaximuus.persianSymbols.exclamation.base.Exclamation
import io.github.madmaximuus.persianSymbols.exclamation.circle.ExclamationCircle
import io.github.madmaximuus.persianSymbols.exclamation.octagon.ExclamationOctagon
import io.github.madmaximuus.persianSymbols.expend.Expend
import io.github.madmaximuus.persianSymbols.eye.base.Eye
import io.github.madmaximuus.persianSymbols.eye.slash.EyeSlash
import io.github.madmaximuus.persianSymbols.file.File
import io.github.madmaximuus.persianSymbols.flashlight.base.Flashlight
import io.github.madmaximuus.persianSymbols.flashlight.slash.FlashlightSlash
import io.github.madmaximuus.persianSymbols.forward.base.Forward
import io.github.madmaximuus.persianSymbols.forward.fast.ForwardFast
import io.github.madmaximuus.persianSymbols.forward.five.Forward5
import io.github.madmaximuus.persianSymbols.forward.step.ForwardStep
import io.github.madmaximuus.persianSymbols.forward.ten.Forward10
import io.github.madmaximuus.persianSymbols.forward.thirty.Forward30
import io.github.madmaximuus.persianSymbols.gear.Gear
import io.github.madmaximuus.persianSymbols.globe.Globe
import io.github.madmaximuus.persianSymbols.gripDotsVertical.GripDotsVertical
import io.github.madmaximuus.persianSymbols.heart.Heart
import io.github.madmaximuus.persianSymbols.house.House
import io.github.madmaximuus.persianSymbols.hub.Hub
import io.github.madmaximuus.persianSymbols.image.base.Image
import io.github.madmaximuus.persianSymbols.image.dashed.ImageDashed
import io.github.madmaximuus.persianSymbols.info.circle.InfoCircle
import io.github.madmaximuus.persianSymbols.key.Key
import io.github.madmaximuus.persianSymbols.keyboard.Keyboard
import io.github.madmaximuus.persianSymbols.link.simple.base.LinkSimple
import io.github.madmaximuus.persianSymbols.link.simple.slash.LinkSimpleSlash
import io.github.madmaximuus.persianSymbols.location.dot.base.LocationDot
import io.github.madmaximuus.persianSymbols.location.dot.slash.LocationDotSlash
import io.github.madmaximuus.persianSymbols.lock.Lock
import io.github.madmaximuus.persianSymbols.magnifyingGlass.MagnifyingGlass
import io.github.madmaximuus.persianSymbols.message.bars.MessageBars
import io.github.madmaximuus.persianSymbols.message.base.Message
import io.github.madmaximuus.persianSymbols.message.check.MessageCheck
import io.github.madmaximuus.persianSymbols.message.exclamation.MessageExclamation
import io.github.madmaximuus.persianSymbols.message.question.MessageQuestion
import io.github.madmaximuus.persianSymbols.message.sms.MessageSms
import io.github.madmaximuus.persianSymbols.mic.base.Mic
import io.github.madmaximuus.persianSymbols.mic.slash.MicSlash
import io.github.madmaximuus.persianSymbols.minus.base.Minus
import io.github.madmaximuus.persianSymbols.minus.box.MinusBox
import io.github.madmaximuus.persianSymbols.minus.circle.MinusCircle
import io.github.madmaximuus.persianSymbols.moon.Moon
import io.github.madmaximuus.persianSymbols.newLabel.rectangle.NewRectangle
import io.github.madmaximuus.persianSymbols.nfc.Nfc
import io.github.madmaximuus.persianSymbols.pallete.Palette
import io.github.madmaximuus.persianSymbols.paperClip.PaperClip
import io.github.madmaximuus.persianSymbols.paperPlane.base.PaperPlane
import io.github.madmaximuus.persianSymbols.paperPlane.check.PaperPlaneCheck
import io.github.madmaximuus.persianSymbols.paperPlane.xmark.PaperPlaneXMark
import io.github.madmaximuus.persianSymbols.password.rectangle.PasswordRectangle
import io.github.madmaximuus.persianSymbols.pause.base.Pause
import io.github.madmaximuus.persianSymbols.pause.circle.PauseCircle
import io.github.madmaximuus.persianSymbols.pen.Pen
import io.github.madmaximuus.persianSymbols.phone.base.Phone
import io.github.madmaximuus.persianSymbols.phone.call.PhoneCall
import io.github.madmaximuus.persianSymbols.piggyBank.PiggyBank
import io.github.madmaximuus.persianSymbols.pin.Pin
import io.github.madmaximuus.persianSymbols.pinCode.rectangle.PinCodeRectangle
import io.github.madmaximuus.persianSymbols.play.base.Play
import io.github.madmaximuus.persianSymbols.play.circle.PlayCircle
import io.github.madmaximuus.persianSymbols.play.pause.PlayPause
import io.github.madmaximuus.persianSymbols.plus.base.Plus
import io.github.madmaximuus.persianSymbols.plus.box.PlusBox
import io.github.madmaximuus.persianSymbols.plus.circle.PlusCircle
import io.github.madmaximuus.persianSymbols.podcasts.Podcasts
import io.github.madmaximuus.persianSymbols.powerOnOff.PowerOnOff
import io.github.madmaximuus.persianSymbols.question.base.Question
import io.github.madmaximuus.persianSymbols.question.box.QuestionBox
import io.github.madmaximuus.persianSymbols.question.circle.QuestionCircle
import io.github.madmaximuus.persianSymbols.question.tooltip.QuestionTooltip
import io.github.madmaximuus.persianSymbols.radar.Radar
import io.github.madmaximuus.persianSymbols.redo.Redo
import io.github.madmaximuus.persianSymbols.repeat.base.Repeat
import io.github.madmaximuus.persianSymbols.repeat.one.Repeat1
import io.github.madmaximuus.persianSymbols.reply.all.ReplyAll
import io.github.madmaximuus.persianSymbols.reply.base.Reply
import io.github.madmaximuus.persianSymbols.resume.Resume
import io.github.madmaximuus.persianSymbols.review.Review
import io.github.madmaximuus.persianSymbols.rotate.Rotate
import io.github.madmaximuus.persianSymbols.rss.Rss
import io.github.madmaximuus.persianSymbols.share.all.ShareAll
import io.github.madmaximuus.persianSymbols.share.nodes.ShareNodes
import io.github.madmaximuus.persianSymbols.shield.check.ShieldCheck
import io.github.madmaximuus.persianSymbols.shield.exclamation.ShieldExclamation
import io.github.madmaximuus.persianSymbols.shield.xmark.ShieldXMark
import io.github.madmaximuus.persianSymbols.shufle.Shuffle
import io.github.madmaximuus.persianSymbols.sigmal.exclamation.SignalExclamation
import io.github.madmaximuus.persianSymbols.sigmal.one.Signal1
import io.github.madmaximuus.persianSymbols.sigmal.stream.base.SignalStream
import io.github.madmaximuus.persianSymbols.sigmal.stream.slash.SignalStreamSlash
import io.github.madmaximuus.persianSymbols.sigmal.three.Signal3
import io.github.madmaximuus.persianSymbols.sigmal.two.base.Signal2
import io.github.madmaximuus.persianSymbols.sigmal.xmark.SignalXMark
import io.github.madmaximuus.persianSymbols.speech.Speech
import io.github.madmaximuus.persianSymbols.star.Star
import io.github.madmaximuus.persianSymbols.sun.Sun
import io.github.madmaximuus.persianSymbols.tag.base.Tag
import io.github.madmaximuus.persianSymbols.tag.slash.TagSlash
import io.github.madmaximuus.persianSymbols.tag.two.Tag2
import io.github.madmaximuus.persianSymbols.thumb.down.ThumbDown
import io.github.madmaximuus.persianSymbols.thumb.up.ThumbUp
import io.github.madmaximuus.persianSymbols.toggle.off.ToggleOff
import io.github.madmaximuus.persianSymbols.toggle.on.ToggleOn
import io.github.madmaximuus.persianSymbols.trash.arrowUp.TrashArrowUp
import io.github.madmaximuus.persianSymbols.trash.base.Trash
import io.github.madmaximuus.persianSymbols.trash.xMark.TrashXMark
import io.github.madmaximuus.persianSymbols.undo.Undo
import io.github.madmaximuus.persianSymbols.unlock.Unlock
import io.github.madmaximuus.persianSymbols.user.base.User
import io.github.madmaximuus.persianSymbols.user.box.base.UserBox
import io.github.madmaximuus.persianSymbols.user.box.dashed.UserBoxDashed
import io.github.madmaximuus.persianSymbols.user.gear.UserGear
import io.github.madmaximuus.persianSymbols.user.magnifyingGlass.UserMagnifyingGlass
import io.github.madmaximuus.persianSymbols.user.minus.UserMinus
import io.github.madmaximuus.persianSymbols.user.pen.UserPen
import io.github.madmaximuus.persianSymbols.user.plus.UserPlus
import io.github.madmaximuus.persianSymbols.volume.high.VolumeHigh
import io.github.madmaximuus.persianSymbols.volume.low.VolumeLow
import io.github.madmaximuus.persianSymbols.volume.off.VolumeOff
import io.github.madmaximuus.persianSymbols.volume.slash.VolumeSlash
import io.github.madmaximuus.persianSymbols.volume.xmark.VolumeXMark
import io.github.madmaximuus.persianSymbols.wallet.Wallet
import io.github.madmaximuus.persianSymbols.warning.Warning
import io.github.madmaximuus.persianSymbols.wifi.base.Wifi
import io.github.madmaximuus.persianSymbols.wifi.exclamation.WifiExclamation
import io.github.madmaximuus.persianSymbols.wifi.one.Wifi1
import io.github.madmaximuus.persianSymbols.wifi.slash.WifiSlash
import io.github.madmaximuus.persianSymbols.wifi.speed.WifiSpeed
import io.github.madmaximuus.persianSymbols.wifi.three.Wifi3
import io.github.madmaximuus.persianSymbols.wifi.two.Wifi2
import io.github.madmaximuus.persianSymbols.xmark.base.XMark
import io.github.madmaximuus.persianSymbols.xmark.circle.XMarkCircle
import io.github.madmaximuus.persianSymbols.xmark.octagon.XMarkOctagon

fun PersianSymbols.Default.getAllIcons(): List<ImageVector> {
    return listOf(
        PersianSymbols.Default.AddressBook,
        PersianSymbols.Default.AddressCardArrowDownBottom,
        PersianSymbols.Default.AddressCardArrowUpTop,
        PersianSymbols.Default.AddressCardBars,
        PersianSymbols.Default.AddressCardEmail,
        PersianSymbols.Default.ArrowDown,
        PersianSymbols.Default.ArrowDownCircle,
        PersianSymbols.Default.ArrowDownToBracket,
        PersianSymbols.Default.ArrowLeftArrowRight,
        PersianSymbols.Default.ArrowLeft,
        PersianSymbols.Default.ArrowLeftCircle,
        PersianSymbols.Default.ArrowLeftDownArrowRightUpFromCenter,
        PersianSymbols.Default.ArrowRight,
        PersianSymbols.Default.ArrowRightCircle,
        PersianSymbols.Default.ArrowRightFromBracket,
        PersianSymbols.Default.ArrowRightRotate,
        PersianSymbols.Default.ArrowRightToBracket,
        PersianSymbols.Default.ArrowRightUpFromBox,
        PersianSymbols.Default.ArrowTrendUp,
        PersianSymbols.Default.ArrowTrendDown,
        PersianSymbols.Default.ArrowUp,
        PersianSymbols.Default.ArrowUpCircle,
        PersianSymbols.Default.ArrowUpFromBracket,
        PersianSymbols.Default.At,
        PersianSymbols.Default.Backward,
        PersianSymbols.Default.BackwardFast,
        PersianSymbols.Default.Backward5,
        PersianSymbols.Default.BackwardStep,
        PersianSymbols.Default.Backward10,
        PersianSymbols.Default.Backward30,
        PersianSymbols.Default.Ban,
        PersianSymbols.Default.Bars,
        PersianSymbols.Default.BarsFilter,
        PersianSymbols.Default.BarsFilterSlash,
        PersianSymbols.Default.BarsSort,
        PersianSymbols.Default.BatteryEmpty,
        PersianSymbols.Default.BatteryEmptyBolt,
        PersianSymbols.Default.BatteryExclamation,
        PersianSymbols.Default.Battery5,
        PersianSymbols.Default.Battery5Bolt,
        PersianSymbols.Default.Battery4,
        PersianSymbols.Default.Battery4Bolt,
        PersianSymbols.Default.BatteryFull,
        PersianSymbols.Default.BatteryFullBolt,
        PersianSymbols.Default.Battery1,
        PersianSymbols.Default.Battery1Bolt,
        PersianSymbols.Default.BatteryQuestion,
        PersianSymbols.Default.Battery6,
        PersianSymbols.Default.Battery6Bolt,
        PersianSymbols.Default.Battery3,
        PersianSymbols.Default.Battery3Bolt,
        PersianSymbols.Default.Battery2,
        PersianSymbols.Default.Battery2Bolt,
        PersianSymbols.Default.Bell,
        PersianSymbols.Default.BellExclamation,
        PersianSymbols.Default.BellOn,
        PersianSymbols.Default.Bluetooth,
        PersianSymbols.Default.BluetoothConnected,
        PersianSymbols.Default.BluetoothScan,
        PersianSymbols.Default.BluetoothSlash,
        PersianSymbols.Default.Bolt,
        PersianSymbols.Default.BoltCircle,
        PersianSymbols.Default.Bookmark,
        PersianSymbols.Default.Bookmarks,
        PersianSymbols.Default.Box,
        PersianSymbols.Default.BrightnessAuto,
        PersianSymbols.Default.BrightnessExclamation,
        PersianSymbols.Default.BrightnessHigh,
        PersianSymbols.Default.BrightnessLow,
        PersianSymbols.Default.BrightnessMedium,
        PersianSymbols.Default.BuildingColumns,
        PersianSymbols.Default.Calendar,
        PersianSymbols.Default.CalendarCheck,
        PersianSymbols.Default.CalendarDay,
        PersianSymbols.Default.CalendarDays,
        PersianSymbols.Default.CalendarEvent,
        PersianSymbols.Default.CalendarRange,
        PersianSymbols.Default.Camera,
        PersianSymbols.Default.CameraPlus,
        PersianSymbols.Default.CameraVideo,
        PersianSymbols.Default.CameraVideoPlus,
        PersianSymbols.Default.CameraVideoSlash,
        PersianSymbols.Default.CaretDown,
        PersianSymbols.Default.CaretDownCircle,
        PersianSymbols.Default.CaretLeft,
        PersianSymbols.Default.CaretRight,
        PersianSymbols.Default.CaretUp,
        PersianSymbols.Default.CartShopping,
        PersianSymbols.Default.Category,
        PersianSymbols.Default.ChartDonutSimple,
        PersianSymbols.Default.Check,
        PersianSymbols.Default.CheckBadge,
        PersianSymbols.Default.CheckBox,
        PersianSymbols.Default.CheckCircle,
        PersianSymbols.Default.CheckDouble,
        PersianSymbols.Default.CheckLine,
        PersianSymbols.Default.ChevronDown,
        PersianSymbols.Default.ChevronDownCircle,
        PersianSymbols.Default.ChevronLeft,
        PersianSymbols.Default.ChevronLeftToLine,
        PersianSymbols.Default.ChevronRight,
        PersianSymbols.Default.ChevronRightToLine,
        PersianSymbols.Default.ChevronUp,
        PersianSymbols.Default.ChevronUpCircle,
        PersianSymbols.Default.Circle,
        PersianSymbols.Default.CircleDot,
        PersianSymbols.Default.Clock,
        PersianSymbols.Default.ClockAlarm,
        PersianSymbols.Default.ClockRotateLeft,
        PersianSymbols.Default.ClockRotateRight,
        PersianSymbols.Default.ClockTimer,
        PersianSymbols.Default.ClockTimer,
        PersianSymbols.Default.Code,
        PersianSymbols.Default.CommentBars,
        PersianSymbols.Default.CommentPlus,
        PersianSymbols.Default.Compress,
        PersianSymbols.Default.CreditCard,
        PersianSymbols.Default.DeleteLeft,
        PersianSymbols.Default.DeviceComputerArrowDownTop,
        PersianSymbols.Default.DeviceComputerMac,
        PersianSymbols.Default.DeviceComputerUnknown,
        PersianSymbols.Default.DeviceComputerWindows,
        PersianSymbols.Default.DeviceLaptopMacbook,
        PersianSymbols.Default.DeviceLaptopUnknown,
        PersianSymbols.Default.DeviceLaptopWindows,
        PersianSymbols.Default.DeviceMobileArrowDownTop,
        PersianSymbols.Default.DeviceMobileAndroid,
        PersianSymbols.Default.DeviceMobileIPhone1,
        PersianSymbols.Default.DeviceMobileIPhone2,
        PersianSymbols.Default.DeviceMobileIPhone3,
        PersianSymbols.Default.DeviceMobileUnknown,
        PersianSymbols.Default.DeviceTabletAndroid,
        PersianSymbols.Default.DeviceTabletIPad,
        PersianSymbols.Default.DeviceTabletUnknown,
        PersianSymbols.Default.DeviceTv,
        PersianSymbols.Default.Devices,
        PersianSymbols.Default.DollarRectangle,
        PersianSymbols.Default.DollarRotate,
        PersianSymbols.Default.EllipsisGrid,
        PersianSymbols.Default.EllipsisHoriz,
        PersianSymbols.Default.EllipsisVert,
        PersianSymbols.Default.Envelope,
        PersianSymbols.Default.EnvelopeArrowRightBottom,
        PersianSymbols.Default.EnvelopeCheck,
        PersianSymbols.Default.EnvelopeDot,
        PersianSymbols.Default.EnvelopeLock,
        PersianSymbols.Default.EnvelopePaperClip,
        PersianSymbols.Default.EnvelopePen,
        PersianSymbols.Default.Equalizer,
        PersianSymbols.Default.Exclamation,
        PersianSymbols.Default.ExclamationCircle,
        PersianSymbols.Default.ExclamationOctagon,
        PersianSymbols.Default.Expend,
        PersianSymbols.Default.Eye,
        PersianSymbols.Default.EyeSlash,
        PersianSymbols.Default.File,
        PersianSymbols.Default.Flashlight,
        PersianSymbols.Default.FlashlightSlash,
        PersianSymbols.Default.Forward,
        PersianSymbols.Default.ForwardFast,
        PersianSymbols.Default.Forward5,
        PersianSymbols.Default.ForwardStep,
        PersianSymbols.Default.Forward10,
        PersianSymbols.Default.Forward30,
        PersianSymbols.Default.Gear,
        PersianSymbols.Default.Globe,
        PersianSymbols.Default.GripDotsVertical,
        PersianSymbols.Default.Heart,
        PersianSymbols.Default.House,
        PersianSymbols.Default.Hub,
        PersianSymbols.Default.Image,
        PersianSymbols.Default.ImageDashed,
        PersianSymbols.Default.InfoCircle,
        PersianSymbols.Default.Key,
        PersianSymbols.Default.Keyboard,
        PersianSymbols.Default.LinkSimple,
        PersianSymbols.Default.LinkSimpleSlash,
        PersianSymbols.Default.LocationDot,
        PersianSymbols.Default.LocationDotSlash,
        PersianSymbols.Default.Lock,
        PersianSymbols.Default.MagnifyingGlass,
        PersianSymbols.Default.Message,
        PersianSymbols.Default.MessageBars,
        PersianSymbols.Default.MessageCheck,
        PersianSymbols.Default.MessageExclamation,
        PersianSymbols.Default.MessageQuestion,
        PersianSymbols.Default.MessageSms,
        PersianSymbols.Default.Mic,
        PersianSymbols.Default.MicSlash,
        PersianSymbols.Default.Minus,
        PersianSymbols.Default.MinusBox,
        PersianSymbols.Default.MinusCircle,
        PersianSymbols.Default.Moon,
        PersianSymbols.Default.NewRectangle,
        PersianSymbols.Default.Nfc,
        PersianSymbols.Default.Palette,
        PersianSymbols.Default.PaperClip,
        PersianSymbols.Default.PaperPlane,
        PersianSymbols.Default.PaperPlaneCheck,
        PersianSymbols.Default.PaperPlaneXMark,
        PersianSymbols.Default.PasswordRectangle,
        PersianSymbols.Default.Pause,
        PersianSymbols.Default.PauseCircle,
        PersianSymbols.Default.Pen,
        PersianSymbols.Default.Phone,
        PersianSymbols.Default.PhoneCall,
        PersianSymbols.Default.PiggyBank,
        PersianSymbols.Default.Pin,
        PersianSymbols.Default.PinCodeRectangle,
        PersianSymbols.Default.Play,
        PersianSymbols.Default.PlayCircle,
        PersianSymbols.Default.PlayPause,
        PersianSymbols.Default.Plus,
        PersianSymbols.Default.PlusBox,
        PersianSymbols.Default.PlusCircle,
        PersianSymbols.Default.Podcasts,
        PersianSymbols.Default.PowerOnOff,
        PersianSymbols.Default.Question,
        PersianSymbols.Default.QuestionBox,
        PersianSymbols.Default.QuestionCircle,
        PersianSymbols.Default.QuestionTooltip,
        PersianSymbols.Default.Radar,
        PersianSymbols.Default.Redo,
        PersianSymbols.Default.Repeat,
        PersianSymbols.Default.Repeat1,
        PersianSymbols.Default.Reply,
        PersianSymbols.Default.ReplyAll,
        PersianSymbols.Default.Resume,
        PersianSymbols.Default.Review,
        PersianSymbols.Default.Rotate,
        PersianSymbols.Default.Rss,
        PersianSymbols.Default.ShareAll,
        PersianSymbols.Default.ShareNodes,
        PersianSymbols.Default.ShieldCheck,
        PersianSymbols.Default.ShieldExclamation,
        PersianSymbols.Default.ShieldXMark,
        PersianSymbols.Default.Shuffle,
        PersianSymbols.Default.Signal1,
        PersianSymbols.Default.Signal2,
        PersianSymbols.Default.Signal3,
        PersianSymbols.Default.SignalExclamation,
        PersianSymbols.Default.SignalStream,
        PersianSymbols.Default.SignalStreamSlash,
        PersianSymbols.Default.SignalXMark,
        PersianSymbols.Default.Speech,
        PersianSymbols.Default.Star,
        PersianSymbols.Default.Sun,
        PersianSymbols.Default.Tag,
        PersianSymbols.Default.Tag2,
        PersianSymbols.Default.TagSlash,
        PersianSymbols.Default.ThumbDown,
        PersianSymbols.Default.ThumbUp,
        PersianSymbols.Default.ToggleOff,
        PersianSymbols.Default.ToggleOn,
        PersianSymbols.Default.Trash,
        PersianSymbols.Default.TrashArrowUp,
        PersianSymbols.Default.TrashXMark,
        PersianSymbols.Default.Undo,
        PersianSymbols.Default.Unlock,
        PersianSymbols.Default.User,
        PersianSymbols.Default.UserBox,
        PersianSymbols.Default.UserBoxDashed,
        PersianSymbols.Default.UserGear,
        PersianSymbols.Default.UserMagnifyingGlass,
        PersianSymbols.Default.UserMinus,
        PersianSymbols.Default.UserPen,
        PersianSymbols.Default.UserPlus,
        PersianSymbols.Default.VolumeHigh,
        PersianSymbols.Default.VolumeLow,
        PersianSymbols.Default.VolumeOff,
        PersianSymbols.Default.VolumeSlash,
        PersianSymbols.Default.VolumeXMark,
        PersianSymbols.Default.Wallet,
        PersianSymbols.Default.Warning,
        PersianSymbols.Default.Wifi,
        PersianSymbols.Default.WifiExclamation,
        PersianSymbols.Default.Wifi1,
        PersianSymbols.Default.WifiSlash,
        PersianSymbols.Default.WifiSpeed,
        PersianSymbols.Default.Wifi3,
        PersianSymbols.Default.Wifi2,
        PersianSymbols.Default.XMark,
        PersianSymbols.Default.XMarkCircle,
        PersianSymbols.Default.XMarkOctagon,
    ).sortedBy { it::class.simpleName }
}

fun PersianSymbols.Filled.getAllIcons(): List<ImageVector> {
    return listOf(
        PersianSymbols.Filled.AddressBook,
        PersianSymbols.Filled.AddressCardArrowDownBottom,
        PersianSymbols.Filled.AddressCardArrowUpTop,
        PersianSymbols.Filled.AddressCardBars,
        PersianSymbols.Filled.AddressCardEmail,
        PersianSymbols.Filled.ArrowDownCircle,
        PersianSymbols.Filled.ArrowLeftCircle,
        PersianSymbols.Filled.ArrowRightCircle,
        PersianSymbols.Filled.ArrowUpCircle,
        PersianSymbols.Filled.Backward,
        PersianSymbols.Filled.BackwardFast,
        PersianSymbols.Filled.BackwardStep,
        PersianSymbols.Filled.BatteryExclamation,
        PersianSymbols.Filled.BatteryQuestion,
        PersianSymbols.Filled.Bell,
        PersianSymbols.Filled.BellExclamation,
        PersianSymbols.Filled.BellOn,
        PersianSymbols.Filled.Bolt,
        PersianSymbols.Filled.BoltCircle,
        PersianSymbols.Filled.Bookmark,
        PersianSymbols.Filled.Bookmarks,
        PersianSymbols.Filled.Box,
        PersianSymbols.Filled.BrightnessAuto,
        PersianSymbols.Filled.BrightnessExclamation,
        PersianSymbols.Filled.BrightnessHigh,
        PersianSymbols.Filled.BrightnessLow,
        PersianSymbols.Filled.BrightnessMedium,
        PersianSymbols.Filled.Calendar,
        PersianSymbols.Filled.CalendarCheck,
        PersianSymbols.Filled.CalendarDay,
        PersianSymbols.Filled.CalendarDays,
        PersianSymbols.Filled.CalendarEvent,
        PersianSymbols.Filled.CalendarRange,
        PersianSymbols.Filled.Camera,
        PersianSymbols.Filled.CameraPlus,
        PersianSymbols.Filled.CameraVideo,
        PersianSymbols.Filled.CameraVideoPlus,
        PersianSymbols.Filled.CameraVideoSlash,
        PersianSymbols.Filled.CaretDownCircle,
        PersianSymbols.Filled.CartShopping,
        PersianSymbols.Filled.Category,
        PersianSymbols.Filled.CheckBadge,
        PersianSymbols.Filled.CheckBox,
        PersianSymbols.Filled.CheckCircle,
        PersianSymbols.Filled.ChevronDownCircle,
        PersianSymbols.Filled.ChevronUpCircle,
        PersianSymbols.Filled.Circle,
        PersianSymbols.Filled.CircleDot,
        PersianSymbols.Filled.Clock,
        PersianSymbols.Filled.ClockAlarm,
        PersianSymbols.Filled.ClockTimer,
        PersianSymbols.Filled.ClockTimer,
        PersianSymbols.Filled.CommentBars,
        PersianSymbols.Filled.CommentPlus,
        PersianSymbols.Filled.CreditCard,
        PersianSymbols.Filled.DeleteLeft,
        PersianSymbols.Filled.DeviceComputerArrowDownTop,
        PersianSymbols.Filled.DeviceComputerMac,
        PersianSymbols.Filled.DeviceComputerUnknown,
        PersianSymbols.Filled.DeviceComputerWindows,
        PersianSymbols.Filled.DeviceLaptopMacbook,
        PersianSymbols.Filled.DeviceLaptopUnknown,
        PersianSymbols.Filled.DeviceLaptopWindows,
        PersianSymbols.Filled.DeviceMobileAndroid,
        PersianSymbols.Filled.DeviceMobileIPhone1,
        PersianSymbols.Filled.DeviceMobileIPhone2,
        PersianSymbols.Filled.DeviceMobileIPhone3,
        PersianSymbols.Filled.DeviceMobileUnknown,
        PersianSymbols.Filled.DeviceTabletAndroid,
        PersianSymbols.Filled.DeviceTabletIPad,
        PersianSymbols.Filled.DeviceTabletUnknown,
        PersianSymbols.Filled.DeviceTv,
        PersianSymbols.Filled.Devices,
        PersianSymbols.Filled.DollarRectangle,
        PersianSymbols.Filled.Envelope,
        PersianSymbols.Filled.EnvelopeArrowRightBottom,
        PersianSymbols.Filled.EnvelopeCheck,
        PersianSymbols.Filled.EnvelopeDot,
        PersianSymbols.Filled.EnvelopeLock,
        PersianSymbols.Filled.EnvelopePaperClip,
        PersianSymbols.Filled.EnvelopePen,
        PersianSymbols.Filled.ExclamationCircle,
        PersianSymbols.Filled.ExclamationOctagon,
        PersianSymbols.Filled.Eye,
        PersianSymbols.Filled.EyeSlash,
        PersianSymbols.Filled.File,
        PersianSymbols.Filled.Flashlight,
        PersianSymbols.Filled.FlashlightSlash,
        PersianSymbols.Filled.Forward,
        PersianSymbols.Filled.ForwardFast,
        PersianSymbols.Filled.ForwardStep,
        PersianSymbols.Filled.Gear,
        PersianSymbols.Filled.Globe,
        PersianSymbols.Filled.Heart,
        PersianSymbols.Filled.House,
        PersianSymbols.Filled.Hub,
        PersianSymbols.Filled.Image,
        PersianSymbols.Filled.InfoCircle,
        PersianSymbols.Filled.Key,
        PersianSymbols.Filled.Keyboard,
        PersianSymbols.Filled.LocationDot,
        PersianSymbols.Filled.LocationDotSlash,
        PersianSymbols.Filled.Lock,
        PersianSymbols.Filled.Message,
        PersianSymbols.Filled.MessageBars,
        PersianSymbols.Filled.MessageCheck,
        PersianSymbols.Filled.MessageExclamation,
        PersianSymbols.Filled.MessageQuestion,
        PersianSymbols.Filled.MessageSms,
        PersianSymbols.Filled.Mic,
        PersianSymbols.Filled.MicSlash,
        PersianSymbols.Filled.MinusBox,
        PersianSymbols.Filled.MinusCircle,
        PersianSymbols.Filled.Moon,
        PersianSymbols.Filled.NewRectangle,
        PersianSymbols.Filled.Nfc,
        PersianSymbols.Filled.Palette,
        PersianSymbols.Filled.PaperPlane,
        PersianSymbols.Filled.PaperPlaneCheck,
        PersianSymbols.Filled.PaperPlaneXMark,
        PersianSymbols.Filled.PasswordRectangle,
        PersianSymbols.Filled.Pause,
        PersianSymbols.Filled.PauseCircle,
        PersianSymbols.Filled.Pen,
        PersianSymbols.Filled.Phone,
        PersianSymbols.Filled.PhoneCall,
        PersianSymbols.Filled.PiggyBank,
        PersianSymbols.Filled.Pin,
        PersianSymbols.Filled.PinCodeRectangle,
        PersianSymbols.Filled.Play,
        PersianSymbols.Filled.PlayCircle,
        PersianSymbols.Filled.PlayPause,
        PersianSymbols.Filled.PlusBox,
        PersianSymbols.Filled.PlusCircle,
        PersianSymbols.Filled.QuestionBox,
        PersianSymbols.Filled.QuestionCircle,
        PersianSymbols.Filled.QuestionTooltip,
        PersianSymbols.Filled.Resume,
        PersianSymbols.Filled.Review,
        PersianSymbols.Filled.ShareNodes,
        PersianSymbols.Filled.ShieldCheck,
        PersianSymbols.Filled.ShieldExclamation,
        PersianSymbols.Filled.Star,
        PersianSymbols.Filled.Sun,
        PersianSymbols.Filled.Tag,
        PersianSymbols.Filled.Tag2,
        PersianSymbols.Filled.TagSlash,
        PersianSymbols.Filled.ThumbDown,
        PersianSymbols.Filled.ThumbUp,
        PersianSymbols.Filled.ToggleOff,
        PersianSymbols.Filled.ToggleOn,
        PersianSymbols.Filled.Trash,
        PersianSymbols.Filled.TrashArrowUp,
        PersianSymbols.Filled.Unlock,
        PersianSymbols.Filled.User,
        PersianSymbols.Filled.UserBox,
        PersianSymbols.Filled.UserBoxDashed,
        PersianSymbols.Filled.UserGear,
        PersianSymbols.Filled.UserMagnifyingGlass,
        PersianSymbols.Filled.UserMinus,
        PersianSymbols.Filled.UserPen,
        PersianSymbols.Filled.UserPlus,
        PersianSymbols.Filled.VolumeHigh,
        PersianSymbols.Filled.VolumeLow,
        PersianSymbols.Filled.VolumeOff,
        PersianSymbols.Filled.VolumeSlash,
        PersianSymbols.Filled.VolumeXMark,
        PersianSymbols.Filled.Wallet,
        PersianSymbols.Filled.Warning,
        PersianSymbols.Filled.XMarkCircle,
        PersianSymbols.Filled.XMarkOctagon,
    ).sortedBy { it::class.simpleName }
}

fun PersianSymbols.getAllIcons(): List<ImageVector> {
    return (PersianSymbols.Default.getAllIcons() + PersianSymbols.Filled.getAllIcons())
}