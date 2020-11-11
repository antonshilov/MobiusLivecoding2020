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

public val Icons.Info: VectorAsset
    get() {
        if (_info != null) {
            return _info!!
        }
        _info = VectorAssetBuilder(name = "Info", defaultWidth = 36.0.dp, defaultHeight = 40.0.dp,
                viewportWidth = 36.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFF08A652)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 27.5865f)
                curveTo(19.0f, 29.3675f, 21.1542f, 30.2604f, 22.4141f, 29.0006f)
                lineTo(30.7067f, 20.717f)
                curveTo(31.0974f, 20.3267f, 31.0978f, 19.6935f, 30.7075f, 19.3028f)
                lineTo(22.4155f, 11.0008f)
                curveTo(21.1552f, 9.7405f, 19.0f, 10.6324f, 19.0f, 12.4145f)
                verticalLineTo(17.9985f)
                horizontalLineTo(21.0f)
                lineTo(21.0009f, 12.4146f)
                lineTo(28.5858f, 20.0087f)
                lineTo(21.0f, 27.5865f)
                verticalLineTo(24.0095f)
                curveTo(21.0f, 23.4572f, 20.5523f, 23.0095f, 20.0f, 23.0095f)
                horizontalLineTo(9.0f)
                verticalLineTo(25.0095f)
                horizontalLineTo(19.0f)
                verticalLineTo(27.5865f)
                close()
                moveTo(7.4125f, 15.9999f)
                lineTo(8.7071f, 14.7053f)
                curveTo(9.0976f, 14.3147f, 9.0976f, 13.6816f, 8.7071f, 13.2911f)
                curveTo(8.3166f, 12.9005f, 7.6834f, 12.9005f, 7.2929f, 13.2911f)
                lineTo(4.2929f, 16.2911f)
                curveTo(3.9024f, 16.6816f, 3.9024f, 17.3147f, 4.2929f, 17.7053f)
                lineTo(7.2929f, 20.7053f)
                curveTo(7.6834f, 21.0958f, 8.3166f, 21.0958f, 8.7071f, 20.7053f)
                curveTo(9.0976f, 20.3147f, 9.0976f, 19.6816f, 8.7071f, 19.2911f)
                lineTo(7.416f, 17.9999f)
                lineTo(17.0002f, 17.9982f)
                lineTo(16.9998f, 15.9982f)
                lineTo(7.4125f, 15.9999f)
                close()
            }
        }
        .build()
        return _info!!
    }

private var _info: VectorAsset? = null
