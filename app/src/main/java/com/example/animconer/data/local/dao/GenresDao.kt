package com.example.animconer.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.animconer.data.local.entity.GenresEntity

@Dao
interface GenresDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertGenres(genres: List<GenresEntity>)

    @Query("SELECT * FROM table_genres")
    fun getGenres(): List<GenresEntity>

    @Query("DELETE FROM table_genres")
    suspend fun deleteAllGenres()
}