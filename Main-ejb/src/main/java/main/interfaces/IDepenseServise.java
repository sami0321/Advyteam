package main.interfaces;

import java.util.List;

import main.entity.Depense;

public interface IDepenseServise {

	public void addDepense(Depense depense);
	public Depense getDepenseById(int id);
	public void removeDepense(int id);
	public Depense updateDepense(Depense depense);
	public List<Depense> getAllDepenses();
}
