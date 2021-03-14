package com.location.openweathermap.usecase

import com.location.openweathermap.core.database.dao.BookmarkDao
import com.location.openweathermap.core.database.entities.Bookmark
import com.location.openweathermap.model.domain.LocationWeatherModel

class AddBookmarkUseCase(private val dao: BookmarkDao) {

    suspend fun execute(locationWeather: LocationWeatherModel) = dao.insert(
        Bookmark(
            id = locationWeather.id,
            latitude = locationWeather.lat,
            longitude = locationWeather.lon
        )
    )
}
