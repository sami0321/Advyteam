package main.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import main.entity.FamilleCompetences;

@Entity(name = "Competence")
@Table(name = "Competence")
public class Competence implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 555L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_c")
	int idc;
	@Column(name = "metier")
	String metier;
	@Column(name = "nom_c")
	String nomc;
	@Column(name = "description_c")
	String descriptionc;
	@Column(name = "niveau")
	int niveau;
	@Column (name="Famille")
	@Enumerated(EnumType.STRING)
	FamilleCompetences famille;
	@OneToMany (cascade= CascadeType.ALL , mappedBy="competence" )
	private Set<ReferenceCompetence> ReferenceCompetences;
	
	
	
	public Competence(String nomc, String descriptionc, int niveau) {
		super();
		this.nomc = nomc;
		this.descriptionc = descriptionc;
		this.niveau = niveau;
	}
	
	
	public Competence(String metier, String nomc, String descriptionc, int niveau, FamilleCompetences famille) {
		super();
		this.metier = metier;
		this.nomc = nomc;
		this.descriptionc = descriptionc;
		this.niveau = niveau;
		this.famille = famille;
	}


	public Competence() {
		super();
	}


	public Competence(String nom, String description, int niveau, FamilleCompetences famille, String metier) {
		// TODO Auto-generated constructor stub
		this.nomc = nom ;
		this.descriptionc =description;
		this.niveau = niveau;
		this.famille=famille;
		this.metier = metier;
		
	}


	public String getMetier() {
		return metier;
	}

	public void setMetier(String metier) {
		this.metier = metier;
	}

	public FamilleCompetences getFamille() {
		return famille;
	}

	public void setFamille(FamilleCompetences famille) {
		this.famille = famille;
	}

	public Set<ReferenceCompetence> getReferenceCompetences() {
		return ReferenceCompetences;
	}

	public void setReferenceCompetences(Set<ReferenceCompetence> referenceCompetences) {
		ReferenceCompetences = referenceCompetences;
	}

	public int getIdc() {
		return idc;
	}
	public void setIdc(int idc) {
		this.idc = idc;
	}
	public String getNomc() {
		return nomc;
	}
	public void setNomc(String nomc) {
		this.nomc = nomc;
	}
	public String getDescriptionc() {
		return descriptionc;
	}
	public void setDescriptionc(String descriptionc) {
		this.descriptionc = descriptionc;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	
	
	
}
