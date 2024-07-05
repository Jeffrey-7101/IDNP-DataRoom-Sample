package com.example.lab08dataroomsample.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "autores")
data class Autor (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nombre: String,
    val apellido: String
)