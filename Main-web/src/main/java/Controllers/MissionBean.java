package Controllers;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.CloseEvent;
import org.primefaces.event.MoveEvent;

import lombok.Getter;
import lombok.Setter;
import main.entity.Mission;
import main.interfaces.IMissionService;
import main.services.MissionService;

@Getter
@Setter
@ManagedBean
@SessionScoped
public class MissionBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5369228984219300014L;
	public String title;
	public String description;
	public Date datedeb;
	public Date datefin;
	public List<Mission> missions;
	public Integer missionId;

	@EJB
	IMissionService ms = new MissionService();
	private Mission editMission;

	public String redirectToRoute() {
		System.out.println("id mission à modifier : " + missionId);
		Mission m = new Mission();
		m=ms.getMissionById(missionId);
		title = m.getTitle();
		description = m.getDescription();
		datedeb = m.getDatedeb();
		datefin=m.getDatefin();
		return "/Mission/updateMission.jsf?faces-redirect=true";
	}

	public String editMission() {
		Mission mission=ms.getMissionById(missionId);
		mission.setTitle(title);
		mission.setDescription(description);
		mission.setDatedeb(datedeb);
		mission.setDatefin(datefin);
		ms.updateMission(mission);

		return "/Mission/addMission.xhtml?faces-redirect=true";
	}

	public String doAddMission() {
		System.out.println("doAddMission");
		Mission mission = new Mission();
		mission.setTitle(title);
		mission.setDescription(description);
		mission.setDatedeb(datedeb);
		mission.setDatefin(datefin);
		ms.addMission(mission);
		title = null;
		description = null;
		datedeb = null;
		datefin = null;

		return "";
	}

	public void deleteMission(int id) {
		ms.removeMission(id);
	}

	public void deleteMission() {
		System.out.println("***********" + missionId + "**************************************************");
		ms.removeMission(missionId);
	}

	public void setMissions(List<Mission> missions) {
		this.missions = missions;
	}

	public List<Mission> getMissions() {
		missions = ms.getAllMissions();
		return missions;
	}

}
