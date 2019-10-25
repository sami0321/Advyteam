package main.interfaces;

import java.util.List;

import main.entity.Note;

public interface INoteService {

	public void addNote(Note note);
	public Note getNoteById(int id);
	public void removeNote(int id);
	public Note updateNote(Note note);
	public List<Note> getAllNotes();
}
