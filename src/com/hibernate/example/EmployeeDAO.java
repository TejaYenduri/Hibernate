package com.hibernate.example;

import org.hibernate.Session;

public class EmployeeDAO {
	
	public void saveOrUpdateEmployee(Employee emp) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.saveOrUpdate(emp);

	}

	public Employee getEmployee(long empId) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		return (Employee) session.get(Employee.class, empId);
	}

	public void deleteEmployee(Employee emp) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.delete(emp);
	}

}
