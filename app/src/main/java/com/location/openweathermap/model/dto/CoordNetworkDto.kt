package com.location.openweathermap.model.dto

import com.google.gson.annotations.SerializedName

data class CoordNetworkDto(
    @SerializedName("lat")
    val lat: Double,
    @SerializedName("lon")
    val lon: Double
)
