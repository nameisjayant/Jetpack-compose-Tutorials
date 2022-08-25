package com.codingwithjks.composeyt.composeTutorials.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import com.codingwithjks.composeyt.composeTutorials.components.screen.*
import com.codingwithjks.composeyt.ui.theme.ComposeYtTheme
import kotlinx.coroutines.launch

class ComposeActivity : ComponentActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeYtTheme() {
                androidx.compose.material.Surface {
                    val scaffoldState = rememberScaffoldState()
                    val scope = rememberCoroutineScope()
                    CustomTitleBar()
                }
            }
        }
    }

}