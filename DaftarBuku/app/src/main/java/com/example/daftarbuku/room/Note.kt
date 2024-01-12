package com.example.daftarbuku.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val judul: String,
    val deskripsi: String,
    val penulis: String,
    val penerbit: String,
    val tahun: String
)