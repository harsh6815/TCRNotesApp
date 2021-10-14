package com.example.tcsnotesapp

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NotesDao {

    //insert method for adding a new entry to our database.
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(note :Note)

    //delete method for deleting our note.
    @Delete
    suspend fun delete(note: Note)

    @Query("Select * from notesTable order by id ASC")
    fun getAllNotes(): LiveData<List<Note>>

    //method is use to update the note.
    @Update
    suspend fun update(note: Note)

}