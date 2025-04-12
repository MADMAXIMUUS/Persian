package io.github.madmaximuus.persianSymbols.foundation

import androidx.compose.ui.graphics.vector.ImageVector
import io.github.madmaximuus.persianSymbols.a.A
import io.github.madmaximuus.persianSymbols.address.book.AddressBook
import io.github.madmaximuus.persianSymbols.address.card.arrowDown.bottom.AddressCardArrowDownBottom
import io.github.madmaximuus.persianSymbols.address.card.arrowUp.top.AddressCardArrowUpTop
import io.github.madmaximuus.persianSymbols.address.card.bars.AddressCardBars
import io.github.madmaximuus.persianSymbols.address.card.email.AddressCardEmail
import io.github.madmaximuus.persianSymbols.antenna.radiowave.AntennaRadiowave
import io.github.madmaximuus.persianSymbols.antenna.radiowave.slash.AntennaRadiowaveSlash
import io.github.madmaximuus.persianSymbols.arrow.down.ArrowDown
import io.github.madmaximuus.persianSymbols.arrow.down.circle.ArrowDownCircle
import io.github.madmaximuus.persianSymbols.arrow.down.right.and.arrow.up.left.ArrowDownRightAndArrowUpLeft
import io.github.madmaximuus.persianSymbols.arrow.down.toBracket.ArrowDownToBracket
import io.github.madmaximuus.persianSymbols.arrow.down.toBracket.check.top.ArrowDownToBracketCheckTop
import io.github.madmaximuus.persianSymbols.arrow.down.toBracket.cross.top.ArrowDownToBracketCrossTop
import io.github.madmaximuus.persianSymbols.arrow.left.ArrowLeft
import io.github.madmaximuus.persianSymbols.arrow.left.arrow.right.ArrowLeftArrowRight
import io.github.madmaximuus.persianSymbols.arrow.left.circle.ArrowLeftCircle
import io.github.madmaximuus.persianSymbols.arrow.left.down.arrow.right.up.ArrowLeftDownArrowRightUp
import io.github.madmaximuus.persianSymbols.arrow.right.ArrowRight
import io.github.madmaximuus.persianSymbols.arrow.right.circle.ArrowRightCircle
import io.github.madmaximuus.persianSymbols.arrow.right.fromBracket.ArrowRightFromBracket
import io.github.madmaximuus.persianSymbols.arrow.right.rotate.ArrowRightRotate
import io.github.madmaximuus.persianSymbols.arrow.right.toBracket.ArrowRightToBracket
import io.github.madmaximuus.persianSymbols.arrow.trend.down.ArrowTrendDown
import io.github.madmaximuus.persianSymbols.arrow.trend.up.ArrowTrendUp
import io.github.madmaximuus.persianSymbols.arrow.up.ArrowUp
import io.github.madmaximuus.persianSymbols.arrow.up.circle.ArrowUpCircle
import io.github.madmaximuus.persianSymbols.arrow.up.fromBracket.ArrowUpFromBracket
import io.github.madmaximuus.persianSymbols.arrow.up.left.and.arrow.down.right.ArrowUpLeftAndArrowDownRight
import io.github.madmaximuus.persianSymbols.arrow.up.right.and.arrow.left.down.ArrowUpRightAndArrowLeftDown
import io.github.madmaximuus.persianSymbols.arrow.up.right.fromBox.ArrowUpRightFromBox
import io.github.madmaximuus.persianSymbols.at.At
import io.github.madmaximuus.persianSymbols.backward.Backward
import io.github.madmaximuus.persianSymbols.backward.fast.BackwardFast
import io.github.madmaximuus.persianSymbols.backward.five.Backward5
import io.github.madmaximuus.persianSymbols.backward.step.BackwardStep
import io.github.madmaximuus.persianSymbols.backward.ten.Backward10
import io.github.madmaximuus.persianSymbols.backward.thirty.Backward30
import io.github.madmaximuus.persianSymbols.ban.Ban
import io.github.madmaximuus.persianSymbols.bars.Bars
import io.github.madmaximuus.persianSymbols.bars.filter.BarsFilter
import io.github.madmaximuus.persianSymbols.bars.filter.slash.BarsFilterSlash
import io.github.madmaximuus.persianSymbols.bars.sort.BarsSort
import io.github.madmaximuus.persianSymbols.battery.exclamation.BatteryExclamation
import io.github.madmaximuus.persianSymbols.battery.percent.fifty.Battery50Percent
import io.github.madmaximuus.persianSymbols.battery.percent.fifty.bolt.Battery50PercentBolt
import io.github.madmaximuus.persianSymbols.battery.percent.hundred.Battery100Percent
import io.github.madmaximuus.persianSymbols.battery.percent.hundred.bolt.Battery100PercentBolt
import io.github.madmaximuus.persianSymbols.battery.percent.seventyFive.Battery75Percent
import io.github.madmaximuus.persianSymbols.battery.percent.seventyFive.bolt.Battery75PercentBolt
import io.github.madmaximuus.persianSymbols.battery.percent.twentyFive.Battery25Percent
import io.github.madmaximuus.persianSymbols.battery.percent.twentyFive.bolt.Battery25PercentBolt
import io.github.madmaximuus.persianSymbols.battery.percent.zero.Battery0Percent
import io.github.madmaximuus.persianSymbols.battery.percent.zero.bolt.Battery0PercentBolt
import io.github.madmaximuus.persianSymbols.battery.question.BatteryQuestion
import io.github.madmaximuus.persianSymbols.bell.Bell
import io.github.madmaximuus.persianSymbols.bell.badge.BellBadge
import io.github.madmaximuus.persianSymbols.bell.badge.slash.BellBadgeSlash
import io.github.madmaximuus.persianSymbols.bell.exclamation.BellExclamation
import io.github.madmaximuus.persianSymbols.bell.on.BellOn
import io.github.madmaximuus.persianSymbols.bell.slash.BellSlash
import io.github.madmaximuus.persianSymbols.bluetooth.Bluetooth
import io.github.madmaximuus.persianSymbols.bluetooth.connected.BluetoothConnected
import io.github.madmaximuus.persianSymbols.bluetooth.scan.BluetoothScan
import io.github.madmaximuus.persianSymbols.bluetooth.slash.BluetoothSlash
import io.github.madmaximuus.persianSymbols.bolt.Bolt
import io.github.madmaximuus.persianSymbols.bolt.badge.check.BoltBadgeCheck
import io.github.madmaximuus.persianSymbols.bolt.badge.clock.BoltBadgeClock
import io.github.madmaximuus.persianSymbols.bolt.badge.cross.BoltBadgeCross
import io.github.madmaximuus.persianSymbols.bolt.circle.BoltCircle
import io.github.madmaximuus.persianSymbols.bolt.slash.BoltSlash
import io.github.madmaximuus.persianSymbols.bookmark.Bookmark
import io.github.madmaximuus.persianSymbols.bookmark.slash.BookmarkSlash
import io.github.madmaximuus.persianSymbols.bookmarks.Bookmarks
import io.github.madmaximuus.persianSymbols.box.Box
import io.github.madmaximuus.persianSymbols.brightness.auto.BrightnessAuto
import io.github.madmaximuus.persianSymbols.brightness.exclamation.BrightnessExclamation
import io.github.madmaximuus.persianSymbols.brightness.high.BrightnessHigh
import io.github.madmaximuus.persianSymbols.brightness.low.BrightnessLow
import io.github.madmaximuus.persianSymbols.brightness.medium.BrightnessMedium
import io.github.madmaximuus.persianSymbols.building.columns.BuildingColumns
import io.github.madmaximuus.persianSymbols.building.columns.percent.bottom.BuildingColumnsPercentBottom
import io.github.madmaximuus.persianSymbols.calendar.Calendar
import io.github.madmaximuus.persianSymbols.calendar.badge.clock.CalendarBadgeClock
import io.github.madmaximuus.persianSymbols.calendar.badge.exclamation.CalendarBadgeExclamation
import io.github.madmaximuus.persianSymbols.calendar.badge.minus.CalendarBadgeMinus
import io.github.madmaximuus.persianSymbols.calendar.badge.person.CalendarBadgePerson
import io.github.madmaximuus.persianSymbols.calendar.badge.plus.CalendarBadgePlus
import io.github.madmaximuus.persianSymbols.calendar.check.CalendarCheck
import io.github.madmaximuus.persianSymbols.calendar.day.CalendarDay
import io.github.madmaximuus.persianSymbols.calendar.event.CalendarEvent
import io.github.madmaximuus.persianSymbols.calendar.range.CalendarRange
import io.github.madmaximuus.persianSymbols.camera.Camera
import io.github.madmaximuus.persianSymbols.camera.badge.clock.CameraBadgeClock
import io.github.madmaximuus.persianSymbols.camera.badge.ellipsis.CameraBadgeEllipsis
import io.github.madmaximuus.persianSymbols.camera.badge.plus.CameraBadgePlus
import io.github.madmaximuus.persianSymbols.camera.rotate.CameraRotate
import io.github.madmaximuus.persianSymbols.caret.down.CaretDown
import io.github.madmaximuus.persianSymbols.caret.down.circle.CaretDownCircle
import io.github.madmaximuus.persianSymbols.caret.left.CaretLeft
import io.github.madmaximuus.persianSymbols.caret.right.CaretRight
import io.github.madmaximuus.persianSymbols.caret.up.CaretUp
import io.github.madmaximuus.persianSymbols.cart.Cart
import io.github.madmaximuus.persianSymbols.cart.badge.clock.CartBadgeClock
import io.github.madmaximuus.persianSymbols.cart.badge.minus.CartBadgeMinus
import io.github.madmaximuus.persianSymbols.cart.badge.plus.CartBadgePlus
import io.github.madmaximuus.persianSymbols.cart.badge.question.CartBadgeQuestion
import io.github.madmaximuus.persianSymbols.category.Category
import io.github.madmaximuus.persianSymbols.chart.donut.simple.ChartDonutSimple
import io.github.madmaximuus.persianSymbols.chart.pie.dollar.ChartPieDollar
import io.github.madmaximuus.persianSymbols.check.Check
import io.github.madmaximuus.persianSymbols.check.badge.CheckBadge
import io.github.madmaximuus.persianSymbols.check.box.CheckBox
import io.github.madmaximuus.persianSymbols.check.circle.CheckCircle
import io.github.madmaximuus.persianSymbols.check.double.CheckDouble
import io.github.madmaximuus.persianSymbols.check.line.CheckLine
import io.github.madmaximuus.persianSymbols.check.small.CheckSmall
import io.github.madmaximuus.persianSymbols.chevron.down.ChevronDown
import io.github.madmaximuus.persianSymbols.chevron.down.circle.ChevronDownCircle
import io.github.madmaximuus.persianSymbols.chevron.left.ChevronLeft
import io.github.madmaximuus.persianSymbols.chevron.left.circle.ChevronLeftCircle
import io.github.madmaximuus.persianSymbols.chevron.left.toLine.ChevronLeftToLine
import io.github.madmaximuus.persianSymbols.chevron.right.ChevronRight
import io.github.madmaximuus.persianSymbols.chevron.right.circle.ChevronRightCircle
import io.github.madmaximuus.persianSymbols.chevron.right.toLine.ChevronRightToLine
import io.github.madmaximuus.persianSymbols.chevron.up.ChevronUp
import io.github.madmaximuus.persianSymbols.chevron.up.circle.ChevronUpCircle
import io.github.madmaximuus.persianSymbols.circle.Circle
import io.github.madmaximuus.persianSymbols.circle.dot.CircleDot
import io.github.madmaximuus.persianSymbols.clock.Clock
import io.github.madmaximuus.persianSymbols.clock.alarm.ClockAlarm
import io.github.madmaximuus.persianSymbols.clock.badge.ClockBadge
import io.github.madmaximuus.persianSymbols.clock.badge.check.ClockBadgeCheck
import io.github.madmaximuus.persianSymbols.clock.badge.cross.ClockBadgeCross
import io.github.madmaximuus.persianSymbols.clock.badge.exclamation.ClockBadgeExclamation
import io.github.madmaximuus.persianSymbols.clock.badge.question.ClockBadgeQuestion
import io.github.madmaximuus.persianSymbols.clock.rotate.left.ClockRotateLeft
import io.github.madmaximuus.persianSymbols.clock.rotate.right.ClockRotateRight
import io.github.madmaximuus.persianSymbols.clock.timer.ClockTimer
import io.github.madmaximuus.persianSymbols.code.Code
import io.github.madmaximuus.persianSymbols.comment.bars.CommentBars
import io.github.madmaximuus.persianSymbols.comment.plus.CommentPlus
import io.github.madmaximuus.persianSymbols.compass.Compass
import io.github.madmaximuus.persianSymbols.compress.Compress
import io.github.madmaximuus.persianSymbols.creditCard.CreditCard
import io.github.madmaximuus.persianSymbols.delete.left.DeleteLeft
import io.github.madmaximuus.persianSymbols.device.computer.DeviceComputer
import io.github.madmaximuus.persianSymbols.device.computer.apple.DeviceComputerApple
import io.github.madmaximuus.persianSymbols.device.computer.badge.arrow.down.DeviceComputerArrowDown
import io.github.madmaximuus.persianSymbols.device.computer.lock.DeviceComputerLock
import io.github.madmaximuus.persianSymbols.device.computer.play.DeviceComputerPlay
import io.github.madmaximuus.persianSymbols.device.computer.slash.DeviceComputerSlash
import io.github.madmaximuus.persianSymbols.device.computer.unlock.DeviceComputerUnlock
import io.github.madmaximuus.persianSymbols.device.computer.windows.DeviceComputerWindows
import io.github.madmaximuus.persianSymbols.device.laptop.DeviceLaptop
import io.github.madmaximuus.persianSymbols.device.laptop.apple.DeviceLaptopApple
import io.github.madmaximuus.persianSymbols.device.laptop.badge.dollar.DeviceLaptopBadgeDollar
import io.github.madmaximuus.persianSymbols.device.laptop.lock.DeviceLaptopLock
import io.github.madmaximuus.persianSymbols.device.laptop.play.DeviceLaptopPlay
import io.github.madmaximuus.persianSymbols.device.laptop.slash.DeviceLaptopSlash
import io.github.madmaximuus.persianSymbols.device.laptop.unlock.DeviceLaptopUnlock
import io.github.madmaximuus.persianSymbols.device.laptop.windows.DeviceLaptopWindows
import io.github.madmaximuus.persianSymbols.device.mobile.DeviceMobile
import io.github.madmaximuus.persianSymbols.device.mobile.android.DeviceMobileAndroid
import io.github.madmaximuus.persianSymbols.device.mobile.apple.button.DeviceMobileAppleButton
import io.github.madmaximuus.persianSymbols.device.mobile.apple.island.DeviceMobileAppleIsland
import io.github.madmaximuus.persianSymbols.device.mobile.apple.notch.DeviceMobileAppleNotch
import io.github.madmaximuus.persianSymbols.device.mobile.arrowDown.DeviceMobileArrowDown
import io.github.madmaximuus.persianSymbols.device.mobile.slash.DeviceMobileSlash
import io.github.madmaximuus.persianSymbols.device.tablet.DeviceTablet
import io.github.madmaximuus.persianSymbols.device.tablet.android.DeviceTabletAndroid
import io.github.madmaximuus.persianSymbols.device.tablet.apple.DeviceTabletApple
import io.github.madmaximuus.persianSymbols.device.tablet.slash.DeviceTabletSlash
import io.github.madmaximuus.persianSymbols.device.tv.DeviceTv
import io.github.madmaximuus.persianSymbols.device.tv.fourK.DeviceTv4K
import io.github.madmaximuus.persianSymbols.device.tv.slash.DeviceTvSlash
import io.github.madmaximuus.persianSymbols.devices.Devices
import io.github.madmaximuus.persianSymbols.diamond.Diamond
import io.github.madmaximuus.persianSymbols.dollar.Dollar
import io.github.madmaximuus.persianSymbols.dollar.badge.DollarBadge
import io.github.madmaximuus.persianSymbols.dollar.rectangle.DollarRectangle
import io.github.madmaximuus.persianSymbols.dollar.rotate.DollarRotate
import io.github.madmaximuus.persianSymbols.e.E
import io.github.madmaximuus.persianSymbols.eight.Eight
import io.github.madmaximuus.persianSymbols.ellepsis.grid.EllipsisGrid
import io.github.madmaximuus.persianSymbols.ellepsis.grip.vert.EllipsisGripVertical
import io.github.madmaximuus.persianSymbols.ellepsis.horiz.EllipsisHoriz
import io.github.madmaximuus.persianSymbols.ellepsis.vert.EllipsisVert
import io.github.madmaximuus.persianSymbols.envelope.Envelope
import io.github.madmaximuus.persianSymbols.envelope.arrowRight.EnvelopeArrowRight
import io.github.madmaximuus.persianSymbols.envelope.badge.EnvelopeBadge
import io.github.madmaximuus.persianSymbols.envelope.badge.person.EnvelopeBadgePerson
import io.github.madmaximuus.persianSymbols.envelope.check.EnvelopeCheck
import io.github.madmaximuus.persianSymbols.envelope.front.EnvelopeFront
import io.github.madmaximuus.persianSymbols.envelope.lock.EnvelopeLock
import io.github.madmaximuus.persianSymbols.envelope.paperClip.EnvelopePaperClip
import io.github.madmaximuus.persianSymbols.envelope.pen.EnvelopePen
import io.github.madmaximuus.persianSymbols.equalizer.Equalizer
import io.github.madmaximuus.persianSymbols.eraser.Eraser
import io.github.madmaximuus.persianSymbols.exclamation.Exclamation
import io.github.madmaximuus.persianSymbols.exclamation.circle.ExclamationCircle
import io.github.madmaximuus.persianSymbols.exclamation.octagon.ExclamationOctagon
import io.github.madmaximuus.persianSymbols.expend.Expend
import io.github.madmaximuus.persianSymbols.eye.Eye
import io.github.madmaximuus.persianSymbols.eye.slash.EyeSlash
import io.github.madmaximuus.persianSymbols.face.smile.FaceSmile
import io.github.madmaximuus.persianSymbols.faxmachine.Faxmachine
import io.github.madmaximuus.persianSymbols.file.File
import io.github.madmaximuus.persianSymbols.file.arrow.down.FileArrowDown
import io.github.madmaximuus.persianSymbols.file.arrow.up.FileArrowUp
import io.github.madmaximuus.persianSymbols.file.badge.clock.FileBadgeClock
import io.github.madmaximuus.persianSymbols.file.badge.ellipsis.FileBadgeEllipsis
import io.github.madmaximuus.persianSymbols.file.badge.gear.FileBadgeGear
import io.github.madmaximuus.persianSymbols.file.badge.plus.FileBadgePlus
import io.github.madmaximuus.persianSymbols.file.lock.FileLock
import io.github.madmaximuus.persianSymbols.file.text.FileText
import io.github.madmaximuus.persianSymbols.fire.Fire
import io.github.madmaximuus.persianSymbols.five.Five
import io.github.madmaximuus.persianSymbols.flashlight.Flashlight
import io.github.madmaximuus.persianSymbols.flashlight.slash.FlashlightSlash
import io.github.madmaximuus.persianSymbols.folder.Folder
import io.github.madmaximuus.persianSymbols.folder.badge.gear.FolderBadgeGear
import io.github.madmaximuus.persianSymbols.folder.badge.minus.FolderBadgeMinus
import io.github.madmaximuus.persianSymbols.folder.badge.person.FolderBadgePerson
import io.github.madmaximuus.persianSymbols.folder.badge.plus.FolderBadgePlus
import io.github.madmaximuus.persianSymbols.folder.badge.question.FolderBadgeQuestion
import io.github.madmaximuus.persianSymbols.folder.question.FolderQuestion
import io.github.madmaximuus.persianSymbols.fork.knife.ForkKnife
import io.github.madmaximuus.persianSymbols.forward.Forward
import io.github.madmaximuus.persianSymbols.forward.fast.ForwardFast
import io.github.madmaximuus.persianSymbols.forward.five.Forward5
import io.github.madmaximuus.persianSymbols.forward.step.ForwardStep
import io.github.madmaximuus.persianSymbols.forward.ten.Forward10
import io.github.madmaximuus.persianSymbols.forward.thirty.Forward30
import io.github.madmaximuus.persianSymbols.four.Four
import io.github.madmaximuus.persianSymbols.gift.Gift
import io.github.madmaximuus.persianSymbols.globe.Globe
import io.github.madmaximuus.persianSymbols.headphones.Headphones
import io.github.madmaximuus.persianSymbols.headphones.slash.HeadphonesSlash
import io.github.madmaximuus.persianSymbols.heart.Heart
import io.github.madmaximuus.persianSymbols.hexagon.Hexagon
import io.github.madmaximuus.persianSymbols.house.House
import io.github.madmaximuus.persianSymbols.house.slash.HouseSlash
import io.github.madmaximuus.persianSymbols.hub.Hub
import io.github.madmaximuus.persianSymbols.i.I
import io.github.madmaximuus.persianSymbols.i.circle.ICircle
import io.github.madmaximuus.persianSymbols.image.Image
import io.github.madmaximuus.persianSymbols.image.badge.arrow.down.ImageBadgeArrowDown
import io.github.madmaximuus.persianSymbols.image.badge.check.ImageBadgeCheck
import io.github.madmaximuus.persianSymbols.image.badge.exclamation.ImageBadgeExclamation
import io.github.madmaximuus.persianSymbols.image.badge.plus.ImageBadgePlus
import io.github.madmaximuus.persianSymbols.image.box.dashed.ImageDashed
import io.github.madmaximuus.persianSymbols.key.Key
import io.github.madmaximuus.persianSymbols.key.slash.KeySlash
import io.github.madmaximuus.persianSymbols.keyboard.Keyboard
import io.github.madmaximuus.persianSymbols.keyboard.ellipsis.KeyboardEllipsis
import io.github.madmaximuus.persianSymbols.keyboard.eye.KeyboardEye
import io.github.madmaximuus.persianSymbols.link.Link
import io.github.madmaximuus.persianSymbols.link.slash.LinkSlash
import io.github.madmaximuus.persianSymbols.list.List
import io.github.madmaximuus.persianSymbols.location.dot.LocationDot
import io.github.madmaximuus.persianSymbols.location.dot.slash.LocationDotSlash
import io.github.madmaximuus.persianSymbols.lock.Lock
import io.github.madmaximuus.persianSymbols.lock.badge.clock.LockBadgeClock
import io.github.madmaximuus.persianSymbols.lock.slash.LockSlash
import io.github.madmaximuus.persianSymbols.m.M
import io.github.madmaximuus.persianSymbols.magnifyingGlass.MagnifyingGlass
import io.github.madmaximuus.persianSymbols.magnifyingGlass.minus.MagnifyingGlassMinus
import io.github.madmaximuus.persianSymbols.magnifyingGlass.one.MagnifyingGlassOne
import io.github.madmaximuus.persianSymbols.magnifyingGlass.plus.MagnifyingGlassPlus
import io.github.madmaximuus.persianSymbols.message.Message
import io.github.madmaximuus.persianSymbols.message.badge.check.MessageBadgeCheck
import io.github.madmaximuus.persianSymbols.message.badge.clock.MessageBadgeClock
import io.github.madmaximuus.persianSymbols.message.bars.MessageBars
import io.github.madmaximuus.persianSymbols.message.check.MessageCheck
import io.github.madmaximuus.persianSymbols.message.ellipsis.horiz.MessageEllipsisHoriz
import io.github.madmaximuus.persianSymbols.message.ellipsis.vert.MessageEllipsisVert
import io.github.madmaximuus.persianSymbols.message.exclamation.MessageExclamation
import io.github.madmaximuus.persianSymbols.message.i.MessageI
import io.github.madmaximuus.persianSymbols.message.pen.MessagePen
import io.github.madmaximuus.persianSymbols.message.plus.MessagePlus
import io.github.madmaximuus.persianSymbols.message.question.MessageQuestion
import io.github.madmaximuus.persianSymbols.message.sms.MessageSms
import io.github.madmaximuus.persianSymbols.mic.Mic
import io.github.madmaximuus.persianSymbols.mic.badge.cross.MicBadgeCross
import io.github.madmaximuus.persianSymbols.mic.badge.ellipsis.MicBadgeEllipsis
import io.github.madmaximuus.persianSymbols.mic.badge.minus.MicBadgeMinus
import io.github.madmaximuus.persianSymbols.mic.badge.plus.MicBadgePlus
import io.github.madmaximuus.persianSymbols.mic.slash.MicSlash
import io.github.madmaximuus.persianSymbols.minus.Minus
import io.github.madmaximuus.persianSymbols.minus.box.MinusBox
import io.github.madmaximuus.persianSymbols.minus.circle.MinusCircle
import io.github.madmaximuus.persianSymbols.minus.small.MinusSmall
import io.github.madmaximuus.persianSymbols.money.bill.MoneyBill
import io.github.madmaximuus.persianSymbols.n.N
import io.github.madmaximuus.persianSymbols.newLabel.rectangle.NewRectangle
import io.github.madmaximuus.persianSymbols.nfc.Nfc
import io.github.madmaximuus.persianSymbols.nine.Nine
import io.github.madmaximuus.persianSymbols.one.One
import io.github.madmaximuus.persianSymbols.pallete.Palette
import io.github.madmaximuus.persianSymbols.paperClip.PaperClip
import io.github.madmaximuus.persianSymbols.paperClip.badge.ellipsis.PaperClipBadgeEllipsis
import io.github.madmaximuus.persianSymbols.paperPlane.PaperPlane
import io.github.madmaximuus.persianSymbols.paperPlane.badge.check.PaperPlaneBadgeCheck
import io.github.madmaximuus.persianSymbols.paperPlane.badge.cross.PaperPlaneBadgeCross
import io.github.madmaximuus.persianSymbols.password.rectangle.PasswordRectangle
import io.github.madmaximuus.persianSymbols.pause.Pause
import io.github.madmaximuus.persianSymbols.pause.circle.PauseCircle
import io.github.madmaximuus.persianSymbols.pen.Pen
import io.github.madmaximuus.persianSymbols.pen.slash.PenSlash
import io.github.madmaximuus.persianSymbols.pentagon.Pentagon
import io.github.madmaximuus.persianSymbols.phone.Phone
import io.github.madmaximuus.persianSymbols.phone.arrow.down.left.PhoneArrowDownLeft
import io.github.madmaximuus.persianSymbols.phone.arrow.right.PhoneArrowRight
import io.github.madmaximuus.persianSymbols.phone.arrow.up.right.PhoneArrowUpRight
import io.github.madmaximuus.persianSymbols.phone.badge.check.PhoneBadgeCheck
import io.github.madmaximuus.persianSymbols.phone.badge.plus.PhoneBadgePlus
import io.github.madmaximuus.persianSymbols.phone.call.PhoneCall
import io.github.madmaximuus.persianSymbols.phone.down.PhoneDown
import io.github.madmaximuus.persianSymbols.piggyBank.PiggyBank
import io.github.madmaximuus.persianSymbols.pin.Pin
import io.github.madmaximuus.persianSymbols.pin.slash.PinSlash
import io.github.madmaximuus.persianSymbols.pinCode.rectangle.PinCodeRectangle
import io.github.madmaximuus.persianSymbols.play.Play
import io.github.madmaximuus.persianSymbols.play.circle.PlayCircle
import io.github.madmaximuus.persianSymbols.play.pause.PlayPause
import io.github.madmaximuus.persianSymbols.plus.Plus
import io.github.madmaximuus.persianSymbols.plus.box.PlusBox
import io.github.madmaximuus.persianSymbols.plus.circle.PlusCircle
import io.github.madmaximuus.persianSymbols.podcasts.Podcasts
import io.github.madmaximuus.persianSymbols.powerOnOff.PowerOnOff
import io.github.madmaximuus.persianSymbols.printer.Printer
import io.github.madmaximuus.persianSymbols.printer.dotmatrix.PrinterDotmatrix
import io.github.madmaximuus.persianSymbols.question.Question
import io.github.madmaximuus.persianSymbols.question.box.QuestionBox
import io.github.madmaximuus.persianSymbols.question.circle.QuestionCircle
import io.github.madmaximuus.persianSymbols.question.tooltip.QuestionTooltip
import io.github.madmaximuus.persianSymbols.quote.closing.QuoteClosing
import io.github.madmaximuus.persianSymbols.quote.opening.QuoteOpening
import io.github.madmaximuus.persianSymbols.radar.Radar
import io.github.madmaximuus.persianSymbols.recordingTape.RecordingTape
import io.github.madmaximuus.persianSymbols.rectangle.landscape.rotate.RectangleLandscapeRotate
import io.github.madmaximuus.persianSymbols.rectangle.portrait.rotate.RectanglePortraitRotate
import io.github.madmaximuus.persianSymbols.redo.Redo
import io.github.madmaximuus.persianSymbols.repeat.Repeat
import io.github.madmaximuus.persianSymbols.repeat.one.Repeat1
import io.github.madmaximuus.persianSymbols.reply.Reply
import io.github.madmaximuus.persianSymbols.reply.all.ReplyAll
import io.github.madmaximuus.persianSymbols.resume.Resume
import io.github.madmaximuus.persianSymbols.review.Review
import io.github.madmaximuus.persianSymbols.rotate.Rotate
import io.github.madmaximuus.persianSymbols.rss.Rss
import io.github.madmaximuus.persianSymbols.s.S
import io.github.madmaximuus.persianSymbols.sack.Sack
import io.github.madmaximuus.persianSymbols.sack.add.SackAdd
import io.github.madmaximuus.persianSymbols.sack.dollar.SackDollar
import io.github.madmaximuus.persianSymbols.sack.xMark.SackXMark
import io.github.madmaximuus.persianSymbols.scanner.Scanner
import io.github.madmaximuus.persianSymbols.server.Server
import io.github.madmaximuus.persianSymbols.seven.Seven
import io.github.madmaximuus.persianSymbols.share.all.ShareAll
import io.github.madmaximuus.persianSymbols.share.nodes.ShareNodes
import io.github.madmaximuus.persianSymbols.shield.Shield
import io.github.madmaximuus.persianSymbols.shield.check.ShieldCheck
import io.github.madmaximuus.persianSymbols.shield.exclamation.ShieldExclamation
import io.github.madmaximuus.persianSymbols.shield.slash.ShieldSlash
import io.github.madmaximuus.persianSymbols.shield.xmark.ShieldXMark
import io.github.madmaximuus.persianSymbols.shredder.Shredder
import io.github.madmaximuus.persianSymbols.shufle.Shuffle
import io.github.madmaximuus.persianSymbols.sigmal.Signal
import io.github.madmaximuus.persianSymbols.sigmal.badge.cross.SignalBadgeCross
import io.github.madmaximuus.persianSymbols.sigmal.badge.exclamation.SignalBadgeExclamation
import io.github.madmaximuus.persianSymbols.sigmal.four.Signal4
import io.github.madmaximuus.persianSymbols.sigmal.one.Signal1
import io.github.madmaximuus.persianSymbols.sigmal.stream.SignalStream
import io.github.madmaximuus.persianSymbols.sigmal.stream.slash.SignalStreamSlash
import io.github.madmaximuus.persianSymbols.sigmal.three.Signal3
import io.github.madmaximuus.persianSymbols.sigmal.two.Signal2
import io.github.madmaximuus.persianSymbols.six.Six
import io.github.madmaximuus.persianSymbols.speaker.Speaker
import io.github.madmaximuus.persianSymbols.speaker.minus.SpeakerMinus
import io.github.madmaximuus.persianSymbols.speaker.plus.SpeakerPlus
import io.github.madmaximuus.persianSymbols.speaker.wave.one.SpeakerWave1
import io.github.madmaximuus.persianSymbols.speaker.wave.two.SpeakerWave2
import io.github.madmaximuus.persianSymbols.speaker.xMark.SpeakerXMark
import io.github.madmaximuus.persianSymbols.star.Star
import io.github.madmaximuus.persianSymbols.stop.Stop
import io.github.madmaximuus.persianSymbols.stop.circle.StopCircle
import io.github.madmaximuus.persianSymbols.sun.Sun
import io.github.madmaximuus.persianSymbols.tShirt.TShirt
import io.github.madmaximuus.persianSymbols.tag.Tag
import io.github.madmaximuus.persianSymbols.tag.slash.TagSlash
import io.github.madmaximuus.persianSymbols.tag.two.Tag2
import io.github.madmaximuus.persianSymbols.three.Three
import io.github.madmaximuus.persianSymbols.thumb.down.ThumbDown
import io.github.madmaximuus.persianSymbols.thumb.up.ThumbUp
import io.github.madmaximuus.persianSymbols.toggle.off.ToggleOff
import io.github.madmaximuus.persianSymbols.toggle.on.ToggleOn
import io.github.madmaximuus.persianSymbols.trash.Trash
import io.github.madmaximuus.persianSymbols.trash.arrow.up.TrashArrowUp
import io.github.madmaximuus.persianSymbols.trash.check.TrashCheck
import io.github.madmaximuus.persianSymbols.trash.slash.TrashSlash
import io.github.madmaximuus.persianSymbols.trash.xMark.TrashXMark
import io.github.madmaximuus.persianSymbols.triangle.Triangle
import io.github.madmaximuus.persianSymbols.two.Two
import io.github.madmaximuus.persianSymbols.undo.Undo
import io.github.madmaximuus.persianSymbols.unlock.Unlock
import io.github.madmaximuus.persianSymbols.user.User
import io.github.madmaximuus.persianSymbols.user.badge.ban.UserBadgeBan
import io.github.madmaximuus.persianSymbols.user.badge.clock.UserBadgeClock
import io.github.madmaximuus.persianSymbols.user.badge.gear.UserBadgeGear
import io.github.madmaximuus.persianSymbols.user.badge.magnifyingGlass.UserBadgeMagnifyingGlass
import io.github.madmaximuus.persianSymbols.user.badge.minus.UserBadgeMinus
import io.github.madmaximuus.persianSymbols.user.badge.pen.UserBadgePen
import io.github.madmaximuus.persianSymbols.user.badge.plus.UserBadgePlus
import io.github.madmaximuus.persianSymbols.user.box.UserBox
import io.github.madmaximuus.persianSymbols.user.box.dashed.UserBoxDashed
import io.github.madmaximuus.persianSymbols.user.circle.UserCircle
import io.github.madmaximuus.persianSymbols.user.group.UserGroup
import io.github.madmaximuus.persianSymbols.video.Video
import io.github.madmaximuus.persianSymbols.video.badge.clock.VideoBadgeClock
import io.github.madmaximuus.persianSymbols.video.badge.ellipsis.VideoBadgeEllipsis
import io.github.madmaximuus.persianSymbols.video.badge.plus.VideoBadgePlus
import io.github.madmaximuus.persianSymbols.video.plus.VideoPlus
import io.github.madmaximuus.persianSymbols.video.question.VideoQuestion
import io.github.madmaximuus.persianSymbols.video.slash.VideoSlash
import io.github.madmaximuus.persianSymbols.w.W
import io.github.madmaximuus.persianSymbols.wallet.Wallet
import io.github.madmaximuus.persianSymbols.warning.Warning
import io.github.madmaximuus.persianSymbols.waveform.Waveform
import io.github.madmaximuus.persianSymbols.waveform.badge.exclamation.WaveformBadgeExclamation
import io.github.madmaximuus.persianSymbols.waveform.badge.magnifyingGlass.WaveformBadgeMagnifyingGlass
import io.github.madmaximuus.persianSymbols.waveform.badge.mic.WaveformBadgeMic
import io.github.madmaximuus.persianSymbols.waveform.badge.minus.WaveformBadgeMinus
import io.github.madmaximuus.persianSymbols.waveform.badge.plus.WaveformBadgePlus
import io.github.madmaximuus.persianSymbols.waveform.slash.WaveformSlash
import io.github.madmaximuus.persianSymbols.wifi.Wifi
import io.github.madmaximuus.persianSymbols.wifi.badge.exclamation.WifiExclamation
import io.github.madmaximuus.persianSymbols.wifi.slash.WifiSlash
import io.github.madmaximuus.persianSymbols.wifi.speed.WifiSpeed
import io.github.madmaximuus.persianSymbols.wifi.wave.one.WifiWave1
import io.github.madmaximuus.persianSymbols.wifi.wave.two.WifiWave2
import io.github.madmaximuus.persianSymbols.wifi.wave.zero.WifiWave0
import io.github.madmaximuus.persianSymbols.xmark.XMark
import io.github.madmaximuus.persianSymbols.xmark.circle.XMarkCircle
import io.github.madmaximuus.persianSymbols.xmark.octagon.XMarkOctagon
import io.github.madmaximuus.persianSymbols.zero.Zero

fun PersianSymbols.Default.getAllIcons(): List<ImageVector> {
    return listOf(
        this.A,
        this.AddressBook,
        this.AddressCardArrowDownBottom,
        this.AddressCardArrowUpTop,
        this.AddressCardBars,
        this.AddressCardEmail,
        this.AntennaRadiowaveSlash,
        this.AntennaRadiowave,
        this.ArrowDownCircle,
        this.ArrowDownRightAndArrowUpLeft,
        this.ArrowDownToBracketCheckTop,
        this.ArrowDownToBracketCrossTop,
        this.ArrowDownToBracket,
        this.ArrowDown,
        this.ArrowLeftArrowRight,
        this.ArrowLeftCircle,
        this.ArrowLeftDownArrowRightUp,
        this.ArrowLeft,
        this.ArrowRightCircle,
        this.ArrowRightFromBracket,
        this.ArrowRightRotate,
        this.ArrowRightToBracket,
        this.ArrowRight,
        this.ArrowTrendDown,
        this.ArrowTrendUp,
        this.ArrowUpCircle,
        this.ArrowUpFromBracket,
        this.ArrowUpLeftAndArrowDownRight,
        this.ArrowUpRightAndArrowLeftDown,
        this.ArrowUpRightFromBox,
        this.ArrowUp,
        this.At,
        this.BackwardFast,
        this.Backward5,
        this.BackwardStep,
        this.Backward10,
        this.Backward30,
        this.Backward,
        this.Ban,
        this.BarsFilterSlash,
        this.BarsFilter,
        this.BarsSort,
        this.Bars,
        this.BatteryExclamation,
        this.Battery0PercentBolt,
        this.Battery0Percent,
        this.Battery25PercentBolt,
        this.Battery25Percent,
        this.Battery50PercentBolt,
        this.Battery50Percent,
        this.Battery75PercentBolt,
        this.Battery75Percent,
        this.Battery100PercentBolt,
        this.Battery100Percent,
        this.BatteryQuestion,
        this.BellBadgeSlash,
        this.BellBadge,
        this.BellExclamation,
        this.BellOn,
        this.BellSlash,
        this.Bell,
        this.BluetoothConnected,
        this.BluetoothScan,
        this.BluetoothSlash,
        this.Bluetooth,
        this.BoltBadgeCheck,
        this.BoltBadgeClock,
        this.BoltBadgeCross,
        this.BoltCircle,
        this.BoltSlash,
        this.Bolt,
        this.BookmarkSlash,
        this.Bookmark,
        this.Bookmarks,
        this.Box,
        this.BrightnessAuto,
        this.BrightnessExclamation,
        this.BrightnessHigh,
        this.BrightnessLow,
        this.BrightnessMedium,
        this.BuildingColumnsPercentBottom,
        this.BuildingColumns,
        this.CalendarBadgeClock,
        this.CalendarBadgeExclamation,
        this.CalendarBadgeMinus,
        this.CalendarBadgePerson,
        this.CalendarBadgePlus,
        this.CalendarCheck,
        this.CalendarDay,
        this.CalendarEvent,
        this.CalendarRange,
        this.Calendar,
        this.CameraBadgeClock,
        this.CameraBadgeEllipsis,
        this.CameraBadgePlus,
        this.CameraRotate,
        this.Camera,
        this.CaretDownCircle,
        this.CaretDown,
        this.CaretLeft,
        this.CaretRight,
        this.CaretUp,
        this.CartBadgeClock,
        this.CartBadgeMinus,
        this.CartBadgePlus,
        this.CartBadgeQuestion,
        this.Cart,
        this.Category,
        this.ChartDonutSimple,
        this.ChartPieDollar,
        this.CheckBadge,
        this.CheckBox,
        this.CheckCircle,
        this.CheckDouble,
        this.CheckLine,
        this.CheckSmall,
        this.Check,
        this.ChevronDownCircle,
        this.ChevronDown,
        this.ChevronLeftCircle,
        this.ChevronLeftToLine,
        this.ChevronLeft,
        this.ChevronRightCircle,
        this.ChevronRightToLine,
        this.ChevronRight,
        this.ChevronUpCircle,
        this.ChevronUp,
        this.CircleDot,
        this.Circle,
        this.ClockAlarm,
        this.ClockBadgeCheck,
        this.ClockBadgeCross,
        this.ClockBadgeExclamation,
        this.ClockBadgeQuestion,
        this.ClockBadge,
        this.ClockRotateLeft,
        this.ClockRotateRight,
        this.ClockTimer,
        this.Clock,
        this.Code,
        this.CommentBars,
        this.CommentPlus,
        this.Compass,
        this.Compress,
        this.CreditCard,
        this.DeleteLeft,
        this.DeviceComputerApple,
        this.DeviceComputerArrowDown,
        this.DeviceComputerLock,
        this.DeviceComputerPlay,
        this.DeviceComputerSlash,
        this.DeviceComputerUnlock,
        this.DeviceComputerWindows,
        this.DeviceComputer,
        this.DeviceLaptopApple,
        this.DeviceLaptopBadgeDollar,
        this.DeviceLaptopLock,
        this.DeviceLaptopPlay,
        this.DeviceLaptopSlash,
        this.DeviceLaptopUnlock,
        this.DeviceLaptopWindows,
        this.DeviceLaptop,
        this.DeviceMobileAndroid,
        this.DeviceMobileAppleButton,
        this.DeviceMobileAppleIsland,
        this.DeviceMobileAppleNotch,
        this.DeviceMobileArrowDown,
        this.DeviceMobileSlash,
        this.DeviceMobile,
        this.DeviceTabletAndroid,
        this.DeviceTabletApple,
        this.DeviceTabletSlash,
        this.DeviceTablet,
        this.DeviceTv4K,
        this.DeviceTvSlash,
        this.DeviceTv,
        this.Devices,
        this.Diamond,
        this.DollarBadge,
        this.DollarRectangle,
        this.DollarRotate,
        this.Dollar,
        this.E,
        this.Eight,
        this.EllipsisGrid,
        this.EllipsisGripVertical,
        this.EllipsisHoriz,
        this.EllipsisVert,
        this.EnvelopeArrowRight,
        this.EnvelopeBadgePerson,
        this.EnvelopeBadge,
        this.EnvelopeCheck,
        this.EnvelopeFront,
        this.EnvelopeLock,
        this.EnvelopePaperClip,
        this.EnvelopePen,
        this.Envelope,
        this.Equalizer,
        this.Eraser,
        this.ExclamationCircle,
        this.ExclamationOctagon,
        this.Exclamation,
        this.Expend,
        this.EyeSlash,
        this.Eye,
        this.FaceSmile,
        this.Faxmachine,
        this.FileArrowDown,
        this.FileArrowUp,
        this.FileBadgeClock,
        this.FileBadgeEllipsis,
        this.FileBadgeGear,
        this.FileBadgePlus,
        this.FileLock,
        this.FileText,
        this.File,
        this.Fire,
        this.Five,
        this.FlashlightSlash,
        this.Flashlight,
        this.FolderBadgeGear,
        this.FolderBadgeMinus,
        this.FolderBadgePerson,
        this.FolderBadgePlus,
        this.FolderBadgeQuestion,
        this.FolderQuestion,
        this.Folder,
        this.ForkKnife,
        this.ForwardFast,
        this.Forward5,
        this.ForwardStep,
        this.Forward10,
        this.Forward30,
        this.Forward,
        this.Four,
        this.Gift,
        this.Globe,
        this.HeadphonesSlash,
        this.Headphones,
        this.Heart,
        this.Hexagon,
        this.HouseSlash,
        this.House,
        this.Hub,
        this.ICircle,
        this.I,
        this.ImageBadgeArrowDown,
        this.ImageBadgeCheck,
        this.ImageBadgeExclamation,
        this.ImageBadgePlus,
        this.ImageDashed,
        this.Image,
        this.KeySlash,
        this.Key,
        this.KeyboardEllipsis,
        this.KeyboardEye,
        this.Keyboard,
        this.LinkSlash,
        this.Link,
        this.List,
        this.LocationDotSlash,
        this.LocationDot,
        this.LockBadgeClock,
        this.LockSlash,
        this.Lock,
        this.M,
        this.MagnifyingGlassMinus,
        this.MagnifyingGlassOne,
        this.MagnifyingGlassPlus,
        this.MagnifyingGlass,
        this.MessageBadgeCheck,
        this.MessageBadgeClock,
        this.MessageBars,
        this.MessageCheck,
        this.MessageEllipsisHoriz,
        this.MessageEllipsisVert,
        this.MessageExclamation,
        this.MessageI,
        this.MessagePen,
        this.MessagePlus,
        this.MessageQuestion,
        this.MessageSms,
        this.Message,
        this.MicBadgeCross,
        this.MicBadgeEllipsis,
        this.MicBadgeMinus,
        this.MicBadgePlus,
        this.MicSlash,
        this.Mic,
        this.MinusBox,
        this.MinusCircle,
        this.MinusSmall,
        this.Minus,
        this.MoneyBill,
        this.N,
        this.NewRectangle,
        this.Nfc,
        this.Nine,
        this.One,
        this.Palette,
        this.PaperClipBadgeEllipsis,
        this.PaperClip,
        this.PaperPlaneBadgeCheck,
        this.PaperPlaneBadgeCross,
        this.PaperPlane,
        this.PasswordRectangle,
        this.PauseCircle,
        this.Pause,
        this.PenSlash,
        this.Pen,
        this.Pentagon,
        this.PhoneArrowDownLeft,
        this.PhoneArrowRight,
        this.PhoneArrowUpRight,
        this.PhoneBadgeCheck,
        this.PhoneBadgePlus,
        this.PhoneCall,
        this.PhoneDown,
        this.Phone,
        this.PiggyBank,
        this.PinSlash,
        this.Pin,
        this.PinCodeRectangle,
        this.PlayCircle,
        this.PlayPause,
        this.Play,
        this.PlusBox,
        this.PlusCircle,
        this.Plus,
        this.Podcasts,
        this.PowerOnOff,
        this.PrinterDotmatrix,
        this.Printer,
        this.QuestionBox,
        this.QuestionCircle,
        this.QuestionTooltip,
        this.Question,
        this.QuoteClosing,
        this.QuoteOpening,
        this.Radar,
        this.RecordingTape,
        this.RectangleLandscapeRotate,
        this.RectanglePortraitRotate,
        this.Redo,
        this.Repeat1,
        this.Repeat,
        this.ReplyAll,
        this.Reply,
        this.Resume,
        this.Review,
        this.Rotate,
        this.Rss,
        this.S,
        this.SackAdd,
        this.SackDollar,
        this.SackXMark,
        this.Sack,
        this.Scanner,
        this.Server,
        this.Seven,
        this.ShareAll,
        this.ShareNodes,
        this.ShieldCheck,
        this.ShieldExclamation,
        this.ShieldSlash,
        this.ShieldXMark,
        this.Shield,
        this.Shredder,
        this.Shuffle,
        this.SignalBadgeCross,
        this.SignalBadgeExclamation,
        this.Signal4,
        this.Signal1,
        this.SignalStreamSlash,
        this.SignalStream,
        this.Signal3,
        this.Signal2,
        this.Signal,
        this.Six,
        this.SpeakerMinus,
        this.SpeakerPlus,
        this.SpeakerWave1,
        this.SpeakerWave2,
        this.SpeakerXMark,
        this.Speaker,
        this.Star,
        this.StopCircle,
        this.Stop,
        this.Sun,
        this.TagSlash,
        this.Tag2,
        this.Tag,
        this.Three,
        this.ThumbDown,
        this.ThumbUp,
        this.ToggleOff,
        this.ToggleOn,
        this.TrashArrowUp,
        this.TrashCheck,
        this.TrashSlash,
        this.TrashXMark,
        this.Trash,
        this.Triangle,
        this.TShirt,
        this.Two,
        this.Undo,
        this.Unlock,
        this.UserBadgeBan,
        this.UserBadgeClock,
        this.UserBadgeGear,
        this.UserBadgeMagnifyingGlass,
        this.UserBadgeMinus,
        this.UserBadgePen,
        this.UserBadgePlus,
        this.UserBoxDashed,
        this.UserBox,
        this.UserCircle,
        this.UserGroup,
        this.User,
        this.VideoBadgeClock,
        this.VideoBadgeEllipsis,
        this.VideoBadgePlus,
        this.VideoPlus,
        this.VideoQuestion,
        this.VideoSlash,
        this.Video,
        this.W,
        this.Wallet,
        this.Warning,
        this.WaveformBadgeExclamation,
        this.WaveformBadgeMagnifyingGlass,
        this.WaveformBadgeMic,
        this.WaveformBadgeMinus,
        this.WaveformBadgePlus,
        this.WaveformSlash,
        this.Waveform,
        this.WifiExclamation,
        this.WifiSlash,
        this.WifiSpeed,
        this.WifiWave1,
        this.WifiWave2,
        this.WifiWave0,
        this.Wifi,
        this.XMarkCircle,
        this.XMarkOctagon,
        this.XMark,
        this.Zero,
    ).sortedBy { it.name }
}

fun PersianSymbols.Filled.getAllIcons(): List<ImageVector> {
    return listOf(
        this.AddressBook,
        this.AddressCardArrowDownBottom,
        this.AddressCardArrowUpTop,
        this.AddressCardBars,
        this.AddressCardEmail,
        this.ArrowDownCircle,
        this.ArrowLeftCircle,
        this.ArrowRightCircle,
        this.ArrowUpCircle,
        this.BackwardFast,
        this.BackwardStep,
        this.Backward,
        this.BatteryExclamation,
        this.BatteryQuestion,
        this.BellBadgeSlash,
        this.BellBadge,
        this.BellExclamation,
        this.BellOn,
        this.BellSlash,
        this.Bell,
        this.BoltBadgeCheck,
        this.BoltBadgeClock,
        this.BoltBadgeCross,
        this.BoltCircle,
        this.BoltSlash,
        this.Bolt,
        this.BookmarkSlash,
        this.Bookmark,
        this.Bookmarks,
        this.Box,
        this.BrightnessAuto,
        this.BrightnessExclamation,
        this.BrightnessHigh,
        this.BrightnessLow,
        this.BrightnessMedium,
        this.BuildingColumnsPercentBottom,
        this.BuildingColumns,
        this.CalendarBadgeClock,
        this.CalendarBadgeExclamation,
        this.CalendarBadgeMinus,
        this.CalendarBadgePerson,
        this.CalendarBadgePlus,
        this.CalendarCheck,
        this.CalendarDay,
        this.CalendarEvent,
        this.CalendarRange,
        this.Calendar,
        this.CameraBadgeClock,
        this.CameraBadgeEllipsis,
        this.CameraBadgePlus,
        this.CameraRotate,
        this.Camera,
        this.CaretDownCircle,
        this.CartBadgeClock,
        this.CartBadgeMinus,
        this.CartBadgePlus,
        this.CartBadgeQuestion,
        this.Cart,
        this.Category,
        this.ChartPieDollar,
        this.CheckBadge,
        this.CheckBox,
        this.CheckCircle,
        this.ChevronDownCircle,
        this.ChevronLeftCircle,
        this.ChevronRightCircle,
        this.CircleDot,
        this.Circle,
        this.ClockAlarm,
        this.ClockBadgeCheck,
        this.ClockBadgeCross,
        this.ClockBadgeExclamation,
        this.ClockBadgeQuestion,
        this.ClockBadge,
        this.ClockTimer,
        this.Clock,
        this.CommentBars,
        this.CommentPlus,
        this.Compass,
        this.CreditCard,
        this.DeleteLeft,
        this.DeviceComputerApple,
        this.DeviceComputerArrowDown,
        this.DeviceComputerLock,
        this.DeviceComputerPlay,
        this.DeviceComputerSlash,
        this.DeviceComputerUnlock,
        this.DeviceComputerWindows,
        this.DeviceComputer,
        this.DeviceLaptopApple,
        this.DeviceLaptopBadgeDollar,
        this.DeviceLaptopLock,
        this.DeviceLaptopPlay,
        this.DeviceLaptopSlash,
        this.DeviceLaptopUnlock,
        this.DeviceLaptopWindows,
        this.DeviceLaptop,
        this.DeviceMobileAndroid,
        this.DeviceMobileAppleButton,
        this.DeviceMobileAppleIsland,
        this.DeviceMobileAppleNotch,
        this.DeviceMobileArrowDown,
        this.DeviceMobileSlash,
        this.DeviceMobile,
        this.DeviceTabletAndroid,
        this.DeviceTabletApple,
        this.DeviceTabletSlash,
        this.DeviceTablet,
        this.DeviceTv4K,
        this.DeviceTvSlash,
        this.DeviceTv,
        this.Devices,
        this.Diamond,
        this.DollarBadge,
        this.DollarRectangle,
        this.EnvelopeArrowRight,
        this.EnvelopeBadgePerson,
        this.EnvelopeBadge,
        this.EnvelopeCheck,
        this.EnvelopeFront,
        this.EnvelopeLock,
        this.EnvelopePaperClip,
        this.EnvelopePen,
        this.Envelope,
        this.Eraser,
        this.ExclamationCircle,
        this.ExclamationOctagon,
        this.EyeSlash,
        this.Eye,
        this.FaceSmile,
        this.FileArrowDown,
        this.FileArrowUp,
        this.FileBadgeClock,
        this.FileBadgeEllipsis,
        this.FileBadgeGear,
        this.FileBadgePlus,
        this.FileLock,
        this.FileText,
        this.File,
        this.Fire,
        this.FlashlightSlash,
        this.Flashlight,
        this.FolderBadgeGear,
        this.FolderBadgeMinus,
        this.FolderBadgePerson,
        this.FolderBadgePlus,
        this.FolderBadgeQuestion,
        this.FolderQuestion,
        this.Folder,
        this.ForkKnife,
        this.ForwardFast,
        this.ForwardStep,
        this.Forward,
        this.Gift,
        this.Globe,
        this.HeadphonesSlash,
        this.Headphones,
        this.Heart,
        this.Hexagon,
        this.HouseSlash,
        this.House,
        this.Hub,
        this.ICircle,
        this.ImageBadgeArrowDown,
        this.ImageBadgeCheck,
        this.ImageBadgeExclamation,
        this.ImageBadgePlus,
        this.Image,
        this.KeySlash,
        this.Key,
        this.KeyboardEllipsis,
        this.KeyboardEye,
        this.Keyboard,
        this.LocationDotSlash,
        this.LocationDot,
        this.LockBadgeClock,
        this.LockSlash,
        this.Lock,
        this.MessageBadgeCheck,
        this.MessageBadgeClock,
        this.MessageBars,
        this.MessageCheck,
        this.MessageEllipsisHoriz,
        this.MessageEllipsisVert,
        this.MessageExclamation,
        this.MessageI,
        this.MessagePen,
        this.MessagePlus,
        this.MessageQuestion,
        this.MessageSms,
        this.Message,
        this.MicBadgeCross,
        this.MicBadgeEllipsis,
        this.MicBadgeMinus,
        this.MicBadgePlus,
        this.MicSlash,
        this.Mic,
        this.MinusBox,
        this.MinusCircle,
        this.MoneyBill,
        this.NewRectangle,
        this.Nfc,
        this.Palette,
        this.PaperPlaneBadgeCheck,
        this.PaperPlaneBadgeCross,
        this.PaperPlane,
        this.PasswordRectangle,
        this.PauseCircle,
        this.Pause,
        this.PenSlash,
        this.Pen,
        this.Pentagon,
        this.PhoneArrowDownLeft,
        this.PhoneArrowRight,
        this.PhoneArrowUpRight,
        this.PhoneBadgeCheck,
        this.PhoneBadgePlus,
        this.PhoneCall,
        this.PhoneDown,
        this.Phone,
        this.PiggyBank,
        this.PinSlash,
        this.Pin,
        this.PinCodeRectangle,
        this.PlayCircle,
        this.Play,
        this.PlusBox,
        this.PlusCircle,
        this.PrinterDotmatrix,
        this.Printer,
        this.QuestionBox,
        this.QuestionCircle,
        this.QuestionTooltip,
        this.QuoteClosing,
        this.QuoteOpening,
        this.RecordingTape,
        this.RectangleLandscapeRotate,
        this.RectanglePortraitRotate,
        this.Resume,
        this.Review,
        this.SackAdd,
        this.SackDollar,
        this.SackXMark,
        this.Sack,
        this.Scanner,
        this.Server,
        this.ShareNodes,
        this.ShieldCheck,
        this.ShieldExclamation,
        this.ShieldSlash,
        this.ShieldXMark,
        this.Shield,
        this.Shredder,
        this.SpeakerMinus,
        this.SpeakerPlus,
        this.SpeakerWave1,
        this.SpeakerWave2,
        this.SpeakerXMark,
        this.Speaker,
        this.Star,
        this.StopCircle,
        this.Stop,
        this.Sun,
        this.TagSlash,
        this.Tag2,
        this.Tag,
        this.ThumbDown,
        this.ThumbUp,
        this.ToggleOff,
        this.ToggleOn,
        this.TrashArrowUp,
        this.TrashCheck,
        this.TrashSlash,
        this.TrashXMark,
        this.Trash,
        this.Triangle,
        this.TShirt,
        this.Unlock,
        this.UserBadgeBan,
        this.UserBadgeClock,
        this.UserBadgeGear,
        this.UserBadgeMagnifyingGlass,
        this.UserBadgeMinus,
        this.UserBadgePen,
        this.UserBadgePlus,
        this.UserBoxDashed,
        this.UserBox,
        this.UserCircle,
        this.UserGroup,
        this.User,
        this.VideoBadgeClock,
        this.VideoBadgeEllipsis,
        this.VideoBadgePlus,
        this.VideoPlus,
        this.VideoQuestion,
        this.VideoSlash,
        this.Video,
        this.Wallet,
        this.Warning,
        this.XMarkCircle,
        this.XMarkOctagon,
    ).sortedBy { it.name }
}

fun PersianSymbols.getAllIcons(): List<ImageVector> {
    return buildList {
        addAll(PersianSymbols.Default.getAllIcons())
        addAll(PersianSymbols.Filled.getAllIcons())
    }.sortedBy { it.name }
}