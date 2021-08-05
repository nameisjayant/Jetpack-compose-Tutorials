package com.codingwithjks.composeyt

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codingwithjks.composeyt.ui.theme.ComposeYtTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeYtTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text("Demo App Yt")
                            },
                            navigationIcon = {
                                IconButton(onClick = { }) {
                                    Icon(Icons.Filled.Menu, contentDescription = "menu")
                                }
                            },
                            actions = {
                                IconButton(onClick = { }) {
                                    Icon(Icons.Filled.Notifications, contentDescription = "noti")
                                }
                                IconButton(onClick = { }) {
                                    Icon(Icons.Filled.Search, contentDescription = "search")
                                }
                            }
                        )
                    },
                    floatingActionButton = {
                        FloatingActionButton(onClick = {}) {
                            IconButton(onClick = { }) {
                                Icon(Icons.Filled.Add, contentDescription = "add")
                            }
                        }
                    },
                    // floatingActionButtonPosition = FabPosition.End
                ) {
                    ShowSwitch()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        color = MaterialTheme.colors.secondary,
    )
}

@Preview(showBackground = true, name = "light mode")
@Preview(
    showBackground = true, name = "dark mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun DefaultPreview() {
    ComposeYtTheme {
        Greeting("Android")
    }
}

@Composable
fun ShowSwitch() {

    val isChecked = remember {
        mutableStateOf(true)
    }

    Switch(
        checked = isChecked.value,
        onCheckedChange = {
            isChecked.value = it
        },
        modifier = Modifier.run {
            size(20.dp)
            padding(100.dp)
        }
    )

}

