package com.codingwithjks.composeyt.viewpager

import androidx.annotation.DrawableRes
import com.codingwithjks.composeyt.R

data class Pager(
    @DrawableRes val image:Int,
    val des:String
)

val dataList = listOf(
    Pager(R.drawable.page_one,"PAGE ONE"),
    Pager(R.drawable.page_two,"PAGE TWO"),
    Pager(R.drawable.page_one,"PAGE THREE")
)