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
import com.antonshilov.mobiuslivecoding20.SettingsScreen

fun main() = Window {
    var text by remember { mutableStateOf("Hello, World!") }

    MaterialTheme {
        SettingsScreen()
    }
}


@Composable
fun Greeting(name: String) {
    FlowRow() {
        Icons.AllAssets.forEach {
            Image(it)
        }
    }
}