package main.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import lombok.*;
@Getter
@Setter
@Entity(name="Mission")
@Table(name="Mission")
public class Mission implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7240943462194847145L;


	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY)
	@Column(name="M_ID")
	int id;
	@Column(name="M_TITLE")
	String title;
	@Column(name="M_DESCRIPTION")
	String description;
	@Column(name="DATE_DEB")
	Date datedeb;
	@Column(name="DATE_FIN")
	Date datefin;
	@ManyToOne(cascade = CascadeType.ALL)
	Employee manager;

}
