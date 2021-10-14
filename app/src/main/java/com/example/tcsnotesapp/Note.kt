package com.example.tcsnotesapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//table name
@Entity(tableName = "notesTable")

// column information and column name
class Note (@ColumnInfo(name = "title")val noteTitle :String,@ColumnInfo(name = "description")val noteDescription :String,@ColumnInfo(name = "timestamp")val timeStamp :String) {
    @PrimaryKey(autoGenerate = true) var id = 0
}