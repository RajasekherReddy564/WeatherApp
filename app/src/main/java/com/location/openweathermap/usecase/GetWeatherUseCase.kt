package com.location.openweathermap.usecase

import com.google.gson.Gson
import com.location.openweathermap.model.dto.CityNetworkDto
import com.location.openweathermap.service.network.WeatherApiService

class GetWeatherUseCase(private val weatherApiService: WeatherApiService) {

    suspend fun execute(lat: Double, lon: Double): CityNetworkDto {
        val response = weatherApiService.byGeoCoordinates(lat, lon)
        return Gson().fromJson(response, CityNetworkDto::class.java)
    }
}
