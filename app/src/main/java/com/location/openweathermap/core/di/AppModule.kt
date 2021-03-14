package com.location.openweathermap.core.di

import androidx.room.Room
import com.location.openweathermap.core.database.WeatherDatabase
import com.location.openweathermap.core.network.VolleySingleton
import com.location.openweathermap.map.viewmodel.MapViewModel
import com.location.openweathermap.service.network.WeatherApiService
import com.location.openweathermap.usecase.AddBookmarkUseCase
import com.location.openweathermap.usecase.GetBookmarksUseCase
import com.location.openweathermap.usecase.GetWeatherUseCase
import com.location.openweathermap.usecase.RemoveBookmarkUseCase
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    single {
        Room.databaseBuilder(androidApplication(), WeatherDatabase::class.java, "WEATHER_DB")
            .build()
    }
    single { get<WeatherDatabase>().bookmarkDao }

    single {
        VolleySingleton(
            androidApplication()
        )
    }

    single {
        WeatherApiService()
    }

    single {
        GetWeatherUseCase(get())
    }

    single {
        AddBookmarkUseCase(get())
    }

    single {
        RemoveBookmarkUseCase(get())
    }

    single {
        GetBookmarksUseCase(get())
    }

    viewModel { MapViewModel(get(), get(), get(), get()) }
}
