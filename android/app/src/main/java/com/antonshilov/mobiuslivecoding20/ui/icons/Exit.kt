package com.antonshilov.mobiuslivecoding20.ui.icons

import Icons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val Icons.Exit: VectorAsset
    get() {
        if (_exit != null) {
            return _exit!!
        }
        _exit = VectorAssetBuilder(name = "Exit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF08A652)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 4.0f)
                horizontalLineTo(7.0f)
                curveTo(5.3432f, 4.0f, 4.0f, 5.3432f, 4.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 18.6569f, 5.3432f, 20.0f, 7.0f, 20.0f)
                horizontalLineTo(13.0f)
                horizontalLineTo(14.0f)
                curveTo(14.5523f, 20.0f, 15.0f, 19.5523f, 15.0f, 19.0f)
                curveTo(15.0f, 18.4477f, 14.5523f, 18.0f, 14.0f, 18.0f)
                horizontalLineTo(13.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 18.0f, 6.0f, 17.5523f, 6.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(6.0f, 6.4477f, 6.4477f, 6.0f, 7.0f, 6.0f)
                horizontalLineTo(13.0f)
                horizontalLineTo(14.0f)
                curveTo(14.5523f, 6.0f, 15.0f, 5.5523f, 15.0f, 5.0f)
                curveTo(15.0f, 4.4477f, 14.5523f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(13.0f, 11.0f)
                curveTo(12.4477f, 11.0f, 12.0f, 11.4477f, 12.0f, 12.0f)
                curveTo(12.0f, 12.5523f, 12.4477f, 13.0f, 13.0f, 13.0f)
                horizontalLineTo(18.6514f)
                lineTo(17.0431f, 14.6083f)
                curveTo(16.6526f, 14.9989f, 16.6526f, 15.632f, 17.0431f, 16.0226f)
                curveTo(17.4336f, 16.4131f, 18.0668f, 16.4131f, 18.4573f, 16.0226f)
                lineTo(21.6994f, 12.7805f)
                curveTo(21.8768f, 12.603f, 21.9737f, 12.3754f, 21.9898f, 12.1433f)
                curveTo(21.9965f, 12.0965f, 22.0f, 12.0486f, 22.0f, 12.0f)
                curveTo(22.0f, 11.9488f, 21.9962f, 11.8985f, 21.9887f, 11.8494f)
                curveTo(21.9619f, 11.637f, 21.8669f, 11.4315f, 21.7038f, 11.2683f)
                lineTo(18.4617f, 8.0263f)
                curveTo(18.0712f, 7.6358f, 17.438f, 7.6358f, 17.0475f, 8.0263f)
                curveTo(16.657f, 8.4168f, 16.657f, 9.05f, 17.0475f, 9.4405f)
                lineTo(18.607f, 11.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _exit!!
    }

private var _exit: VectorAsset? = null
