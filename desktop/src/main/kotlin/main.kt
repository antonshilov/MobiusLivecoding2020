import androidx.compose.animation.animateContentSize
import androidx.compose.desktop.Window
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.ExperimentalLayout
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

fun main() = Window {
    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        Greeting("Kek")
    }
}


@OptIn(ExperimentalLayout::class)
@Composable
fun Greeting(name: String) {
    FlowRow() {

        Text(text = "Hello $name!")
        for (icon in Icons.AllAssets) {
            Image(icon, modifier = Modifier.size(48.dp))
        }
    }
}