package com.lucasmontano.openweathermap.usecase

import com.lucasmontano.openweathermap.core.database.dao.BookmarkDao

class GetBookmarksUseCase(private val dao: BookmarkDao) {

    suspend fun getBookMarks() = dao.getAll()
    suspend fun clearBookMarks() = dao.deleteAll()
}
