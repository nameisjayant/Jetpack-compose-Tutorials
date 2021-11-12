package com.codingwithjks.composeyt.viewpager

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.codingwithjks.composeyt.R
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun OnBoardingScreen() {

    val pageState = rememberPagerState()

    Column {

        HorizontalPager(
            count = dataList.size,
            state = pageState,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) { page ->
            PageUi(pager = dataList[page])
        }
        HorizontalPagerIndicator(
            pagerState = pageState,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(20.dp),
            activeColor = colorResource(id = R.color.purple_500)
        )
        AnimatedVisibility(visible = pageState.currentPage == 2) {
            Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
                Text(text = "Getting Started")
            }
        }
    }
}

@Composable
fun PageUi(pager: Pager) {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = pager.image),
            contentDescription = pager.des,
            modifier = Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = pager.des)
    }

}