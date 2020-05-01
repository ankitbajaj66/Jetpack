package com.example.androidjetpack.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 *Created by Ankit Bajaj on 01-05-2020.
 */
@Entity(tableName = "notes")
data class NoteEntity(@PrimaryKey(autoGenerate = true) var id: Int,
                      @ColumnInfo(name = "desc") var descrition: String?) {
}