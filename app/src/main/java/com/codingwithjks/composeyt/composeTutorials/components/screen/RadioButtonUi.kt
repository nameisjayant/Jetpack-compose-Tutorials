package com.codingwithjks.composeyt.composeTutorials.components.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun RadioButtonUi() {

    val genderList by remember { mutableStateOf(listOf("Male","Female","Others"))}
    var genderState by remember{ mutableStateOf("")}

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

       Row(
           modifier = Modifier.fillMaxWidth().padding()
       ) {
           genderList.forEach {
               Row {
                   Text(text = it, modifier = Modifier.align(CenterVertically))
                   RadioButton(selected =  genderState == it
                       , onClick = {
                           genderState = it
                       },
                       colors = RadioButtonDefaults.colors(
                           selectedColor = Color.Yellow,
                       )

                   )
               }
           }
       }

        Text(text = genderState)

    }

}