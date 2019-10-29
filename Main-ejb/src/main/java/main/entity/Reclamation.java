package main.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Reclamation implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String titre;
	
	private String Description;
	
	private String etat ;
	
	@ManyToOne
	private Employee employe;

	
	
	public Reclamation(int id, String etat) {
		super();
		this.id = id;
		this.etat = etat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Employee getEmploye() {
		return employe;
	}

	public void setEmploye(Employee employe) {
		this.employe = employe;
	}

	public Reclamation(int id, String titre, String description, String etat, Employee employe) {
		super();
		this.id = id;
		this.titre = titre;
		Description = description;
		this.etat = etat;
		this.employe = employe;
	}

	public Reclamation(String titre, String description, String etat, Employee employe) {
		super();
		this.titre = titre;
		Description = description;
		this.etat = etat;
		this.employe = employe;
	}

	public Reclamation() {
		super();
	}

	public Reclamation(int id, String titre, String description) {
		super();
		this.id = id;
		this.titre = titre;
		Description = description;
	}

	public Reclamation(String titre, String description, String etat) {
		super();
		this.titre = titre;
		Description = description;
		this.etat = etat;
	}

	public Reclamation(int id, String titre, String description, String etat) {
		super();
		this.id = id;
		this.titre = titre;
		Description = description;
		this.etat = etat;
	}

	

}
