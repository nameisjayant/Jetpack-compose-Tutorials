package com.codingwithjks.composeyt.composeTutorials.navigation.utils

sealed class NavigationScreen(val route:String){

    object FirstScreen : NavigationScreen("firstscreen")
    object SecondScreen : NavigationScreen("secondscreen")

}
