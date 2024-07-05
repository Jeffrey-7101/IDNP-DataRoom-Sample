package com.example.lab08dataroomsample.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

data class Sala (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nombre: String,
    val descripcion: String
)