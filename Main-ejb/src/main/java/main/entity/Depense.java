package main.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import main.enums.*;
import lombok.*;

@Getter
@Setter
@Entity(name = "Depense")
@Table(name = "Depense")
public class Depense implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8844932746549893452L;
	
	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY)
	@Column(name="D_ID")
	int id;
	@Column(name="D_TITLE")
	String title;
	@Column(name="D_DATE")
	Date date;
	@Column(name="D_CATEGORY")
	@Enumerated(EnumType.STRING)
	Category category;
	@Column(name="D_STATE")
	@Enumerated(EnumType.STRING)
	State state;
	@Column(name="D_MOY_PAYM")
	@Enumerated(EnumType.STRING)
	MoyPaym moypaym;
	@Column(name="D_TTC")
	float ttc;
	@Column(name="D_TVA")
	float tva;
	@Column(name="D_Description")
	String description;
	@ManyToOne(cascade = CascadeType.ALL)
	Note note;
	
	
}
