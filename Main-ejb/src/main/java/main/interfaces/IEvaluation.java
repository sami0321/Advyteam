package main.interfaces;

import java.util.List;

import javax.ejb.Remote;

import main.entity.Evaluation;

@Remote
public interface IEvaluation  {

	
	public int addEvaluation(Evaluation eva);
	public List<Evaluation> findEvaluation(int id);
	Evaluation findEvaluation1(int id);
	
}
