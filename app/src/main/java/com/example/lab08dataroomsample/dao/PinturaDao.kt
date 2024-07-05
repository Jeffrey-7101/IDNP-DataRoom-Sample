package com.example.lab08dataroomsample.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.lab08dataroomsample.entities.Pintura

@Dao
interface PinturaDao {
    @Insert
    suspend fun insert(pintura: Pintura)

    @Update
    suspend fun update(pintura: Pintura)

    @Delete
    suspend fun delete(pintura: Pintura)

    @Query("SELECT * FROM pinturas")
    fun getAllPinturas(): LiveData<List<Pintura>>

    @Query("SELECT * FROM pinturas WHERE autorId = :autorId")
    fun getPinturasByAutor(autorId: Int): LiveData<List<Pintura>>

    @Query("SELECT * FROM pinturas WHERE salaId = :salaId")
    fun getPinturasBySala(salaId: Int): LiveData<List<Pintura>>
}
