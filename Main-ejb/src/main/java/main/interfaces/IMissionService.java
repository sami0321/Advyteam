package main.interfaces;

import java.util.List;

import main.entity.Mission;

public interface IMissionService {

	public void addMission(Mission mission);
	public Mission getMissionById(int id);
	public void removeMission(int id);
	public Mission updateMission(Mission mission);
	public List<Mission> getAllMissions();
}
