package com.hibernate.example;

public class EmployeeService {
	EmployeeDAO employeeDAO = new EmployeeDAO();
	
	
	public void saveOrUpdateEmployee(Employee employee){
		employeeDAO.saveOrUpdateEmployee(employee);
	}
	
	
	public Employee getEmployee(long empId){
		return employeeDAO.getEmployee(empId);
	}
	
	public void deleteEmployee(Employee emp){
		employeeDAO.deleteEmployee(emp);
	}
	

}
