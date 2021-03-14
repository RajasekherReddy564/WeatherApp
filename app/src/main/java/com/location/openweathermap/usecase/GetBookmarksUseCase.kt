package com.location.openweathermap.usecase

import com.location.openweathermap.core.database.dao.BookmarkDao

class GetBookmarksUseCase(private val dao: BookmarkDao) {

    suspend fun getBookMarks() = dao.getAll()
    suspend fun clearBookMarks() = dao.deleteAll()
}
