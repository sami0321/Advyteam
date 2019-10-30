package main.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "ReferenceCompetence")
@Table(name = "ReferenceCompetence")
public class ReferenceCompetence implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 882927L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cf")
	int idcf;
	@Column(name = "description_c")
	String descriptionc;
	@Column(name = "niveauAcquis")
	int niveauAcquis;
	
	@ManyToOne(cascade = CascadeType.ALL)
	Employee employee;
	
	@ManyToOne(cascade = CascadeType.ALL)
	Competence competence;
	
	@OneToMany (cascade= CascadeType.ALL , mappedBy="ReferenceCompetence" )
	private Set<Quiz> Quizs;

	public int getIdcf() {
		return idcf;
	}

	public void setIdcf(int idcf) {
		this.idcf = idcf;
	}

	public String getDescriptionc() {
		return descriptionc;
	}

	public void setDescriptionc(String descriptionc) {
		this.descriptionc = descriptionc;
	}

	public int getNiveauAcquis() {
		return niveauAcquis;
	}

	public void setNiveauAcquis(int niveauAcquis) {
		this.niveauAcquis = niveauAcquis;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Competence getCompetence() {
		return competence;
	}

	public void setCompetence(Competence competence) {
		this.competence = competence;
	}

	public Set<Quiz> getQuizs() {
		return Quizs;
	}

	public void setQuizs(Set<Quiz> quizs) {
		Quizs = quizs;
	}
	
	
	
	
	
	

}
