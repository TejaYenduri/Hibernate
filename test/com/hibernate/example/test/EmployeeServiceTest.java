package com.hibernate.example.test;

import static org.junit.Assert.assertTrue;

import org.hibernate.Session;
import org.junit.Test;

import com.hibernate.example.Employee;
import com.hibernate.example.EmployeeDAO;
import com.hibernate.example.EmployeeService;
import com.hibernate.example.HibernateUtil;



public class EmployeeServiceTest {
	EmployeeDAO empDAO = new EmployeeDAO();

	@Test
	public void testCreateEmployee(){
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Employee employee = new Employee();
		employee.setFirstName("Chase");
		employee.setLastName("Wilson");
		EmployeeService empService = new EmployeeService();
		empService.saveOrUpdateEmployee(employee);
		//System.out.println(employee.getFirstName() + employee.getLastName());
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
		assertTrue(employee.getId()>0);
		//System.out.println("after commit"+employee.getFirstName() + employee.getLastName());
	}
}
