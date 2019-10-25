package main.interfaces;

import java.util.List;

import main.entity.Employee;

public interface IEmployeeService {
	public int addEmployee(Employee Employee);
	public void removeEmployee(int id);
	public void updateEmployee(Employee Employee);
	public Employee findEmployeeById(int id);
	public List<Employee> findAllEmployees();
	public Employee EmployeeAuth(String user, String password);
	


}
