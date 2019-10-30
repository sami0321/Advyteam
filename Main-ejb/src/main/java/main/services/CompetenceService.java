package main.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import main.entity.Competence;
import main.interfaces.ICompetenceService;


@Stateless
public class CompetenceService implements ICompetenceService {
	@PersistenceContext(unitName = "hr-ejb")

	EntityManager em;

	@Override
	public void addCompetence(Competence competence) {
		// TODO Auto-generated method stub
		em.persist(competence);

	}

	@Override
	public void deleteCompetenceById(int idComp) {
		em.remove(em.find(Competence.class, idComp));

	}

	@Override
	public void updateCompetence(Competence competence) {
		// TODO Auto-generated method stub
		Competence comp = em.find(Competence.class, competence.getIdc());
		comp.setNomc(competence.getNomc());
		comp.setDescriptionc(competence.getDescriptionc());
		comp.setNiveau(competence.getNiveau());
		comp.setMetier(competence.getMetier());
		comp.setFamille(competence.getFamille());
		
		
	}

	@Override
	public List<Competence> getAllCompetences() {
		// TODO Auto-generated method stub
		List<Competence> c = em.createQuery("Select e from Competence e", Competence.class).getResultList();
		return c;
	}

	@Override
	public Competence getCompetenceById(int idComp) {
		// TODO Auto-generated method stub
		Competence c = em.find(Competence.class, idComp);
		return c;
		
	}

}
