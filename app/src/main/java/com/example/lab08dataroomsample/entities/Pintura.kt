package com.example.lab08dataroomsample.entities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "pinturas",
    foreignKeys = [
        ForeignKey(entity = Autor::class, parentColumns = ["id"], childColumns = ["autorId"]),
        ForeignKey(entity = Sala::class, parentColumns = ["id"], childColumns = ["salaId"])
    ],
    indices = [Index(value = ["autorId"]), Index(value = ["salaId"])]
)
data class Pintura(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val titulo: String,
    val autorId: Int,
    val salaId: Int,
    val tecnica: String,
    val categoria: String,
    val descripcion: String,
    val año: Int,
    val enlace: String
)
