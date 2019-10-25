package main.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import main.entity.Note;
import main.interfaces.INoteService;
@Stateless
public class NoteService implements INoteService{

@PersistenceContext(unitName="hr-ejb")
	
	EntityManager em ;


	@Override
	public void addNote(Note note) {
		// TODO Auto-generated method stub
		em.persist(note);
	}

	@Override
	public Note getNoteById(int id) {
		// TODO Auto-generated method stub
		return em.find(Note.class, id);
	}

	@Override
	public void removeNote(int id) {
		// TODO Auto-generated method stub
		Note note =getNoteById(id);
		em.remove(note);
	}

	@Override
	public Note updateNote(Note note) {
		// TODO Auto-generated method stub
		return em.merge(note);
	}

	@Override
	public List<Note> getAllNotes() {
		// TODO Auto-generated method stub
		return em.createQuery("from Note",Note.class).getResultList();
	}

}
