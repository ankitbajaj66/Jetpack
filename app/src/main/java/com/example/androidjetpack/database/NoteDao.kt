package com.example.androidjetpack.database

import androidx.room.*

/**
 *Created by Ankit Bajaj on 01-05-2020.
 */
@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote(noteEntity: NoteEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNotes(noteEntities: List<NoteEntity>)

    @Delete
    fun deleteNote(noteEntity: NoteEntity)

    @Query("select * from notes where id= :id")
    fun getNoteEntity(id: Int): NoteEntity


    @Query("select * from notes order by id asc")
    fun getNotes(): List<NoteEntity>

    @Query("delete from notes")
    fun deleteNotes(): Int

    @Query("select count(*) from notes")
    fun getCount(): Int

}