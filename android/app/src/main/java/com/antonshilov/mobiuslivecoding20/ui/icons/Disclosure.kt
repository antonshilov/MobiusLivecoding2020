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

public val Icons.Disclosure: VectorAsset
    get() {
        if (_disclosure != null) {
            return _disclosure!!
        }
        _disclosure = VectorAssetBuilder(name = "Disclosure", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.32f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(9.8827f, 8.7071f)
                curveTo(9.4922f, 8.3166f, 9.4922f, 7.6834f, 9.8827f, 7.2929f)
                curveTo(10.2733f, 6.9024f, 10.9064f, 6.9024f, 11.297f, 7.2929f)
                lineTo(16.0041f, 12.0f)
                lineTo(11.297f, 16.7071f)
                curveTo(10.9064f, 17.0976f, 10.2733f, 17.0976f, 9.8827f, 16.7071f)
                curveTo(9.4922f, 16.3166f, 9.4922f, 15.6834f, 9.8827f, 15.2929f)
                lineTo(13.1756f, 12.0f)
                lineTo(9.8827f, 8.7071f)
                close()
            }
        }
        .build()
        return _disclosure!!
    }

private var _disclosure: VectorAsset? = null
