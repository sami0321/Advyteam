package Controllers;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import main.entity.Employee;
import main.entity.Reclamation;
import main.interfaces.IReclamation;
import main.services.ReclamationService;


@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class ReclamationBean implements Serializable {
	

		/**
		 * 
		 */
		private static final long serialVersionUID = 708745952591027804L;

		private String titre;
		private String description;
		private Employee employe;
		private String etat;
		
		private String  Username;
		
		private String FirstName; 
		
		private String LastName; 
		
		private Long Cin;
		
		private	Long phonenumber; 
		
		@EJB
		IReclamation r = new ReclamationService();
		///////add reclamation//////////

		public void addreclamation() {
		System.out.println("dkhal reclam");
			r.addReclamation(new Reclamation( titre, description, "Non Traité", employe));
		 
			}
	
	////// recuperer liste reclamation/////////////
	private List<Reclamation> reclamations;
	public List<Reclamation> getReclamations() { reclamations = r.getAllReclamations(); return reclamations; }
	
	
	/////// afficher reclamation //////////////
	
	
	private Integer ReclamationIdToBeUpdated;
	public void  displayReclamation(Reclamation rec) {
		
		Reclamation reclamation = r.findReclamationById(rec.getId());
		ReclamationIdToBeUpdated=reclamation.getId();
		this.setDescription(reclamation.getDescription());
		this.setTitre(reclamation.getTitre());
	}
	
	private Integer ReclamationIdToBeUpdatedetat;
public void  displayReclamationetat(Reclamation rec) {
		
		Reclamation reclamation = r.findReclamationById(rec.getId());
		ReclamationIdToBeUpdatedetat=reclamation.getId();
		this.setEtat((reclamation.getEtat()));
		this.setDescription((reclamation.getDescription()));
		this.setTitre((reclamation.getTitre()));
		
		
	}
	
	
	
	/////////////update etat //////////
	
	public void updatereclamationetat() { 
		r.updateReclamation(new Reclamation(ReclamationIdToBeUpdatedetat,titre,description,etat));
		} 
			
		////////////////update reclamation //////////////
		public void updatereclamation() { 
			r.updateReclamation(new Reclamation(ReclamationIdToBeUpdated,titre,description));
			} 
				
	///////////lise employe//////////////
	private List<Employee> employes;
	public List<Employee> getEmployes() { employes = r.getAllEmployes(); return employes; }

	/////////liste reclamation by id emp////////////////
	private List<Reclamation> reclamationsemp;
	public List<Reclamation> getReclamationsemp() { reclamationsemp = r.findReclamationByIdEmp(1); return reclamationsemp; }
	///////////////delete reclamation /////////////////
	
	public void DeleteReclamation(Reclamation rec) { r.removeReclamation(rec.getId()); }
	
	//////////// getter & setter/////////////////
	

	
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Employee getEmploye() {
		return employe;
	}

	public void setEmploye(Employee employe) {
		this.employe = employe;
	}

	public IReclamation getR() {
		return r;
	}

	public void setR(IReclamation r) {
		this.r = r;
	}



	public void setReclamations(List<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public Long getCin() {
		return Cin;
	}

	public void setCin(Long cin) {
		Cin = cin;
	}

	public Long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public void setEmployes(List<Employee> employes) {
		this.employes = employes;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}



	public Integer getReclamationIdToBeUpdatedetat() {
		return ReclamationIdToBeUpdatedetat;
	}



	public void setReclamationIdToBeUpdatedetat(Integer reclamationIdToBeUpdatedetat) {
		ReclamationIdToBeUpdatedetat = reclamationIdToBeUpdatedetat;
	}

	

	
	

}
