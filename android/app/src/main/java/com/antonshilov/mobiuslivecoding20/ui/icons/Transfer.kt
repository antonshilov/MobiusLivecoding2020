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

public val Icons.Transfer: VectorAsset
    get() {
        if (_transfer != null) {
            return _transfer!!
        }
        _transfer = VectorAssetBuilder(name = "Transfer", defaultWidth = 36.0.dp, defaultHeight =
                40.0.dp, viewportWidth = 36.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFF08A652)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.3359f, 11.0f)
                curveTo(14.8212f, 11.0f, 16.8359f, 13.0147f, 16.8359f, 15.5f)
                curveTo(16.8359f, 17.9853f, 14.8212f, 20.0f, 12.3359f, 20.0f)
                curveTo(9.8506f, 20.0f, 7.8359f, 17.9853f, 7.8359f, 15.5f)
                curveTo(7.8359f, 13.0147f, 9.8506f, 11.0f, 12.3359f, 11.0f)
                close()
                moveTo(12.3359f, 13.0f)
                curveTo(10.9552f, 13.0f, 9.8359f, 14.1193f, 9.8359f, 15.5f)
                curveTo(9.8359f, 16.8807f, 10.9552f, 18.0f, 12.3359f, 18.0f)
                curveTo(13.7167f, 18.0f, 14.8359f, 16.8807f, 14.8359f, 15.5f)
                curveTo(14.8359f, 14.1193f, 13.7167f, 13.0f, 12.3359f, 13.0f)
                close()
                moveTo(23.3359f, 22.0f)
                curveTo(25.8212f, 22.0f, 27.8359f, 24.0147f, 27.8359f, 26.5f)
                curveTo(27.8359f, 28.9853f, 25.8212f, 31.0f, 23.3359f, 31.0f)
                curveTo(20.8507f, 31.0f, 18.8359f, 28.9853f, 18.8359f, 26.5f)
                curveTo(18.8359f, 24.0147f, 20.8507f, 22.0f, 23.3359f, 22.0f)
                close()
                moveTo(23.3359f, 24.0f)
                curveTo(21.9552f, 24.0f, 20.8359f, 25.1193f, 20.8359f, 26.5f)
                curveTo(20.8359f, 27.8807f, 21.9552f, 29.0f, 23.3359f, 29.0f)
                curveTo(24.7167f, 29.0f, 25.8359f, 27.8807f, 25.8359f, 26.5f)
                curveTo(25.8359f, 25.1193f, 24.7167f, 24.0f, 23.3359f, 24.0f)
                close()
                moveTo(9.543f, 30.7071f)
                lineTo(27.543f, 12.7071f)
                curveTo(27.9336f, 12.3166f, 27.9336f, 11.6834f, 27.543f, 11.2929f)
                curveTo(27.1525f, 10.9024f, 26.5194f, 10.9024f, 26.1288f, 11.2929f)
                lineTo(8.1288f, 29.2929f)
                curveTo(7.7383f, 29.6834f, 7.7383f, 30.3166f, 8.1288f, 30.7071f)
                curveTo(8.5194f, 31.0976f, 9.1525f, 31.0976f, 9.543f, 30.7071f)
                close()
            }
        }
        .build()
        return _transfer!!
    }

private var _transfer: VectorAsset? = null
