package com.example.lab08dataroomsample.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.lab08dataroomsample.entities.Autor

@Dao
interface AutorDao {
    @Insert
    suspend fun insert(autor: Autor)

    @Update
    suspend fun update(autor: Autor)

    @Delete
    suspend fun delete(autor: Autor)

    @Query("SELECT * FROM autores")
    fun getAllAutores(): LiveData<List<Autor>>
}
