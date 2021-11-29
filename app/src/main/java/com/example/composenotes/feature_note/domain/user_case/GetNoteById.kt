package com.example.composenotes.feature_note.domain.user_case

import com.example.composenotes.feature_note.domain.repository.NoteRepository

class GetNoteById(private val repository: NoteRepository) {
    suspend operator fun invoke(id: Int){
        repository.getNoteById(id)
    }
}