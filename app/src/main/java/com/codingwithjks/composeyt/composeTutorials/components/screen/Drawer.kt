package com.codingwithjks.composeyt.composeTutorials.components.screen

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.ScaffoldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.launch


@Composable
fun CreateDrawer(scaffoldState: ScaffoldState) {

    val scope = rememberCoroutineScope()

    IconButton(onClick = {
        scope.launch {
            scaffoldState.drawerState.open()
        }
    }) {
        Icon(Icons.Default.List, contentDescription =  "", tint = Color.Blue)
    }

}