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

public val Icons.Close: VectorAsset
    get() {
        if (_close != null) {
            return _close!!
        }
        _close = VectorAssetBuilder(name = "Close", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF08A652)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.3007f, 5.7102f)
                curveTo(17.9107f, 5.3202f, 17.2807f, 5.3202f, 16.8907f, 5.7102f)
                lineTo(12.0007f, 10.5902f)
                lineTo(7.1107f, 5.7002f)
                curveTo(6.7207f, 5.3102f, 6.0907f, 5.3102f, 5.7007f, 5.7002f)
                curveTo(5.3107f, 6.0902f, 5.3107f, 6.7202f, 5.7007f, 7.1102f)
                lineTo(10.5907f, 12.0002f)
                lineTo(5.7007f, 16.8902f)
                curveTo(5.3107f, 17.2802f, 5.3107f, 17.9102f, 5.7007f, 18.3002f)
                curveTo(6.0907f, 18.6902f, 6.7207f, 18.6902f, 7.1107f, 18.3002f)
                lineTo(12.0007f, 13.4102f)
                lineTo(16.8907f, 18.3002f)
                curveTo(17.2807f, 18.6902f, 17.9107f, 18.6902f, 18.3007f, 18.3002f)
                curveTo(18.6907f, 17.9102f, 18.6907f, 17.2802f, 18.3007f, 16.8902f)
                lineTo(13.4107f, 12.0002f)
                lineTo(18.3007f, 7.1102f)
                curveTo(18.6807f, 6.7302f, 18.6807f, 6.0902f, 18.3007f, 5.7102f)
                close()
            }
        }
        .build()
        return _close!!
    }

private var _close: VectorAsset? = null
