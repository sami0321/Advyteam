package main.interfaces;

import java.util.List;

import main.entity.Competence;

public interface ICompetenceService {
	
	public void addCompetence (Competence competence);
	public void deleteCompetenceById(int idComp);
	public void updateCompetence(Competence competence) ;
	public List<Competence> getAllCompetences();
	public Competence getCompetenceById(int idComp);
}
