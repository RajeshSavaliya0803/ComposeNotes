package com.example.composenotes.feature_note.domain.user_case

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNoteById: GetNoteById
)