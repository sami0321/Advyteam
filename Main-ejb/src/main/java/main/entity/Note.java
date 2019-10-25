package main.entity;

import java.io.Serializable;
import javax.persistence.*;

import main.entity.Mission;
import main.enums.State;
import lombok.*;
@Getter
@Setter
@Entity(name="Note")
@Table(name="Note")
public class Note implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3206346455525349977L;
	@Id
	@GeneratedValue( strategy= GenerationType.IDENTITY)
	@Column(name="N_ID")
	int id;
	@Column(name="D_STATE")
	@Enumerated(EnumType.STRING)
	State state;
	@Column(name="N_TOTAL")
	float total;
	@ManyToOne(cascade = CascadeType.ALL)
	Employee employee;
	@ManyToOne(cascade = CascadeType.ALL)
	Mission mission;
}
