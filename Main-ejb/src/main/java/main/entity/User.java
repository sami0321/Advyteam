package main.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Set;


@Entity
public class User implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id ;
	
	///////////////////////
	@OneToMany(mappedBy="candidate",cascade={CascadeType.ALL},fetch =FetchType.EAGER)
	private Set<Result> result;
	@OneToMany(mappedBy="candidate",cascade={CascadeType.ALL},fetch =FetchType.EAGER)
	private Set<Result> reclamation;
	////////////////
	private String firstName;
	
	private String lastName;
	
	private String cin; 
	
	private String phoneNumber;
	
	private String email;
	
	private String password;
	
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	private boolean actif;
	
	private String role;
	
	
	
	private String contrat_type;
	
	
	


	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public boolean isActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}
	

	public String getContrat_type() {
		return contrat_type;
	}
	public void setContrat_type(String contrat_type) {
		this.contrat_type = contrat_type;
	}
	
	
	
	
	
}
