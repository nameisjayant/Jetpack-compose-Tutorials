package com.codingwithjks.composeyt.composeTutorials.components.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun CheckBoxUi() {

    var isChecked by remember { mutableStateOf(false)}

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Checkbox(checked = isChecked,
            onCheckedChange = {
                isChecked = it
            },
            colors = CheckboxDefaults.colors(
                checkedColor = Color.Yellow,
                checkmarkColor = Color.Black
            )
        )
        Spacer(modifier = Modifier.height(20.dp))
        CustomCheckBox()
    }

}


@Composable
fun CustomCheckBox() {

    var isCheck by remember { mutableStateOf(false)}

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(),
        horizontalArrangement = Arrangement.Center,
    ) {

        Card(
            elevation = 0.dp,
            shape = RoundedCornerShape(8.dp),
            backgroundColor = Color.White,
            border = BorderStroke(1.dp, Color.Black)
        ) {
            Box(modifier = Modifier
                .background(
                    if (isCheck) Color.Green else Color.White
                ).clickable {
                    isCheck = !isCheck
                }
                .size(25.dp),
                contentAlignment = Alignment.Center
            ){
               if(isCheck)
                   Icon(Icons.Default.Check, contentDescription = "", tint = Color.White)
            }
        }

        Text(text = "Accept all terms & conditions", modifier = Modifier
            .padding(start = 5.dp)
            .align(CenterVertically))

    }

}