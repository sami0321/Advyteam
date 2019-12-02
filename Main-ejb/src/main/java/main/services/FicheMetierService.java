package main.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import main.entity.FicheMetier;
import main.interfaces.IFicheMetierService;

@Stateless
public class FicheMetierService implements IFicheMetierService {

	@PersistenceContext(unitName = "hr-ejb")

	EntityManager em;

	@Override
	public void addFicheMetier(FicheMetier fiche) {
		em.persist(fiche);

	}

	@Override
	public void deleteFicheMetierById(int idfiche) {
		// TODO Auto-generated method stub
		em.remove(em.find(FicheMetier.class, idfiche));
	}

	@Override
	public void updateFicheMetier(FicheMetier fiche) {
		// TODO Auto-generated method stub
		FicheMetier f = em.find(FicheMetier.class, fiche.getId());
		f.setNomf(fiche.getNomf());
		f.setDescriptionf(fiche.getDescriptionf());

	}

	@Override
	public List<FicheMetier> getAllfIFicheMetiers() {
		// TODO Auto-generated method stub
		List<FicheMetier> f = em.createQuery("Select e from FicheMetier e", FicheMetier.class).getResultList();
		return f;
	}

	@Override
	public FicheMetier getFicheMetierById(int idfiche) {
		// TODO Auto-generated method stub
		FicheMetier f = em.find(FicheMetier.class, idfiche);
		return f;
	}
	
	

}
