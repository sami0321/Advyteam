package main.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Evaluation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -197636080460948070L;

	/**
	 * 
	 */
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Override
	public String toString() {
		return "Evaluation [id=" + id + ", performance=" + performance + ", collectif=" + collectif + ", fiabilite="
				+ fiabilite + ", autonomie=" + autonomie + ", employee=" + employee + "]";
	}

	public Evaluation() {
		super();
	}

	private float performance;
	
	private float collectif;

	private float fiabilite;

	private float autonomie;
	
	@ManyToOne private Employee employee;

	
	public Evaluation(int id, float performance, float collectif) {
		super();
		this.id = id;
		this.performance = performance;
		this.collectif = collectif;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPerformance() {
		return performance;
	}

	public void setPerformance(float performance) {
		this.performance = performance;
	}

	public float getCollectif() {
		return collectif;
	}

	public void setCollectif(float collectif) {
		this.collectif = collectif;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Evaluation(float performance) {
		super();
		this.performance = performance;
	}

	public float getFiabilite() {
		return fiabilite;
	}

	public void setFiabilite(float fiabilite) {
		this.fiabilite = fiabilite;
	}

	public float getAutonomie() {
		return autonomie;
	}

	public void setAutonomie(float autonomie) {
		this.autonomie = autonomie;
	}

	public Evaluation(int id, float performance, float collectif, float fiabilite, float autonomie) {
		super();
		this.id = id;
		this.performance = performance;
		this.collectif = collectif;
		this.fiabilite = fiabilite;
		this.autonomie = autonomie;
	}

	public Evaluation(float performance, float collectif, float fiabilite, float autonomie) {
		super();
		this.performance = performance;
		this.collectif = collectif;
		this.fiabilite = fiabilite;
		this.autonomie = autonomie;
	}

	public Evaluation(float performance, float collectif, float fiabilite, float autonomie, Employee employee) {
		super();
		this.performance = performance;
		this.collectif = collectif;
		this.fiabilite = fiabilite;
		this.autonomie = autonomie;
		this.employee = employee;
	}

	
	
	
}
