package com.codingwithjks.composeyt.composeTutorials.navigation.screens

import android.app.Activity
import android.content.Intent
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.codingwithjks.composeyt.composeTutorials.navigation.navigation.AnotherActivity
import com.codingwithjks.composeyt.composeTutorials.navigation.utils.NavigationScreen


@Composable
fun SecondScreen(context:Activity,navHostController: NavHostController) {
    Button(onClick = {
       navHostController.navigate(NavigationScreen.ThirdScreen.route){
           launchSingleTop = true
       }
    }) {
        Text(text = "goto another activity")
    }
}

// A -> B -> C -> A -> B ->