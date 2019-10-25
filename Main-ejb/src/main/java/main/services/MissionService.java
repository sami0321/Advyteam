package main.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.*;

import main.entity.Mission;
import main.entity.Employee;
import main.interfaces.IMissionService;
@Stateless
public class MissionService implements IMissionService{

@PersistenceContext(unitName="hr-ejb")
	
	EntityManager em ;
	@Override
	public void addMission(Mission mission) {
		em.persist(mission);
		
	}

	@Override
	public Mission getMissionById(int id) {
		// TODO Auto-generated method stub
		return em.find(Mission.class, id);
	}

	@Override
	public void removeMission(int id) {
		// TODO Auto-generated method stub
		Mission mission =getMissionById(id);
		em.remove(mission);
	}

	@Override
	public Mission updateMission(Mission mission) {
		// TODO Auto-generated method stub
		return em.merge(mission);
	}

	@Override
	public List<Mission> getAllMissions() {
		// TODO Auto-generated method stub
		return em.createQuery("from Mission", Mission.class).getResultList();
	}

}
