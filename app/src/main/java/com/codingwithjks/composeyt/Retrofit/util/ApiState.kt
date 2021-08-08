package com.codingwithjks.composeyt.Retrofit.util

import com.codingwithjks.composeyt.Retrofit.Post

sealed class ApiState{

    class Success(val data:List<Post> ) : ApiState()
    class Failure(val msg:Throwable) : ApiState()
    object Loading : ApiState()
    object Empty : ApiState()

}
