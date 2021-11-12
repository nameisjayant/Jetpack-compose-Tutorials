package com.codingwithjks.composeyt.viewpager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.Surface
import com.codingwithjks.composeyt.ui.theme.ComposeYtTheme
import com.google.accompanist.pager.ExperimentalPagerApi

class OnBoardingActivity : ComponentActivity() {

    @ExperimentalPagerApi
    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            ComposeYtTheme {
                androidx.compose.material.Surface {
                    OnBoardingScreen()
                }
            }
        }
    }
}