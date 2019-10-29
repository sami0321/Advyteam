package Controllers;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import main.entity.Employee;
import main.entity.Evaluation;
import main.entity.Reclamation;
import main.interfaces.IEvaluation;
import main.services.EvaluationService;




@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class EvaluationBean  implements Serializable {
	
	@EJB
	IEvaluation e = new EvaluationService();
	
	
	private static final long serialVersionUID = 708745952591027804L;
	
	private float performance;
	
	private float collectif;
	
	private float fiabilite;

	private float autonomie;
	
	private Employee employee;
	
	
	public void addevaluation() {
		System.out.println("dkhal reclam");
			e.addEvaluation(new Evaluation(performance,collectif,fiabilite,autonomie,employ));
			}
	private Employee employ;
public String evaluer(Employee emp) {
	
	
	employ=emp;
	return "EvaluationFile";
}

private String s;
private String s1;
private List<Evaluation> evaluations;
public List<Evaluation> getEvaluations() { evaluations = e.findEvaluation(3); 
System.out.println(evaluations+"yassine");
float per=evaluations.get(0).getPerformance();
float col=evaluations.get(0).getCollectif();
float fia=evaluations.get(0).getFiabilite();
float auto=evaluations.get(0).getAutonomie();
s1=amelioration(per , col , fia ,auto);
  s=Calc(per , col , fia ,auto);

return evaluations; }




public String getS() {
	return s;
}




public void setS(String s) {
	this.s = s;
}









public String getS1() {
	return s1;
}




public void setS1(String s1) {
	this.s1 = s1;
}




public String Reclamationpage() {
	
	
	
	return "ReclamationEmployee";
}

public String Calc(float per , float col  , float fia, float auto) {
float a = (per +col+fia+auto)/4;
	
	if (a>=4)
	{return " Excellence : Votre salaire va augmenté de 30% " ;}
	
	if (a>=3 && a<4)
	{return "Au-dessus du niveau attendu : Votre salaire va augmenté de 20%" ;}
	
	if (a>=2.5 && a<3)
	{return "Atteinte du niveau attendu : Votre salaire va augmenté de 10%" ;}
	
	if (a>=2 && a<2.5)
	{return "En-dessous du Niveau attendu : Votre salaire va augmenté de 6% " ;}
	
	if (a<2)
	{return " Procedure de résiliation du contrat" ;}
	
	return "";
}

public String amelioration(float per , float col  , float fia, float auto) {
String l="";
	
	if (per<2.5)
	{l=l+ "<< Performance dans son poste >>      " ;}
	
	if (col<2.5)
	{l=l+ "<< Sens de collectif et coopération >>   " ;}
	
	if (fia<2.4)
	{ l=l+"<< Fiabilité >>    " ;}
	
	if (auto<2.5)
	{l=l+"<< Autonomie >>    " ;}
	
	
	
	return l;
}


























public void setEvaluations(List<Evaluation> evaluations) {
	this.evaluations = evaluations;
}











	public Employee getEmploy() {
	return employ;
}






public void setEmploy(Employee employ) {
	this.employ = employ;
}






	public IEvaluation getE() {
		return e;
	}




	public void setE(IEvaluation e) {
		this.e = e;
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






	public Employee getEmployee() {
		return employee;
	}






	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
	
	
	
}
