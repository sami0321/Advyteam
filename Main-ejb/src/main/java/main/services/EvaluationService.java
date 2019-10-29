package main.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import main.entity.Evaluation;
import main.interfaces.IEvaluation;
@Stateless
public class EvaluationService implements IEvaluation {

@PersistenceContext(unitName="hr-ejb")
	
	EntityManager em ;


@Override
public int addEvaluation(Evaluation eva) {
	System.out.println("In addUser : ");
	em.persist(eva);
	System.out.println("Out of addUser" + eva.getId());
	return eva.getId();
}


@Override
public List<Evaluation> findEvaluation(int id) {
	List<Evaluation>  eva = em.createQuery("Select a from Evaluation a where a.employee.id=:x", Evaluation.class).setParameter("x", id).getResultList(); 
	return eva; 
	}

@Override
public Evaluation findEvaluation1(int id) {
	Evaluation  eva = em.createQuery("Select a from Evaluation a where a.employee.id=:x", Evaluation.class).setParameter("x", id).getSingleResult(); 
	return eva; 
	}

	
}
