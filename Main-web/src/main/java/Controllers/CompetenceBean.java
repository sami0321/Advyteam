package Controllers;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.validation.constraints.Size;

import main.entity.Competence;
import main.entity.FamilleCompetences;
import main.interfaces.ICompetenceService;
import main.services.CompetenceService;

@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class CompetenceBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 12345559L;

	@Size(min=2,max=15)
	public String nom;
	public String description;
	public int niveau;
	public FamilleCompetences famille ;
	public String metier;
	private Integer competenceId;

	private List<Competence> competences;

	@EJB
	ICompetenceService comp = new CompetenceService();
	
	
	

	public Integer getCompetenceId() {
		return competenceId;
	}

	public void setCompetenceId(Integer competenceId) {
		this.competenceId = competenceId;
	}

	public List<Competence> getCompetences() {
		return competences;
	}

	public void setCompetences(List<Competence> competences) {
		this.competences = competences;
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

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public ICompetenceService getComp() {
		return comp;
	}

	public void setComp(ICompetenceService comp) {
		this.comp = comp;
	}
	

	
	

	public FamilleCompetences getFamille() {
		return famille;
	}

	public void setFamille(FamilleCompetences famille) {
		this.famille = famille;
	}

	public String getMetier() {
		return metier;
	}

	public void setMetier(String metier) {
		this.metier = metier;
	}

	public String addCompetence() {
		Competence competence = new Competence(nom, description, niveau,famille,metier);
		comp.addCompetence(competence);
		return "/GestionCompetence/addFicheMetier?faces-redirect=true";
	}

	public List<Competence> getCompetence() {
		competences = comp.getAllCompetences();
		return competences;
	}

	public void removeCompetence(int compId) {
		comp.deleteCompetenceById(compId);
	}

	public void updateCompetence(int compId) {
		Competence c = comp.getCompetenceById(competenceId);
		c.setNomc(nom);
		c.setDescriptionc(description);
		c.setNiveau(niveau);
		c.setMetier(metier);
		c.setFamille(famille);
		
		comp.updateCompetence(c);
	}
	
	public void displayComptence(Competence competence) {
		this.setCompetenceId(competence.getIdc());
		this.setNom(competence.getNomc());
		this.setDescription(competence.getDescriptionc());
		this.setNiveau(competence.getNiveau());
		this.setFamille(competence.getFamille());
		this.setMetier(competence.getMetier());
		

	}
	
	     
	    
	    
	
	 

}
