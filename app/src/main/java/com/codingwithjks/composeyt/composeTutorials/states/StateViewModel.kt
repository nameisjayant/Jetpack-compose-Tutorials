package com.codingwithjks.composeyt.composeTutorials.states

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StateViewModel
@Inject
constructor() : ViewModel() {

    val name:MutableState<String> = mutableStateOf("jayant")
}