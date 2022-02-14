package com.codingwithjks.composeyt.composeTutorials.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import com.codingwithjks.composeyt.composeTutorials.navigation.navigation.StartNavigation
import com.codingwithjks.composeyt.ui.theme.ComposeYtTheme

class NavigationActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeYtTheme() {
                androidx.compose.material.Surface {
                    StartNavigation(this)
                }
            }
        }
    }
}