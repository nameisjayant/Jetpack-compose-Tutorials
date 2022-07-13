package com.codingwithjks.composeyt.composeTutorials.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.codingwithjks.composeyt.ui.theme.ComposeYtTheme

class ComposeActivity : ComponentActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeYtTheme() {
                androidx.compose.material.Surface() {

                }
            }
        }
    }

}