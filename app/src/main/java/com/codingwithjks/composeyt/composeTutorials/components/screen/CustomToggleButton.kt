package com.codingwithjks.composeyt.composeTutorials.components.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codingwithjks.composeyt.R
import com.codingwithjks.composeyt.ui.theme.greenColor

@Composable
fun CustomToggleButton() {

    var isToggle by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Center
    ) {
        Card(
            shape = RoundedCornerShape(39.dp),
            elevation = 0.dp
        ) {
            Box(
                modifier = Modifier
                    .background(
                        if (isToggle) greenColor else Color.Black
                    )
                    .clickable {
                        isToggle = !isToggle
                    }, contentAlignment = Alignment.Center
            ) {
                if (isToggle) {
                    Row(
                        modifier = Modifier.padding(5.dp)
                    ) {
                        Text(
                            text = "On", style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.W400
                            ), color = Color.White, modifier = Modifier
                                .padding(start = 10.dp)
                                .align(
                                    CenterVertically
                                )
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.on), contentDescription = "",
                            tint = Color.Unspecified,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    }

                } else {
                    Row(
                        modifier = Modifier.padding(5.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.off), contentDescription = "",
                            tint = Color.Unspecified
                        )
                        Text(
                            text = "Off", style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.W400
                            ), color = Color.White, modifier = Modifier
                                .padding(start = 10.dp, end = 10.dp)
                                .align(
                                    CenterVertically
                                )
                        )
                    }
                }
            }
        }
    }


}