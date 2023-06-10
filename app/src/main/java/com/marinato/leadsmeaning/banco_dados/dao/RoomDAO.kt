package com.marinato.leadsmeaning.banco_dados.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface RoomDAO {
    @Insert
    suspend fun insert(banco_dados: RoomDAO): Long

    @Update
    suspend fun insert(inscrição: RoomDAO)

    @Query(value= "DELETE FROM inscrição WHERE id = :id")
    suspend fun delete(id: Long)

    @Query(value=  "DELETE FROM inscrição")
    suspend fun deleteAll()

    @Query(value=  "SELECT * FROM inscrição")
    fun getAll(): LiveData<List<RoomDAO>>
}