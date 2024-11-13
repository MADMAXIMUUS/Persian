package io.github.madmaximuus.persianSymbols.foundation

import androidx.compose.ui.graphics.vector.ImageVector
import io.github.madmaximuus.persianSymbols.a.A
import io.github.madmaximuus.persianSymbols.address.book.AddressBook
import io.github.madmaximuus.persianSymbols.address.card.arrowDown.bottom.AddressCardArrowDownBottom
import io.github.madmaximuus.persianSymbols.address.card.arrowUp.top.AddressCardArrowUpTop
import io.github.madmaximuus.persianSymbols.address.card.bars.AddressCardBars
import io.github.madmaximuus.persianSymbols.address.card.email.AddressCardEmail
import io.github.madmaximuus.persianSymbols.arrow.down.ArrowDown
import io.github.madmaximuus.persianSymbols.arrow.down.circle.ArrowDownCircle
import io.github.madmaximuus.persianSymbols.arrow.down.toBracket.ArrowDownToBracket
import io.github.madmaximuus.persianSymbols.arrow.down.toBracket.checked.top.ArrowDownToBracketCheckTop
import io.github.madmaximuus.persianSymbols.arrow.down.toBracket.cross.top.ArrowDownToBracketCrossTop
import io.github.madmaximuus.persianSymbols.arrow.left.ArrowLeft
import io.github.madmaximuus.persianSymbols.arrow.left.arrowRight.ArrowLeftArrowRight
import io.github.madmaximuus.persianSymbols.arrow.left.circle.ArrowLeftCircle
import io.github.madmaximuus.persianSymbols.arrow.left.down.arrowRightUp.fromCenter.ArrowLeftDownArrowRightUpFromCenter
import io.github.madmaximuus.persianSymbols.arrow.right.ArrowRight
import io.github.madmaximuus.persianSymbols.arrow.right.circle.ArrowRightCircle
import io.github.madmaximuus.persianSymbols.arrow.right.fromBracket.ArrowRightFromBracket
import io.github.madmaximuus.persianSymbols.arrow.right.rotate.ArrowRightRotate
import io.github.madmaximuus.persianSymbols.arrow.right.toBracket.ArrowRightToBracket
import io.github.madmaximuus.persianSymbols.arrow.right.up.fromBox.ArrowRightUpFromBox
import io.github.madmaximuus.persianSymbols.arrow.trend.down.ArrowTrendDown
import io.github.madmaximuus.persianSymbols.arrow.trend.up.ArrowTrendUp
import io.github.madmaximuus.persianSymbols.arrow.up.ArrowUp
import io.github.madmaximuus.persianSymbols.arrow.up.circle.ArrowUpCircle
import io.github.madmaximuus.persianSymbols.arrow.up.fromBracket.ArrowUpFromBracket
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
import io.github.madmaximuus.persianSymbols.battery.empty.BatteryEmpty
import io.github.madmaximuus.persianSymbols.battery.empty.bolt.BatteryEmptyBolt
import io.github.madmaximuus.persianSymbols.battery.exclamation.BatteryExclamation
import io.github.madmaximuus.persianSymbols.battery.five.Battery5
import io.github.madmaximuus.persianSymbols.battery.five.bolt.Battery5Bolt
import io.github.madmaximuus.persianSymbols.battery.four.Battery4
import io.github.madmaximuus.persianSymbols.battery.four.bolt.Battery4Bolt
import io.github.madmaximuus.persianSymbols.battery.full.BatteryFull
import io.github.madmaximuus.persianSymbols.battery.full.bolt.BatteryFullBolt
import io.github.madmaximuus.persianSymbols.battery.one.Battery1
import io.github.madmaximuus.persianSymbols.battery.one.bolt.Battery1Bolt
import io.github.madmaximuus.persianSymbols.battery.question.BatteryQuestion
import io.github.madmaximuus.persianSymbols.battery.six.Battery6
import io.github.madmaximuus.persianSymbols.battery.six.bolt.Battery6Bolt
import io.github.madmaximuus.persianSymbols.battery.three.Battery3
import io.github.madmaximuus.persianSymbols.battery.three.bolt.Battery3Bolt
import io.github.madmaximuus.persianSymbols.battery.two.Battery2
import io.github.madmaximuus.persianSymbols.battery.two.bolt.Battery2Bolt
import io.github.madmaximuus.persianSymbols.bell.Bell
import io.github.madmaximuus.persianSymbols.bell.exclamation.BellExclamation
import io.github.madmaximuus.persianSymbols.bell.on.BellOn
import io.github.madmaximuus.persianSymbols.bluetooth.Bluetooth
import io.github.madmaximuus.persianSymbols.bluetooth.connected.BluetoothConnected
import io.github.madmaximuus.persianSymbols.bluetooth.scan.BluetoothScan
import io.github.madmaximuus.persianSymbols.bluetooth.slash.BluetoothSlash
import io.github.madmaximuus.persianSymbols.bolt.Bolt
import io.github.madmaximuus.persianSymbols.bolt.circle.BoltCircle
import io.github.madmaximuus.persianSymbols.bookmark.Bookmark
import io.github.madmaximuus.persianSymbols.box.Box
import io.github.madmaximuus.persianSymbols.brightness.auto.BrightnessAuto
import io.github.madmaximuus.persianSymbols.brightness.exclamation.BrightnessExclamation
import io.github.madmaximuus.persianSymbols.brightness.high.BrightnessHigh
import io.github.madmaximuus.persianSymbols.brightness.low.BrightnessLow
import io.github.madmaximuus.persianSymbols.brightness.medium.BrightnessMedium
import io.github.madmaximuus.persianSymbols.building.columns.BuildingColumns
import io.github.madmaximuus.persianSymbols.building.columns.percent.bottom.BuildingColumnsPercentBottom
import io.github.madmaximuus.persianSymbols.calendar.Calendar
import io.github.madmaximuus.persianSymbols.calendar.check.CalendarCheck
import io.github.madmaximuus.persianSymbols.calendar.day.CalendarDay
import io.github.madmaximuus.persianSymbols.calendar.days.CalendarDays
import io.github.madmaximuus.persianSymbols.calendar.event.CalendarEvent
import io.github.madmaximuus.persianSymbols.calendar.range.CalendarRange
import io.github.madmaximuus.persianSymbols.camera.Camera
import io.github.madmaximuus.persianSymbols.camera.plus.CameraPlus
import io.github.madmaximuus.persianSymbols.camera.video.CameraVideo
import io.github.madmaximuus.persianSymbols.camera.video.plus.CameraVideoPlus
import io.github.madmaximuus.persianSymbols.camera.video.slash.CameraVideoSlash
import io.github.madmaximuus.persianSymbols.caretDown.CaretDown
import io.github.madmaximuus.persianSymbols.caretDown.circle.CaretDownCircle
import io.github.madmaximuus.persianSymbols.caretLeft.CaretLeft
import io.github.madmaximuus.persianSymbols.caretRight.CaretRight
import io.github.madmaximuus.persianSymbols.caretUp.CaretUp
import io.github.madmaximuus.persianSymbols.cart.shopping.CartShopping
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
import io.github.madmaximuus.persianSymbols.chevronDown.ChevronDown
import io.github.madmaximuus.persianSymbols.chevronDown.circle.ChevronDownCircle
import io.github.madmaximuus.persianSymbols.chevronLeft.ChevronLeft
import io.github.madmaximuus.persianSymbols.chevronLeft.toLine.ChevronLeftToLine
import io.github.madmaximuus.persianSymbols.chevronRight.ChevronRight
import io.github.madmaximuus.persianSymbols.chevronRight.toLine.ChevronRightToLine
import io.github.madmaximuus.persianSymbols.chevronUp.ChevronUp
import io.github.madmaximuus.persianSymbols.chevronUp.circle.ChevronUpCircle
import io.github.madmaximuus.persianSymbols.circle.Circle
import io.github.madmaximuus.persianSymbols.circle.dot.CircleDot
import io.github.madmaximuus.persianSymbols.clock.Clock
import io.github.madmaximuus.persianSymbols.clock.alarm.ClockAlarm
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
import io.github.madmaximuus.persianSymbols.device.computer.arrowDown.top.DeviceComputerArrowDownTop
import io.github.madmaximuus.persianSymbols.device.computer.mac.DeviceComputerMac
import io.github.madmaximuus.persianSymbols.device.computer.unknown.DeviceComputerUnknown
import io.github.madmaximuus.persianSymbols.device.computer.windows.DeviceComputerWindows
import io.github.madmaximuus.persianSymbols.device.laptop.macbook.DeviceLaptopMacbook
import io.github.madmaximuus.persianSymbols.device.laptop.unknown.DeviceLaptopUnknown
import io.github.madmaximuus.persianSymbols.device.laptop.unknown.dollar.bottom.DeviceLaptopUnknownDollarBottom
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
import io.github.madmaximuus.persianSymbols.diamond.Diamond
import io.github.madmaximuus.persianSymbols.dollar.Dollar
import io.github.madmaximuus.persianSymbols.dollar.badge.DollarBadge
import io.github.madmaximuus.persianSymbols.dollar.rectangle.DollarRectangle
import io.github.madmaximuus.persianSymbols.dollar.rotate.DollarRotate
import io.github.madmaximuus.persianSymbols.e.E
import io.github.madmaximuus.persianSymbols.eight.Eight
import io.github.madmaximuus.persianSymbols.ellepsis.grid.EllipsisGrid
import io.github.madmaximuus.persianSymbols.ellepsis.grip.EllipsisGripVertical
import io.github.madmaximuus.persianSymbols.ellepsis.horiz.EllipsisHoriz
import io.github.madmaximuus.persianSymbols.ellepsis.vert.EllipsisVert
import io.github.madmaximuus.persianSymbols.envelope.Envelope
import io.github.madmaximuus.persianSymbols.envelope.arrowRight.bottom.EnvelopeArrowRightBottom
import io.github.madmaximuus.persianSymbols.envelope.check.EnvelopeCheck
import io.github.madmaximuus.persianSymbols.envelope.dot.EnvelopeDot
import io.github.madmaximuus.persianSymbols.envelope.lock.EnvelopeLock
import io.github.madmaximuus.persianSymbols.envelope.paperClip.EnvelopePaperClip
import io.github.madmaximuus.persianSymbols.envelope.pen.EnvelopePen
import io.github.madmaximuus.persianSymbols.equalizer.Equalizer
import io.github.madmaximuus.persianSymbols.exclamation.Exclamation
import io.github.madmaximuus.persianSymbols.exclamation.circle.ExclamationCircle
import io.github.madmaximuus.persianSymbols.exclamation.octagon.ExclamationOctagon
import io.github.madmaximuus.persianSymbols.expend.Expend
import io.github.madmaximuus.persianSymbols.eye.Eye
import io.github.madmaximuus.persianSymbols.eye.slash.EyeSlash
import io.github.madmaximuus.persianSymbols.face.smile.FaceSmile
import io.github.madmaximuus.persianSymbols.file.File
import io.github.madmaximuus.persianSymbols.flashlight.Flashlight
import io.github.madmaximuus.persianSymbols.flashlight.slash.FlashlightSlash
import io.github.madmaximuus.persianSymbols.forward.Forward
import io.github.madmaximuus.persianSymbols.forward.fast.ForwardFast
import io.github.madmaximuus.persianSymbols.forward.five.Forward5
import io.github.madmaximuus.persianSymbols.forward.step.ForwardStep
import io.github.madmaximuus.persianSymbols.forward.ten.Forward10
import io.github.madmaximuus.persianSymbols.forward.thirty.Forward30
import io.github.madmaximuus.persianSymbols.four.Four
import io.github.madmaximuus.persianSymbols.gear.Gear
import io.github.madmaximuus.persianSymbols.gift.Gift
import io.github.madmaximuus.persianSymbols.globe.Globe
import io.github.madmaximuus.persianSymbols.heart.Heart
import io.github.madmaximuus.persianSymbols.hexagon.Hexagon
import io.github.madmaximuus.persianSymbols.house.House
import io.github.madmaximuus.persianSymbols.hub.Hub
import io.github.madmaximuus.persianSymbols.i.I
import io.github.madmaximuus.persianSymbols.i.circle.ICircle
import io.github.madmaximuus.persianSymbols.image.Image
import io.github.madmaximuus.persianSymbols.image.dashed.ImageDashed
import io.github.madmaximuus.persianSymbols.key.Key
import io.github.madmaximuus.persianSymbols.keyboard.Keyboard
import io.github.madmaximuus.persianSymbols.link.Link
import io.github.madmaximuus.persianSymbols.link.slash.LinkSlash
import io.github.madmaximuus.persianSymbols.location.dot.LocationDot
import io.github.madmaximuus.persianSymbols.location.dot.slash.LocationDotSlash
import io.github.madmaximuus.persianSymbols.lock.Lock
import io.github.madmaximuus.persianSymbols.m.M
import io.github.madmaximuus.persianSymbols.magnifyingGlass.MagnifyingGlass
import io.github.madmaximuus.persianSymbols.message.Message
import io.github.madmaximuus.persianSymbols.message.bars.MessageBars
import io.github.madmaximuus.persianSymbols.message.check.MessageCheck
import io.github.madmaximuus.persianSymbols.message.exclamation.MessageExclamation
import io.github.madmaximuus.persianSymbols.message.question.MessageQuestion
import io.github.madmaximuus.persianSymbols.message.sms.MessageSms
import io.github.madmaximuus.persianSymbols.mic.Mic
import io.github.madmaximuus.persianSymbols.mic.slash.MicSlash
import io.github.madmaximuus.persianSymbols.minus.Minus
import io.github.madmaximuus.persianSymbols.minus.box.MinusBox
import io.github.madmaximuus.persianSymbols.minus.circle.MinusCircle
import io.github.madmaximuus.persianSymbols.minus.small.MinusSmall
import io.github.madmaximuus.persianSymbols.money.bill.MoneyBill
import io.github.madmaximuus.persianSymbols.moon.Moon
import io.github.madmaximuus.persianSymbols.n.N
import io.github.madmaximuus.persianSymbols.newLabel.rectangle.NewRectangle
import io.github.madmaximuus.persianSymbols.nfc.Nfc
import io.github.madmaximuus.persianSymbols.nine.Nine
import io.github.madmaximuus.persianSymbols.one.One
import io.github.madmaximuus.persianSymbols.pallete.Palette
import io.github.madmaximuus.persianSymbols.paperClip.PaperClip
import io.github.madmaximuus.persianSymbols.paperPlane.PaperPlane
import io.github.madmaximuus.persianSymbols.paperPlane.check.PaperPlaneCheck
import io.github.madmaximuus.persianSymbols.paperPlane.xmark.PaperPlaneXMark
import io.github.madmaximuus.persianSymbols.password.rectangle.PasswordRectangle
import io.github.madmaximuus.persianSymbols.pause.Pause
import io.github.madmaximuus.persianSymbols.pause.circle.PauseCircle
import io.github.madmaximuus.persianSymbols.pen.Pen
import io.github.madmaximuus.persianSymbols.pentagon.Pentagon
import io.github.madmaximuus.persianSymbols.phone.Phone
import io.github.madmaximuus.persianSymbols.phone.call.PhoneCall
import io.github.madmaximuus.persianSymbols.piggyBank.PiggyBank
import io.github.madmaximuus.persianSymbols.pin.Pin
import io.github.madmaximuus.persianSymbols.pinCode.rectangle.PinCodeRectangle
import io.github.madmaximuus.persianSymbols.play.Play
import io.github.madmaximuus.persianSymbols.play.circle.PlayCircle
import io.github.madmaximuus.persianSymbols.play.pause.PlayPause
import io.github.madmaximuus.persianSymbols.plus.Plus
import io.github.madmaximuus.persianSymbols.plus.box.PlusBox
import io.github.madmaximuus.persianSymbols.plus.circle.PlusCircle
import io.github.madmaximuus.persianSymbols.podcasts.Podcasts
import io.github.madmaximuus.persianSymbols.powerOnOff.PowerOnOff
import io.github.madmaximuus.persianSymbols.question.Question
import io.github.madmaximuus.persianSymbols.question.box.QuestionBox
import io.github.madmaximuus.persianSymbols.question.circle.QuestionCircle
import io.github.madmaximuus.persianSymbols.question.tooltip.QuestionTooltip
import io.github.madmaximuus.persianSymbols.radar.Radar
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
import io.github.madmaximuus.persianSymbols.sack.dollar.SackDollar
import io.github.madmaximuus.persianSymbols.sack.xMark.SackXMark
import io.github.madmaximuus.persianSymbols.seven.Seven
import io.github.madmaximuus.persianSymbols.share.all.ShareAll
import io.github.madmaximuus.persianSymbols.share.nodes.ShareNodes
import io.github.madmaximuus.persianSymbols.shield.check.ShieldCheck
import io.github.madmaximuus.persianSymbols.shield.exclamation.ShieldExclamation
import io.github.madmaximuus.persianSymbols.shield.xmark.ShieldXMark
import io.github.madmaximuus.persianSymbols.shirt.ShirtDefault
import io.github.madmaximuus.persianSymbols.shredder.Shredder
import io.github.madmaximuus.persianSymbols.shufle.Shuffle
import io.github.madmaximuus.persianSymbols.sigmal.Signal
import io.github.madmaximuus.persianSymbols.sigmal.exclamation.SignalExclamation
import io.github.madmaximuus.persianSymbols.sigmal.four.Signal4
import io.github.madmaximuus.persianSymbols.sigmal.stream.SignalStream
import io.github.madmaximuus.persianSymbols.sigmal.stream.slash.SignalStreamSlash
import io.github.madmaximuus.persianSymbols.sigmal.stream.two.slash.SignalStream2Slash
import io.github.madmaximuus.persianSymbols.sigmal.three.Signal3
import io.github.madmaximuus.persianSymbols.sigmal.two.Signal2
import io.github.madmaximuus.persianSymbols.sigmal.xmark.SignalXMark
import io.github.madmaximuus.persianSymbols.six.Six
import io.github.madmaximuus.persianSymbols.speech.Speech
import io.github.madmaximuus.persianSymbols.star.Star
import io.github.madmaximuus.persianSymbols.stop.Stop
import io.github.madmaximuus.persianSymbols.stop.circle.StopCircle
import io.github.madmaximuus.persianSymbols.sun.Sun
import io.github.madmaximuus.persianSymbols.tag.Tag
import io.github.madmaximuus.persianSymbols.tag.slash.TagSlash
import io.github.madmaximuus.persianSymbols.tag.two.Tag2
import io.github.madmaximuus.persianSymbols.three.Three
import io.github.madmaximuus.persianSymbols.thumb.down.ThumbDown
import io.github.madmaximuus.persianSymbols.thumb.up.ThumbUp
import io.github.madmaximuus.persianSymbols.toggle.off.ToggleOff
import io.github.madmaximuus.persianSymbols.toggle.on.ToggleOn
import io.github.madmaximuus.persianSymbols.trash.Trash
import io.github.madmaximuus.persianSymbols.trash.arrowUp.TrashArrowUp
import io.github.madmaximuus.persianSymbols.trash.check.TrashCheck
import io.github.madmaximuus.persianSymbols.trash.xMark.TrashXMark
import io.github.madmaximuus.persianSymbols.triangle.Triangle
import io.github.madmaximuus.persianSymbols.two.Two
import io.github.madmaximuus.persianSymbols.undo.Undo
import io.github.madmaximuus.persianSymbols.unlock.Unlock
import io.github.madmaximuus.persianSymbols.user.User
import io.github.madmaximuus.persianSymbols.user.ban.UserBan
import io.github.madmaximuus.persianSymbols.user.box.UserBox
import io.github.madmaximuus.persianSymbols.user.box.dashed.UserBoxDashed
import io.github.madmaximuus.persianSymbols.user.circle.UserCircle
import io.github.madmaximuus.persianSymbols.user.gear.UserGear
import io.github.madmaximuus.persianSymbols.user.magnifyingGlass.UserMagnifyingGlass
import io.github.madmaximuus.persianSymbols.user.minus.UserMinus
import io.github.madmaximuus.persianSymbols.user.pen.UserPen
import io.github.madmaximuus.persianSymbols.user.plus.UserPlus
import io.github.madmaximuus.persianSymbols.utensils.Utensils
import io.github.madmaximuus.persianSymbols.volume.high.VolumeHigh
import io.github.madmaximuus.persianSymbols.volume.low.VolumeLow
import io.github.madmaximuus.persianSymbols.volume.off.VolumeOff
import io.github.madmaximuus.persianSymbols.volume.slash.VolumeSlash
import io.github.madmaximuus.persianSymbols.volume.xmark.VolumeXMark
import io.github.madmaximuus.persianSymbols.w.W
import io.github.madmaximuus.persianSymbols.wallet.Wallet
import io.github.madmaximuus.persianSymbols.warning.Warning
import io.github.madmaximuus.persianSymbols.wifi.Wifi
import io.github.madmaximuus.persianSymbols.wifi.exclamation.WifiExclamation
import io.github.madmaximuus.persianSymbols.wifi.one.Wifi1
import io.github.madmaximuus.persianSymbols.wifi.slash.WifiSlash
import io.github.madmaximuus.persianSymbols.wifi.speed.WifiSpeed
import io.github.madmaximuus.persianSymbols.wifi.three.Wifi3
import io.github.madmaximuus.persianSymbols.wifi.two.Wifi2
import io.github.madmaximuus.persianSymbols.xmark.XMark
import io.github.madmaximuus.persianSymbols.xmark.circle.XMarkCircle
import io.github.madmaximuus.persianSymbols.xmark.octagon.XMarkOctagon
import io.github.madmaximuus.persianSymbols.zero.Zero

fun PersianSymbols.Default.getAllIcons(): List<ImageVector> {
    return listOf(
        PersianSymbols.Default.A,
        PersianSymbols.Default.AddressBook,
        PersianSymbols.Default.AddressCardArrowDownBottom,
        PersianSymbols.Default.AddressCardArrowUpTop,
        PersianSymbols.Default.AddressCardBars,
        PersianSymbols.Default.AddressCardEmail,
        PersianSymbols.Default.ArrowDownCircle,
        PersianSymbols.Default.ArrowDownToBracketCheckTop,
        PersianSymbols.Default.ArrowDownToBracketCrossTop,
        PersianSymbols.Default.ArrowDownToBracket,
        PersianSymbols.Default.ArrowDown,
        PersianSymbols.Default.ArrowLeftArrowRight,
        PersianSymbols.Default.ArrowLeftCircle,
        PersianSymbols.Default.ArrowLeftDownArrowRightUpFromCenter,
        PersianSymbols.Default.ArrowLeft,
        PersianSymbols.Default.ArrowRightCircle,
        PersianSymbols.Default.ArrowRightFromBracket,
        PersianSymbols.Default.ArrowRightRotate,
        PersianSymbols.Default.ArrowRightToBracket,
        PersianSymbols.Default.ArrowRightUpFromBox,
        PersianSymbols.Default.ArrowRight,
        PersianSymbols.Default.ArrowTrendDown,
        PersianSymbols.Default.ArrowTrendUp,
        PersianSymbols.Default.ArrowUpCircle,
        PersianSymbols.Default.ArrowUpFromBracket,
        PersianSymbols.Default.ArrowUp,
        PersianSymbols.Default.At,
        PersianSymbols.Default.BackwardFast,
        PersianSymbols.Default.Backward5,
        PersianSymbols.Default.BackwardStep,
        PersianSymbols.Default.Backward10,
        PersianSymbols.Default.Backward30,
        PersianSymbols.Default.Backward,
        PersianSymbols.Default.Ban,
        PersianSymbols.Default.BarsFilterSlash,
        PersianSymbols.Default.BarsFilter,
        PersianSymbols.Default.BarsSort,
        PersianSymbols.Default.Bars,
        PersianSymbols.Default.BatteryEmptyBolt,
        PersianSymbols.Default.BatteryEmpty,
        PersianSymbols.Default.BatteryExclamation,
        PersianSymbols.Default.Battery5Bolt,
        PersianSymbols.Default.Battery5,
        PersianSymbols.Default.Battery4Bolt,
        PersianSymbols.Default.Battery4,
        PersianSymbols.Default.BatteryFullBolt,
        PersianSymbols.Default.BatteryFull,
        PersianSymbols.Default.Battery1Bolt,
        PersianSymbols.Default.Battery1,
        PersianSymbols.Default.BatteryQuestion,
        PersianSymbols.Default.Battery6Bolt,
        PersianSymbols.Default.Battery6,
        PersianSymbols.Default.Battery3Bolt,
        PersianSymbols.Default.Battery3,
        PersianSymbols.Default.Battery2Bolt,
        PersianSymbols.Default.Battery2,
        PersianSymbols.Default.BellExclamation,
        PersianSymbols.Default.BellOn,
        PersianSymbols.Default.Bell,
        PersianSymbols.Default.BluetoothConnected,
        PersianSymbols.Default.BluetoothScan,
        PersianSymbols.Default.BluetoothSlash,
        PersianSymbols.Default.Bluetooth,
        PersianSymbols.Default.BoltCircle,
        PersianSymbols.Default.Bolt,
        PersianSymbols.Default.Bookmark,
        PersianSymbols.Default.Box,
        PersianSymbols.Default.BrightnessAuto,
        PersianSymbols.Default.BrightnessExclamation,
        PersianSymbols.Default.BrightnessHigh,
        PersianSymbols.Default.BrightnessLow,
        PersianSymbols.Default.BrightnessMedium,
        PersianSymbols.Default.BuildingColumnsPercentBottom,
        PersianSymbols.Default.BuildingColumns,
        PersianSymbols.Default.CalendarCheck,
        PersianSymbols.Default.CalendarDay,
        PersianSymbols.Default.CalendarDays,
        PersianSymbols.Default.CalendarEvent,
        PersianSymbols.Default.CalendarRange,
        PersianSymbols.Default.Calendar,
        PersianSymbols.Default.CameraPlus,
        PersianSymbols.Default.CameraVideoPlus,
        PersianSymbols.Default.CameraVideoSlash,
        PersianSymbols.Default.CameraVideo,
        PersianSymbols.Default.Camera,
        PersianSymbols.Default.CaretDownCircle,
        PersianSymbols.Default.CaretDown,
        PersianSymbols.Default.CaretLeft,
        PersianSymbols.Default.CaretRight,
        PersianSymbols.Default.CaretUp,
        PersianSymbols.Default.CartShopping,
        PersianSymbols.Default.Category,
        PersianSymbols.Default.ChartDonutSimple,
        PersianSymbols.Default.ChartPieDollar,
        PersianSymbols.Default.CheckBadge,
        PersianSymbols.Default.CheckBox,
        PersianSymbols.Default.CheckCircle,
        PersianSymbols.Default.CheckDouble,
        PersianSymbols.Default.CheckLine,
        PersianSymbols.Default.CheckSmall,
        PersianSymbols.Default.Check,
        PersianSymbols.Default.ChevronDownCircle,
        PersianSymbols.Default.ChevronDown,
        PersianSymbols.Default.ChevronLeftToLine,
        PersianSymbols.Default.ChevronLeft,
        PersianSymbols.Default.ChevronRightToLine,
        PersianSymbols.Default.ChevronRight,
        PersianSymbols.Default.ChevronUpCircle,
        PersianSymbols.Default.ChevronUp,
        PersianSymbols.Default.CircleDot,
        PersianSymbols.Default.Circle,
        PersianSymbols.Default.ClockAlarm,
        PersianSymbols.Default.ClockRotateLeft,
        PersianSymbols.Default.ClockRotateRight,
        PersianSymbols.Default.ClockTimer,
        PersianSymbols.Default.Clock,
        PersianSymbols.Default.Code,
        PersianSymbols.Default.CommentBars,
        PersianSymbols.Default.CommentPlus,
        PersianSymbols.Default.Compass,
        PersianSymbols.Default.Compress,
        PersianSymbols.Default.CreditCard,
        PersianSymbols.Default.DeleteLeft,
        PersianSymbols.Default.DeviceComputerArrowDownTop,
        PersianSymbols.Default.DeviceComputerMac,
        PersianSymbols.Default.DeviceComputerUnknown,
        PersianSymbols.Default.DeviceComputerWindows,
        PersianSymbols.Default.DeviceLaptopMacbook,
        PersianSymbols.Default.DeviceLaptopUnknownDollarBottom,
        PersianSymbols.Default.DeviceLaptopUnknown,
        PersianSymbols.Default.DeviceLaptopWindows,
        PersianSymbols.Default.DeviceMobileAndroid,
        PersianSymbols.Default.DeviceMobileArrowDownTop,
        PersianSymbols.Default.DeviceMobileIPhone1,
        PersianSymbols.Default.DeviceMobileIPhone3,
        PersianSymbols.Default.DeviceMobileIPhone2,
        PersianSymbols.Default.DeviceMobileUnknown,
        PersianSymbols.Default.DeviceTabletAndroid,
        PersianSymbols.Default.DeviceTabletIPad,
        PersianSymbols.Default.DeviceTabletUnknown,
        PersianSymbols.Default.DeviceTv,
        PersianSymbols.Default.Devices,
        PersianSymbols.Default.Diamond,
        PersianSymbols.Default.DollarBadge,
        PersianSymbols.Default.DollarRectangle,
        PersianSymbols.Default.DollarRotate,
        PersianSymbols.Default.Dollar,
        PersianSymbols.Default.E,
        PersianSymbols.Default.Eight,
        PersianSymbols.Default.EllipsisGrid,
        PersianSymbols.Default.EllipsisGripVertical,
        PersianSymbols.Default.EllipsisHoriz,
        PersianSymbols.Default.EllipsisVert,
        PersianSymbols.Default.EnvelopeArrowRightBottom,
        PersianSymbols.Default.EnvelopeCheck,
        PersianSymbols.Default.EnvelopeDot,
        PersianSymbols.Default.EnvelopeLock,
        PersianSymbols.Default.EnvelopePaperClip,
        PersianSymbols.Default.EnvelopePen,
        PersianSymbols.Default.Envelope,
        PersianSymbols.Default.Equalizer,
        PersianSymbols.Default.ExclamationCircle,
        PersianSymbols.Default.ExclamationOctagon,
        PersianSymbols.Default.Exclamation,
        PersianSymbols.Default.Expend,
        PersianSymbols.Default.EyeSlash,
        PersianSymbols.Default.Eye,
        PersianSymbols.Default.FaceSmile,
        PersianSymbols.Default.File,
        PersianSymbols.Default.FlashlightSlash,
        PersianSymbols.Default.Flashlight,
        PersianSymbols.Default.ForwardFast,
        PersianSymbols.Default.Forward5,
        PersianSymbols.Default.ForwardStep,
        PersianSymbols.Default.Forward10,
        PersianSymbols.Default.Forward30,
        PersianSymbols.Default.Forward,
        PersianSymbols.Default.Four,
        PersianSymbols.Default.Gear,
        PersianSymbols.Default.Gift,
        PersianSymbols.Default.Globe,
        PersianSymbols.Default.Heart,
        PersianSymbols.Default.Hexagon,
        PersianSymbols.Default.House,
        PersianSymbols.Default.Hub,
        PersianSymbols.Default.ICircle,
        PersianSymbols.Default.I,
        PersianSymbols.Default.ImageDashed,
        PersianSymbols.Default.Image,
        PersianSymbols.Default.Key,
        PersianSymbols.Default.Keyboard,
        PersianSymbols.Default.LinkSlash,
        PersianSymbols.Default.Link,
        PersianSymbols.Default.LocationDotSlash,
        PersianSymbols.Default.LocationDot,
        PersianSymbols.Default.Lock,
        PersianSymbols.Default.M,
        PersianSymbols.Default.MagnifyingGlass,
        PersianSymbols.Default.MessageBars,
        PersianSymbols.Default.MessageCheck,
        PersianSymbols.Default.MessageExclamation,
        PersianSymbols.Default.MessageQuestion,
        PersianSymbols.Default.MessageSms,
        PersianSymbols.Default.Message,
        PersianSymbols.Default.MicSlash,
        PersianSymbols.Default.Mic,
        PersianSymbols.Default.MinusBox,
        PersianSymbols.Default.MinusCircle,
        PersianSymbols.Default.MinusSmall,
        PersianSymbols.Default.Minus,
        PersianSymbols.Default.MoneyBill,
        PersianSymbols.Default.Moon,
        PersianSymbols.Default.N,
        PersianSymbols.Default.NewRectangle,
        PersianSymbols.Default.Nfc,
        PersianSymbols.Default.Nine,
        PersianSymbols.Default.One,
        PersianSymbols.Default.Palette,
        PersianSymbols.Default.PaperClip,
        PersianSymbols.Default.PaperPlaneCheck,
        PersianSymbols.Default.PaperPlaneXMark,
        PersianSymbols.Default.PaperPlane,
        PersianSymbols.Default.PasswordRectangle,
        PersianSymbols.Default.PauseCircle,
        PersianSymbols.Default.Pause,
        PersianSymbols.Default.Pen,
        PersianSymbols.Default.Pentagon,
        PersianSymbols.Default.PhoneCall,
        PersianSymbols.Default.Phone,
        PersianSymbols.Default.PiggyBank,
        PersianSymbols.Default.Pin,
        PersianSymbols.Default.PinCodeRectangle,
        PersianSymbols.Default.PlayCircle,
        PersianSymbols.Default.PlayPause,
        PersianSymbols.Default.Play,
        PersianSymbols.Default.PlusBox,
        PersianSymbols.Default.PlusCircle,
        PersianSymbols.Default.Plus,
        PersianSymbols.Default.Podcasts,
        PersianSymbols.Default.PowerOnOff,
        PersianSymbols.Default.QuestionBox,
        PersianSymbols.Default.QuestionCircle,
        PersianSymbols.Default.QuestionTooltip,
        PersianSymbols.Default.Question,
        PersianSymbols.Default.Radar,
        PersianSymbols.Default.Redo,
        PersianSymbols.Default.Repeat1,
        PersianSymbols.Default.Repeat,
        PersianSymbols.Default.ReplyAll,
        PersianSymbols.Default.Reply,
        PersianSymbols.Default.Resume,
        PersianSymbols.Default.Review,
        PersianSymbols.Default.Rotate,
        PersianSymbols.Default.Rss,
        PersianSymbols.Default.S,
        PersianSymbols.Default.SackDollar,
        PersianSymbols.Default.SackXMark,
        PersianSymbols.Default.Sack,
        PersianSymbols.Default.Seven,
        PersianSymbols.Default.ShareAll,
        PersianSymbols.Default.ShareNodes,
        PersianSymbols.Default.ShieldCheck,
        PersianSymbols.Default.ShieldExclamation,
        PersianSymbols.Default.ShieldXMark,
        PersianSymbols.Default.ShirtDefault,
        PersianSymbols.Default.Shredder,
        PersianSymbols.Default.Shuffle,
        PersianSymbols.Default.SignalExclamation,
        PersianSymbols.Default.Signal4,
        PersianSymbols.Default.SignalStreamSlash,
        PersianSymbols.Default.SignalStream2Slash,
        PersianSymbols.Default.SignalStream,
        PersianSymbols.Default.Signal3,
        PersianSymbols.Default.Signal2,
        PersianSymbols.Default.SignalXMark,
        PersianSymbols.Default.Signal,
        PersianSymbols.Default.Six,
        PersianSymbols.Default.Speech,
        PersianSymbols.Default.Star,
        PersianSymbols.Default.StopCircle,
        PersianSymbols.Default.Stop,
        PersianSymbols.Default.Sun,
        PersianSymbols.Default.TagSlash,
        PersianSymbols.Default.Tag2,
        PersianSymbols.Default.Tag,
        PersianSymbols.Default.Three,
        PersianSymbols.Default.ThumbDown,
        PersianSymbols.Default.ThumbUp,
        PersianSymbols.Default.ToggleOff,
        PersianSymbols.Default.ToggleOn,
        PersianSymbols.Default.TrashArrowUp,
        PersianSymbols.Default.TrashCheck,
        PersianSymbols.Default.TrashXMark,
        PersianSymbols.Default.Trash,
        PersianSymbols.Default.Triangle,
        PersianSymbols.Default.Two,
        PersianSymbols.Default.Undo,
        PersianSymbols.Default.Unlock,
        PersianSymbols.Default.UserBan,
        PersianSymbols.Default.UserBoxDashed,
        PersianSymbols.Default.UserBox,
        PersianSymbols.Default.UserCircle,
        PersianSymbols.Default.UserGear,
        PersianSymbols.Default.UserMagnifyingGlass,
        PersianSymbols.Default.UserMinus,
        PersianSymbols.Default.UserPen,
        PersianSymbols.Default.UserPlus,
        PersianSymbols.Default.User,
        PersianSymbols.Default.Utensils,
        PersianSymbols.Default.VolumeHigh,
        PersianSymbols.Default.VolumeLow,
        PersianSymbols.Default.VolumeOff,
        PersianSymbols.Default.VolumeSlash,
        PersianSymbols.Default.VolumeXMark,
        PersianSymbols.Default.W,
        PersianSymbols.Default.Wallet,
        PersianSymbols.Default.Warning,
        PersianSymbols.Default.WifiExclamation,
        PersianSymbols.Default.Wifi1,
        PersianSymbols.Default.WifiSlash,
        PersianSymbols.Default.WifiSpeed,
        PersianSymbols.Default.Wifi3,
        PersianSymbols.Default.Wifi2,
        PersianSymbols.Default.Wifi,
        PersianSymbols.Default.XMarkCircle,
        PersianSymbols.Default.XMarkOctagon,
        PersianSymbols.Default.XMark,
        PersianSymbols.Default.Zero,
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
        PersianSymbols.Filled.BackwardFast,
        PersianSymbols.Filled.BackwardStep,
        PersianSymbols.Filled.Backward,
        PersianSymbols.Filled.BatteryExclamation,
        PersianSymbols.Filled.BatteryQuestion,
        PersianSymbols.Filled.BellExclamation,
        PersianSymbols.Filled.BellOn,
        PersianSymbols.Filled.Bell,
        PersianSymbols.Filled.BoltCircle,
        PersianSymbols.Filled.Bolt,
        PersianSymbols.Filled.Bookmark,
        PersianSymbols.Filled.Box,
        PersianSymbols.Filled.BrightnessAuto,
        PersianSymbols.Filled.BrightnessExclamation,
        PersianSymbols.Filled.BrightnessHigh,
        PersianSymbols.Filled.BrightnessLow,
        PersianSymbols.Filled.BrightnessMedium,
        PersianSymbols.Filled.BuildingColumnsPercentBottom,
        PersianSymbols.Filled.BuildingColumns,
        PersianSymbols.Filled.CalendarCheck,
        PersianSymbols.Filled.CalendarDay,
        PersianSymbols.Filled.CalendarDays,
        PersianSymbols.Filled.CalendarEvent,
        PersianSymbols.Filled.CalendarRange,
        PersianSymbols.Filled.Calendar,
        PersianSymbols.Filled.CameraPlus,
        PersianSymbols.Filled.CameraVideoPlus,
        PersianSymbols.Filled.CameraVideoSlash,
        PersianSymbols.Filled.CameraVideo,
        PersianSymbols.Filled.Camera,
        PersianSymbols.Filled.CaretDownCircle,
        PersianSymbols.Filled.CartShopping,
        PersianSymbols.Filled.Category,
        PersianSymbols.Filled.ChartPieDollar,
        PersianSymbols.Filled.CheckBadge,
        PersianSymbols.Filled.CheckBox,
        PersianSymbols.Filled.CheckCircle,
        PersianSymbols.Filled.ChevronDownCircle,
        PersianSymbols.Filled.ChevronUpCircle,
        PersianSymbols.Filled.CircleDot,
        PersianSymbols.Filled.Circle,
        PersianSymbols.Filled.ClockAlarm,
        PersianSymbols.Filled.ClockTimer,
        PersianSymbols.Filled.Clock,
        PersianSymbols.Filled.CommentBars,
        PersianSymbols.Filled.CommentPlus,
        PersianSymbols.Filled.Compass,
        PersianSymbols.Filled.CreditCard,
        PersianSymbols.Filled.DeleteLeft,
        PersianSymbols.Filled.DeviceComputerArrowDownTop,
        PersianSymbols.Filled.DeviceComputerMac,
        PersianSymbols.Filled.DeviceComputerUnknown,
        PersianSymbols.Filled.DeviceComputerWindows,
        PersianSymbols.Filled.DeviceLaptopMacbook,
        PersianSymbols.Filled.DeviceLaptopUnknownDollarBottom,
        PersianSymbols.Filled.DeviceLaptopUnknown,
        PersianSymbols.Filled.DeviceLaptopWindows,
        PersianSymbols.Filled.DeviceMobileAndroid,
        PersianSymbols.Filled.DeviceMobileIPhone1,
        PersianSymbols.Filled.DeviceMobileIPhone3,
        PersianSymbols.Filled.DeviceMobileIPhone2,
        PersianSymbols.Filled.DeviceMobileUnknown,
        PersianSymbols.Filled.DeviceTabletAndroid,
        PersianSymbols.Filled.DeviceTabletIPad,
        PersianSymbols.Filled.DeviceTabletUnknown,
        PersianSymbols.Filled.DeviceTv,
        PersianSymbols.Filled.Devices,
        PersianSymbols.Filled.Diamond,
        PersianSymbols.Filled.DollarBadge,
        PersianSymbols.Filled.DollarRectangle,
        PersianSymbols.Filled.Dollar,
        PersianSymbols.Filled.EnvelopeArrowRightBottom,
        PersianSymbols.Filled.EnvelopeCheck,
        PersianSymbols.Filled.EnvelopeDot,
        PersianSymbols.Filled.EnvelopeLock,
        PersianSymbols.Filled.EnvelopePaperClip,
        PersianSymbols.Filled.EnvelopePen,
        PersianSymbols.Filled.Envelope,
        PersianSymbols.Filled.ExclamationCircle,
        PersianSymbols.Filled.ExclamationOctagon,
        PersianSymbols.Filled.EyeSlash,
        PersianSymbols.Filled.Eye,
        PersianSymbols.Filled.FaceSmile,
        PersianSymbols.Filled.File,
        PersianSymbols.Filled.FlashlightSlash,
        PersianSymbols.Filled.Flashlight,
        PersianSymbols.Filled.ForwardFast,
        PersianSymbols.Filled.ForwardStep,
        PersianSymbols.Filled.Forward,
        PersianSymbols.Filled.Gear,
        PersianSymbols.Filled.Gift,
        PersianSymbols.Filled.Globe,
        PersianSymbols.Filled.Heart,
        PersianSymbols.Filled.Hexagon,
        PersianSymbols.Filled.House,
        PersianSymbols.Filled.Hub,
        PersianSymbols.Filled.ICircle,
        PersianSymbols.Filled.Image,
        PersianSymbols.Filled.Key,
        PersianSymbols.Filled.Keyboard,
        PersianSymbols.Filled.LocationDotSlash,
        PersianSymbols.Filled.LocationDot,
        PersianSymbols.Filled.Lock,
        PersianSymbols.Filled.MessageBars,
        PersianSymbols.Filled.MessageCheck,
        PersianSymbols.Filled.MessageExclamation,
        PersianSymbols.Filled.MessageQuestion,
        PersianSymbols.Filled.MessageSms,
        PersianSymbols.Filled.Message,
        PersianSymbols.Filled.MicSlash,
        PersianSymbols.Filled.Mic,
        PersianSymbols.Filled.MinusBox,
        PersianSymbols.Filled.MinusCircle,
        PersianSymbols.Filled.MoneyBill,
        PersianSymbols.Filled.Moon,
        PersianSymbols.Filled.NewRectangle,
        PersianSymbols.Filled.Nfc,
        PersianSymbols.Filled.Palette,
        PersianSymbols.Filled.PaperPlaneCheck,
        PersianSymbols.Filled.PaperPlaneXMark,
        PersianSymbols.Filled.PaperPlane,
        PersianSymbols.Filled.PasswordRectangle,
        PersianSymbols.Filled.PauseCircle,
        PersianSymbols.Filled.Pause,
        PersianSymbols.Filled.Pen,
        PersianSymbols.Filled.Pentagon,
        PersianSymbols.Filled.PhoneCall,
        PersianSymbols.Filled.Phone,
        PersianSymbols.Filled.PiggyBank,
        PersianSymbols.Filled.Pin,
        PersianSymbols.Filled.PinCodeRectangle,
        PersianSymbols.Filled.PlayCircle,
        PersianSymbols.Filled.Play,
        PersianSymbols.Filled.PlusBox,
        PersianSymbols.Filled.PlusCircle,
        PersianSymbols.Filled.QuestionBox,
        PersianSymbols.Filled.QuestionCircle,
        PersianSymbols.Filled.QuestionTooltip,
        PersianSymbols.Filled.Resume,
        PersianSymbols.Filled.Review,
        PersianSymbols.Filled.SackDollar,
        PersianSymbols.Filled.SackXMark,
        PersianSymbols.Filled.Sack,
        PersianSymbols.Filled.ShareNodes,
        PersianSymbols.Filled.ShieldCheck,
        PersianSymbols.Filled.ShieldExclamation,
        PersianSymbols.Filled.Shredder,
        PersianSymbols.Filled.Star,
        PersianSymbols.Filled.StopCircle,
        PersianSymbols.Filled.Stop,
        PersianSymbols.Filled.Sun,
        PersianSymbols.Filled.TagSlash,
        PersianSymbols.Filled.Tag2,
        PersianSymbols.Filled.Tag,
        PersianSymbols.Filled.ThumbDown,
        PersianSymbols.Filled.ThumbUp,
        PersianSymbols.Filled.ToggleOff,
        PersianSymbols.Filled.ToggleOn,
        PersianSymbols.Filled.TrashArrowUp,
        PersianSymbols.Filled.Trash,
        PersianSymbols.Filled.Triangle,
        PersianSymbols.Filled.Unlock,
        PersianSymbols.Filled.UserBan,
        PersianSymbols.Filled.UserBoxDashed,
        PersianSymbols.Filled.UserBox,
        PersianSymbols.Filled.UserCircle,
        PersianSymbols.Filled.UserGear,
        PersianSymbols.Filled.UserMagnifyingGlass,
        PersianSymbols.Filled.UserMinus,
        PersianSymbols.Filled.UserPen,
        PersianSymbols.Filled.UserPlus,
        PersianSymbols.Filled.User,
        PersianSymbols.Filled.Utensils,
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