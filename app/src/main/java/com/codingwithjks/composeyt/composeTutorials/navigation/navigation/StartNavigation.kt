package com.codingwithjks.composeyt.composeTutorials.navigation.navigation

import android.app.Activity
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.codingwithjks.composeyt.composeTutorials.navigation.screens.FirstScreen
import com.codingwithjks.composeyt.composeTutorials.navigation.screens.SecondScreen
import com.codingwithjks.composeyt.composeTutorials.navigation.utils.NavigationScreen


@Composable
fun StartNavigation(context:Activity) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavigationScreen.FirstScreen.route ){
        composable(NavigationScreen.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(NavigationScreen.SecondScreen.route){
            SecondScreen(context)
        }
    }
}