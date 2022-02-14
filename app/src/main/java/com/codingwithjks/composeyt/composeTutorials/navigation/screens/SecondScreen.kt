package com.codingwithjks.composeyt.composeTutorials.navigation.screens

import android.app.Activity
import android.content.Intent
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.codingwithjks.composeyt.composeTutorials.navigation.navigation.AnotherActivity


@Composable
fun SecondScreen(context:Activity) {
    Button(onClick = {
      val intent =  Intent(context,AnotherActivity::class.java).apply {
      }
        context.startActivity(intent)
    }) {
        Text(text = "goto another activity")
    }
}