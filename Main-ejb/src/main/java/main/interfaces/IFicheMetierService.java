package main.interfaces;

import java.util.List;
import main.entity.FicheMetier;

public interface IFicheMetierService {

	
	public void addFicheMetier(FicheMetier fiche);
	public void deleteFicheMetierById(int idfiche);
	public void updateFicheMetier(FicheMetier fiche) ;
	public List<FicheMetier> getAllfIFicheMetiers();
	public FicheMetier getFicheMetierById(int idfiche);
}
