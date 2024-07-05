package com.example.lab08dataroomsample.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.lab08dataroomsample.entities.Sala


@Dao
interface SalaDao {
    @Insert
    suspend fun insert(sala: Sala)

    @Update
    suspend fun update(sala: Sala)

    @Delete
    suspend fun delete(sala: Sala)

    @Query("SELECT * FROM salas")
    fun getAllSalas(): LiveData<List<Sala>>
}
