import com.lt.kmm_and_compose_sample.common.App
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.lt.kmm_and_compose_sample.common.NumberList

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        MaterialTheme {
            //App()
            NumberList()
        }
    }
}