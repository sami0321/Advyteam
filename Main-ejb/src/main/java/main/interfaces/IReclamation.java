package main.interfaces;

import java.util.List;

import javax.ejb.Remote;

import main.entity.Employee;
import main.entity.Reclamation;



@Remote
public interface IReclamation {

	
	public int addReclamation(Reclamation r);
	public void removeReclamation(int id) ;
	public void updateReclamation(Reclamation rec);
	public Reclamation findReclamationById(int id);
	public List<Reclamation> getAllReclamations();
	public void traitReclamation(Reclamation rec) ;
	public List<Reclamation> findReclamationByIdEmp(int id);
	public List<Employee> getAllEmployes();
}
