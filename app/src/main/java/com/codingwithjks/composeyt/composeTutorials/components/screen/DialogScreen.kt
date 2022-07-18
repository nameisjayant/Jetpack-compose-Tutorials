package com.codingwithjks.composeyt.composeTutorials.components.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.window.Dialog


@Composable
fun DialogScreen() {

    var isDialog by remember { mutableStateOf(false)}

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = {
            isDialog = true
        }) {
            Text(text = "Click here")
        }
    }

    if(isDialog)

    Dialog(onDismissRequest = {
        isDialog = false
    }) {
        CircularProgressIndicator()
    }

}


@Composable
fun AlertDialogScreen() {

    var isDialog by remember { mutableStateOf(false)}

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Button(onClick = {
            isDialog = true
        }) {
            Text("Click here")
        }



        if (isDialog) {

            AlertDialog(onDismissRequest = {

            },
                title = {
                    Text(text = "Dialog Box")
                },
                text = {
                    Text("This is Dialog box contents")
                },
                modifier = Modifier.fillMaxWidth(),
                buttons = {
                    Button(onClick = {
                                     isDialog = false
                    }, modifier = Modifier.align(CenterHorizontally)) {
                        Text("Ok")
                    }
                }
            )

        }
    }

}