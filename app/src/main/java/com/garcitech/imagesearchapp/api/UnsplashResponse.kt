package com.garcitech.imagesearchapp.api

import com.garcitech.imagesearchapp.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
) {
}