package com.codingwithjks.composeyt.composeTutorials.components.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun ParentContent() {
    var name by remember { mutableStateOf("")}
    ChildContent(name = name){
        name = it
    }
}

@Composable
fun ChildContent(name:String, onChange:(String)->Unit ) {
   Column(
       modifier = Modifier
           .fillMaxWidth()
           .padding(20.dp),
       horizontalAlignment = Alignment.CenterHorizontally
   ) {
       Text(text = "hello ${name}")

       Spacer(modifier = Modifier.height(20.dp))

       TextField(value = name, onValueChange ={
            onChange(it)
       },
           placeholder = { Text(text = "type something...")}
       )
   }
}

@Composable
fun StateFul() {

    var name by remember { mutableStateOf("")}
    TextField(value = name, onValueChange = {
        name = it
    })

}

@Composable
fun Stateless() {

    Text(text = "Hell world")
}