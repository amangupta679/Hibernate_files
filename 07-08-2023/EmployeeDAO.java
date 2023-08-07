package org.springframework.hibernateDemo;



import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mysql.cj.Session;

public class EmployeeDAO {
	SessionFactory factory = null ; 
	public EmployeeDAO(SessionFactory factory)
	{
		this.factory= factory ; 
		
	}
	public void insertEmployee(Employee employee)
	{
		org.hibernate.Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		try {
			session.delete(employee);
			trans.commit();
			
		}
		catch(Exception ex)
		{
			trans.rollback();
			ex.printStackTrace();
		}
		

		}
	public void modiffyEmployee(Employee employee)
	{
		org.hibernate.Session session  = factory.openSession();
		Transaction trans = session.beginTransaction();
		try {
			session.update(employee);
			trans.commit();
			
		}
		catch(Exception ex)
		{
			trans.rollback();
			ex.printStackTrace();
		}
		}
	
	public Employee getEmployee(Employee employee)
	{
		org.hibernate.Session session  = factory.openSession();
		return session.get(Employee.class,employee);
		}
	}

