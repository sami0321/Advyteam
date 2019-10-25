package main.enums;

import java.util.List;

import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import main.entity.Depense;
import main.interfaces.IDepenseServise;
@Stateless
public class DepenseService implements IDepenseServise{

@PersistenceContext(unitName="hr-ejb")
	
	EntityManager em ;

@Override
public void addDepense(Depense depense) {
	// TODO Auto-generated method stub
	em.persist(depense);
}

@Override
public Depense getDepenseById(int id) {
	// TODO Auto-generated method stub
	return em.find(Depense.class, id);
}

@Override
public void removeDepense(int id) {
	// TODO Auto-generated method stub
	Depense depense=getDepenseById(id);
	em.remove(depense);
}

@Override
public Depense updateDepense(Depense depense) {
	// TODO Auto-generated method stub
	return em.merge(depense);
}

@Override
public List<Depense> getAllDepenses() {
	// TODO Auto-generated method stub
	return em.createQuery("from Depense",Depense.class).getResultList();
}
}
