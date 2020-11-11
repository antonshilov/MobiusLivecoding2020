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

public val Icons.OperationTransaction: VectorAsset
    get() {
        if (_operationTransaction != null) {
            return _operationTransaction!!
        }
        _operationTransaction = VectorAssetBuilder(name = "OperationTransaction", defaultWidth =
                36.0.dp, defaultHeight = 40.0.dp, viewportWidth = 36.0f, viewportHeight =
                40.0f).apply {
            path(fill = SolidColor(Color(0xFF08A652)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(36.0f, 20.0f)
                curveTo(36.0f, 29.941f, 27.941f, 38.0f, 18.0f, 38.0f)
                curveTo(8.059f, 38.0f, 0.0f, 29.941f, 0.0f, 20.0f)
                curveTo(0.0f, 10.059f, 8.059f, 2.0f, 18.0f, 2.0f)
                curveTo(27.941f, 2.0f, 36.0f, 10.059f, 36.0f, 20.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(14.2093f, 11.0f, 16.0f, 12.7907f, 16.0f, 15.0f)
                curveTo(16.0f, 17.2093f, 14.2093f, 19.0f, 12.0f, 19.0f)
                curveTo(9.7907f, 19.0f, 8.0f, 17.2093f, 8.0f, 15.0f)
                curveTo(8.0f, 12.7907f, 9.7907f, 11.0f, 12.0f, 11.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(10.8953f, 13.0f, 10.0f, 13.8953f, 10.0f, 15.0f)
                curveTo(10.0f, 16.1047f, 10.8953f, 17.0f, 12.0f, 17.0f)
                curveTo(13.1047f, 17.0f, 14.0f, 16.1047f, 14.0f, 15.0f)
                curveTo(14.0f, 13.8953f, 13.1047f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(24.0f, 21.0f)
                curveTo(26.2093f, 21.0f, 28.0f, 22.7907f, 28.0f, 25.0f)
                curveTo(28.0f, 27.2093f, 26.2093f, 29.0f, 24.0f, 29.0f)
                curveTo(21.7907f, 29.0f, 20.0f, 27.2093f, 20.0f, 25.0f)
                curveTo(20.0f, 22.7907f, 21.7907f, 21.0f, 24.0f, 21.0f)
                close()
                moveTo(24.0f, 23.0f)
                curveTo(22.8953f, 23.0f, 22.0f, 23.8953f, 22.0f, 25.0f)
                curveTo(22.0f, 26.1047f, 22.8953f, 27.0f, 24.0f, 27.0f)
                curveTo(25.1047f, 27.0f, 26.0f, 26.1047f, 26.0f, 25.0f)
                curveTo(26.0f, 23.8953f, 25.1047f, 23.0f, 24.0f, 23.0f)
                close()
                moveTo(10.7071f, 28.7071f)
                lineTo(26.7071f, 12.7071f)
                curveTo(27.0976f, 12.3166f, 27.0976f, 11.6834f, 26.7071f, 11.2929f)
                curveTo(26.3166f, 10.9024f, 25.6834f, 10.9024f, 25.2929f, 11.2929f)
                lineTo(9.2929f, 27.2929f)
                curveTo(8.9024f, 27.6834f, 8.9024f, 28.3166f, 9.2929f, 28.7071f)
                curveTo(9.6834f, 29.0976f, 10.3166f, 29.0976f, 10.7071f, 28.7071f)
                close()
            }
        }
        .build()
        return _operationTransaction!!
    }

private var _operationTransaction: VectorAsset? = null
