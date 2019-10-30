package main.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import main.entity.FamilleCompetences;

@Entity(name = "FicheMetier")
@Table(name = "FicheMetier")
public class FicheMetier implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 91897L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_f")
	int id;
	@Column(name = "nom_f")
	String nomf;
	@Column(name = "description_f")
	String descriptionf;
	@Column(name = "F_Famille_Competence")
	@Enumerated(EnumType.STRING)
	FamilleCompetences familleCompetence;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "ficheMetier")
	private Set<Employee> employees;

	public FicheMetier(Integer ficheMetierId, String nom, String description) {
		// TODO Auto-generated constructor stub
		this.descriptionf = description;
		this.nomf = nom;
	}

	public FicheMetier(String nomf, String descriptionf) {
		super();
		this.nomf = nomf;
		this.descriptionf = descriptionf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomf() {
		return nomf;
	}

	public void setNomf(String nomf) {
		this.nomf = nomf;
	}

	public String getDescriptionf() {
		return descriptionf;
	}

	public void setDescriptionf(String descriptionf) {
		this.descriptionf = descriptionf;
	}

	public FicheMetier() {
		super();
	}

	public FamilleCompetences getFamilleCompetence() {
		return familleCompetence;
	}

	public void setFamilleCompetence(FamilleCompetences familleCompetence) {
		this.familleCompetence = familleCompetence;
	}

	public Set<Employee> getEmployee() {
		return employees;
	}

	public void setEmployee(Set<Employee> employee) {
		this.employees = employee;
	}

	public FicheMetier(String nomf, String descriptionf, FamilleCompetences familleCompetence) {
		super();
		this.nomf = nomf;
		this.descriptionf = descriptionf;
		this.familleCompetence = familleCompetence;
	}
	
	

}
