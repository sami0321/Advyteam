package main.entity;

import java.io.Serializable;

import javax.persistence.*;


@Entity(name = "Quiz")
@Table(name = "Quiz")
public class Quiz implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1927648L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_q")
	int idq;
	
	@ManyToOne ReferenceCompetence ReferenceCompetence;

}
