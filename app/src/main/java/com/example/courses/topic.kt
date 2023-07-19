package com.example.courses

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(

    @StringRes val name: Int,
    val courseId: Int,
    @DrawableRes val imageId: Int
){
}