package com.location.openweathermap.core.network

class ApiUrls {
    companion object {
        private var baseUrl = "http://api.openweathermap.org/"
       // private var appId = "&APPID=c6e381d8c7ff98f0fee43775817cf6ad"
        private var appId = "&APPID=fae7190d7e6433ec3a45285ffcf55c86"

        var coordinates = baseUrl + "data/2.5/weather?units=metric&lat=%s&lon=%s" + appId
    }
}