package com.showcase.movieapp.models

import com.google.gson.annotations.SerializedName

/**
 * Created by Harshali.Sachani on 9/22/2023.
 */
data class MovieData(
    @SerializedName("page")
    val page: Page
)