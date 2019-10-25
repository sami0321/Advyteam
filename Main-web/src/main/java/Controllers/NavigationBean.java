package Controllers;
//Lenna t7otou les liens mta3 navigation w kol  page ahawka 3andha el controlleur mte3ha//

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

import main.entity.Employee;

@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class NavigationBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3872542176285439402L;
	public String login;
	public String password;
	public Employee user;
	public Boolean loggedIn;

}
