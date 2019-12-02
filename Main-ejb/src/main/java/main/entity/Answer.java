package main.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;




@Entity


public class Answer implements Serializable {
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String type_reponse;
	private boolean juste;
	
	@ManyToOne
	private Question question;
	
	private static final long serialVersionUID = 1L;

	public Answer() {
		super();
	}
	public Answer(int id, String type_reponse, boolean juste, Question question) {
		super();
		this.id = id;
		this.type_reponse = type_reponse;
		this.juste = juste;
//		this.question = question;
	}

	
	public String getType_reponse() {
		return type_reponse;
	}
	public void setType_reponse(String type_reponse) {
		this.type_reponse = type_reponse;
	}
	public boolean isJuste() {
		return juste;
	}
	public void setJuste(boolean juste) {
		this.juste = juste;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}

	
	
	

}
