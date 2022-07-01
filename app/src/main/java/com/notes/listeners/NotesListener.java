package com.notes.listeners;

import com.notes.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
