package com.marinato.leadsmeaning.banco_dados.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Inscrição")
data class entity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val email: String
)