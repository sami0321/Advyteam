package Controllers;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import main.entity.FamilleCompetences;

@ManagedBean(name = "data")
@ApplicationScoped
public class DataFamille implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 19823L;
	
	public FamilleCompetences[] getFamilleCompetences() {
		return FamilleCompetences.values();
	}

}
