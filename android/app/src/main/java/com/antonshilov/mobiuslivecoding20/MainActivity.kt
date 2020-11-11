package com.antonshilov.mobiuslivecoding20

import AllAssets
import Icons
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.ExperimentalLayout
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.antonshilov.mobiuslivecoding20.data.MockDataSource
import com.antonshilov.mobiuslivecoding20.ui.MobiusLivecoding20Theme


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobiusLivecoding20Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@OptIn(ExperimentalLayout::class)
@Composable
fun Greeting(name: String) {
    FlowRow {

        Text(text = "Hello $name!")
        for (icon in Icons.AllAssets) {
            Image(icon, modifier = Modifier.size(48.dp))
        }
    }
}

@OptIn(ExperimentalLayout::class)
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MobiusLivecoding20Theme {
        Greeting(MockDataSource.operations.first().description)
    }
}
