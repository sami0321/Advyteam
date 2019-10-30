package main.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import main.entity.FicheMetier;
import main.entity.ReferenceCompetence;
@Entity(name="Employee")

public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3879079015656042767L;
	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY)
	@Column(name="U_ID")
	int id;
	@Column(name="U_NAME")
	String  Username;
	@Column(name="U_PASSSWORD")
	String Password;

	@Column(name="U_Role")
	@Enumerated(EnumType.STRING)
	Role role;
	@Column(name="U_FirstName")
	String FirstName; 
	@Column(name="U_LastName")
	String LastName; 
	@Column(name="U_Cin")
	Long Cin;
	@Column(name="U_PhoneNumber")
	Long phonenumber;
	@ManyToOne(cascade = CascadeType.ALL)
	FicheMetier ficheMetier;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
	private Set<ReferenceCompetence> ReferenceCompetences;
	
	@OneToMany(mappedBy="candidate",cascade={CascadeType.ALL},fetch =FetchType.EAGER)
	private Set<Result> result;
	@OneToMany(mappedBy="candidate",cascade={CascadeType.ALL},fetch =FetchType.EAGER)
	private Set<Result> reclamation;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
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
	

}
