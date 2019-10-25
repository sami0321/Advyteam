package Controllers;

import java.io.Serializable;
import java.util.Date;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import lombok.Getter;
import lombok.Setter;
import main.entity.Mission;
import main.interfaces.IMissionService;
import main.services.MissionService;


@Getter
@Setter
@ManagedBean
@SessionScoped
public class MissionBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5369228984219300014L;
	public String title;
	public String description;
	public Date datedeb;
	public Date datefin;
	
	@EJB
	IMissionService ms=new MissionService();
	
	
	public void doAddMission() {
		System.out.println("doAddMission");
		Mission mission = new Mission();
		mission.setTitle(title);
		mission.setDescription(description);
		mission.setDatedeb(datedeb);
		mission.setDatefin(datefin);
		ms.addMission(mission);
	
	}

}
