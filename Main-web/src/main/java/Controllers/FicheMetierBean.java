package Controllers;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import main.entity.FicheMetier;
import main.entity.Question;
import main.entity.Employee;
import main.entity.FamilleCompetences;
import main.interfaces.IEmployeeService;
import main.interfaces.IFicheMetierService;
import main.services.EmployeeService;
import main.services.FicheMetierService;

@SuppressWarnings("deprecation")
@ManagedBean (eager=true)
@SessionScoped
public class FicheMetierBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 100389L;
	public String nom;
	public String description;
	public FamilleCompetences famille; 
	private FicheMetier fi;
	private Employee emp;
	
	private String nomEmp;

	private Integer ficheMetierId;
	private List<Employee> e;
	private List<FicheMetier> fiches;

	@EJB
	IFicheMetierService fms = new FicheMetierService();
	@EJB
	IEmployeeService ems = new EmployeeService();

	public Integer getFicheMetierId() {
		return ficheMetierId;
	}
	
	public IEmployeeService getEms() {
		return ems;
	}

	public void setEms(IEmployeeService ems) {
		this.ems = ems;
	}

	public void setFicheMetierId(Integer ficheMetierId) {
		this.ficheMetierId = ficheMetierId;
	}

	public List<FicheMetier> getFiches() {
		return fiches;
	}

	public void setFiches(List<FicheMetier> fiches) {
		this.fiches = fiches;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public IFicheMetierService getFms() {
		return fms;
	}

	public void setFms(IFicheMetierService fms) {
		this.fms = fms;
	}
	
 
	public FicheMetier getFi() {
		return fi;
	}

	public void setFi(FicheMetier fi) {
		this.fi = fi;
	}

	public String getNomEmp() {
		return nomEmp;
	}

	public void setNomEmp(String nomEmp) {
		this.nomEmp = nomEmp;
	}

	public List<Employee> getE() {
		return e;
	}

	public void setE(List<Employee> e) {
		this.e = e;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public String addFicheMetier() {
		FicheMetier fiche = new FicheMetier(nom, description,famille);
		fms.addFicheMetier(fiche);
		return "/GestionCompetence/welcome?faces-redirect=true";
	}
	public String redirect() {
		return "/pages/sami/afficherDomain?faces-redirect=true";
	}

	public List<FicheMetier> getFicheMetiers() {
		fiches = fms.getAllfIFicheMetiers();
		return fiches;
	}
	
	public List<Employee> getEmp() {
		e = ems.findAllEmployees();
		return e;
	}

	public void removeFiche(int ficheId) {
		fms.deleteFicheMetierById(ficheId);
	}

	public void updateFiche(int ficheId) {
		FicheMetier f = fms.getFicheMetierById(ficheMetierId);
		f.setDescriptionf(description);
		f.setNomf(nom);
		fms.updateFicheMetier(f);
	}

	public void displayFichMetier(FicheMetier fiche) {
		this.setFicheMetierId(fiche.getId());
		this.setNom(fiche.getNomf());
		this.setDescription(fiche.getDescriptionf());
		this.setFamille(fiche.getFamilleCompetence());

	}

	public FamilleCompetences getFamille() {
		return famille;
	}

	public void setFamille(FamilleCompetences famille) {
		this.famille = famille;
	}
	
	
	
	

}
