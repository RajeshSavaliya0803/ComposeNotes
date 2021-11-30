package com.example.composenotes.feature_note.domain.user_case

import com.example.composenotes.feature_note.domain.model.Note
import com.example.composenotes.feature_note.domain.repository.NoteRepository

class GetNoteById(private val repository: NoteRepository) {
    suspend operator fun invoke(id: Int) : Note?{
        return repository.getNoteById(id)
    }
}