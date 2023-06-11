package com.marinato.leadsmeaning.banco_dados.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.marinato.leadsmeaning.banco_dados.dao.RoomDAO


@Database(entities = [RoomDAO::class], version = 1)
abstract class databaseapp : RoomDatabase {


    abstract val RoomDAO: RoomDAO
}