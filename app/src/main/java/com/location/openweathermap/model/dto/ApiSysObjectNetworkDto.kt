package com.location.openweathermap.model.dto

import com.google.gson.annotations.SerializedName

data class ApiSysObjectNetworkDto(
    @SerializedName("country")
    var countryCode: String
)
