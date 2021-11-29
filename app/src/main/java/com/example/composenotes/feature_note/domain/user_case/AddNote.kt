package com.example.composenotes.feature_note.domain.user_case

import com.example.composenotes.feature_note.domain.model.InvalidNoteException
import com.example.composenotes.feature_note.domain.model.Note
import com.example.composenotes.feature_note.domain.repository.NoteRepository

class AddNote(private val repository: NoteRepository) {

    @Throws(InvalidNoteException::class)

    suspend operator fun invoke(note:Note){
        if(note.title.isBlank()){
            throw InvalidNoteException("The title of note can't be empty")
        }
        if(note.content.isBlank()){
            throw InvalidNoteException("The content of note can't be empty")
        }
        return repository.insertNote(note)
    }
}