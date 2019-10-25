package main.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import main.entity.Employee;
import main.interfaces.IEmployeeService;

@Stateless


public class EmployeeService implements IEmployeeService {
	@PersistenceContext(unitName="hr-ejb")

	EntityManager em ;
	@Override
	public int addEmployee(Employee Employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void removeEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(Employee Employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee findEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee EmployeeAuth(String user, String password) {
		System.out.println("d5al");
		TypedQuery<Employee> query =
				em.createQuery("SELECT u FROM Employee u WHERE u.Username=:user AND u.Password=:password ",
				Employee.class);
				query.setParameter("user", user);
				query.setParameter("password", password);
				Employee emp = null;
				try { emp = query.getSingleResult(); }
				catch (Exception e) { System.out.println("Erreur : " + e); }	
				System.out.println(user.toString());
				return emp;		
	}

}
