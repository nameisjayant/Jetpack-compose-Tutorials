package com.codingwithjks.composeyt.composeTutorials.states

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.codingwithjks.composeyt.ui.theme.ComposeYtTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StateActivity : ComponentActivity() {

    private val viewModel:StateViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeYtTheme {
                Surface(color = MaterialTheme.colors.background) {
                    ShowWidget()
                }
            }
        }
    }

    @Composable
    fun ShowWidget() {
        val name1 = remember{ mutableStateOf("")}
        val name = rememberSaveable { mutableStateOf("")}
        Column(
            modifier = Modifier.padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if(viewModel.name.value.isNotEmpty()){
                Text(text = viewModel.name.value,color = Color.Green)
            }

            OutlinedTextField(
                value = name.value
                ,onValueChange = {
                    name.value = it
                },
                label = {
                    Text(text = "Name")
                }
            )
        }

    }
}