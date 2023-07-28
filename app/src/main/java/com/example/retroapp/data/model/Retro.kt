package com.example.retroapp.data.model

data class Retro(
    val id: String = "",
    val admin: String = "",
    val notes: List<Notes> = listOf(),
    val isActive: Boolean = false,
    val title: String = "",
    val time: Int = 0
)