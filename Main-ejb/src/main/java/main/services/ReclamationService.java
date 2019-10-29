package main.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import main.entity.Employee;
import main.entity.Reclamation;
import main.interfaces.IReclamation;


@Stateless
public class ReclamationService implements IReclamation {

	@PersistenceContext(unitName="hr-ejb")
	
	EntityManager em ;

	@Override
	public int addReclamation(Reclamation rec) {
		System.out.println("In addUser : ");
		em.persist(rec);
		System.out.println("Out of addUser" + rec.getId());
		return rec.getId();
	}

	@Override
	public void removeReclamation(int id) {
		System.out.println("In removeReclamation : ");
		em.remove(em.find(Reclamation.class, id));
		System.out.println("Out of removeReclamation : ");		
	}

	@Override
	public void updateReclamation(Reclamation rec) {
		System.out.println("In updateReclamation : ");
		Reclamation reclamation = em.find(Reclamation.class, rec.getId());
		reclamation.setTitre(rec.getTitre());
		reclamation.setDescription(rec.getDescription());
		reclamation.setEtat((rec.getEtat()));
		System.out.println("Out of updateReclamation :");
		
	}

	@Override
	public Reclamation findReclamationById(int id) {
		System.out.println("In findReclamationById : ");
		Reclamation rec = em.find(Reclamation.class, id);
		System.out.println("Out of findReclamationById : ");
		return rec;
	}

	
	
	@Override
	public void traitReclamation(Reclamation rec) {		
		Reclamation reclamation = em.find(Reclamation.class, rec.getId());
		reclamation.setEtat("traitée");	
		}
	
	@Override
	public List<Reclamation> findReclamationByIdEmp(int id) {
		List<Reclamation>  rec = em.createQuery("Select e from Reclamation e where e.employe.id=:x", Reclamation.class).setParameter("x", id).getResultList(); 
		return rec; 
		}
	
	
	@Override
	public List<Employee> getAllEmployes() { 
		List<Employee> emp = em.createQuery("Select e from Employee e", Employee.class).getResultList(); 
		return emp; }
	
	@Override
	public List<Reclamation> getAllReclamations() { 
		List<Reclamation> rec = em.createQuery("Select r from Reclamation r", Reclamation.class).getResultList(); 
		
		return rec; 
		}
}
