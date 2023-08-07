package org.springframework.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	SessionFactory factory = HibernateUtil.buildSessionFactory();
//    	Session session = factory.openSession();
//    	Transaction trans = session.beginTransaction();
//    	Employee e = new Employee(105,"ankit Gupta" , 2000 , 11);
    	//Employee e = session.get(Employee.class,102);
    //	Transaction trans = session.beginTransaction();
//    	session.save(e);
//    	trans.commit();
//    	session.close();
    	
//    	if(e!=null)
//    		System.out.println(e.getEmployeeName()+ " "+e.getSalary()+ " "+e.getDepartmentNo());
//    	else
//    		System.out.println("employee witj id 1014 doesniy exist");
//    	session.close();
    	
    	
//  	if(e!=null)
//  		session.delete(e);
//  	else
//  		System.out.println("employee with id 102 does not exist");
//  	
//    		e.setEmployeeName("Babu Raj");
//    	System.out.println("is session Dirty" + session.isDirty());
//    	trans.commit();
//    	System.out.println("is  session dirty"+ session.isDirty());
//    	session.close();
//    	
//    	HibernateUtil.shutdown();
// ............................................................
//    	session.update(e);
//    	trans.commit();
//    	session.close();
//    	HibernateUtil.shutdown();
    	
    	
    	
    	// ..............................................
    
    	//session.saveOrUpdate(e);
//    	trans.commit();
//    	session.close();
//    	HibernateUtil.shutdown();
//    	}
    	
//    	SessionFactory factory = HibernateUtil.buildSessionFactory();
//    	EmployeeDAO edao = new EmployeeDAO(factory);
//    	edao.insertEmployee(new Employee(102,"Dk" , 2000,20));
//    	Employee e = edao.getEmployee(101);
//    	if(e!=null)
//    		
//    		System.out.println(e.getEmployeeName()+" "+ e.getSalary()+" "+e.getDepartmentNo());
////    
//    	edao.modifyEmployee(new Employee(103 , "ram charan",3300 , 33));
////    	edao.modifyEmployee(new Employee(101 , " ",0 ,0));
//    	HibernateUtil.shutdown();
//    	
    	
//    	SessionFactory factory = HibernateUtil.buildSessionFactory();
//    	Session session  = factory.openSession();
//    	Person p = session.get(Person.class, 787);
//    	if(p!=null)
//    	{
//    		System.out.println(p.getSsn()+" "+p.getPersonName()+"  "+p.getPersonAge()+" "+p.getGender());
//    		System.out.println(p.getAddress()+" "+p.getHouseNo()+" "+p.getAddress().getStreetName() );
//    		System.out.println(p.getAddress().getCityName() + " "+p.getAddress().getStateName());
//    	}
//    	Address a = session.get(Address.class, 7001);
//    	if(a!=null)
//    	{
//    		System.out.println(a.getHouseNo()+" "+a.getStreetName());
//    		System.out.println(a.getCityName()+  "  "+a.getStateName());
//    		System.out.println(a.getPerson().getSsn() +" "+ a.getPerson().getPersonName());
//    		System.out.println(a.getPerson().getPersonAge()+" "+a.getPerson().getGender();
//    	}
//    	session.close();
//    	HibernateUtil.shutdown();
    	
    	
    	//.......................................
    	
//    	SessionFactory factory = HibernateUtil.buildSessionFactory();
//   	Session session  = factory.openSession();
//   	Address a = new Address(7004, "9-9-9","AB Street","egagag","aergdfg");
//   	Person  p  = new Person(789,"dk",29,"m",a);
//   	Transaction trans = session.beginTransaction();
//   	session.save(a);
//   	session.save(p);
//   	trans.commit();
//   	session.close();
//   	HibernateUtil.shutdown();
   	//............................................................
    	
//    	SessionFactory factory = HibernateUtil.buildSessionFactory();
//   	Session session  = factory.openSession();	
//   Department d = session.get(Department.class, 10 );
//  // Transaction trans = session.beginTransaction();
//   
//   if(d!=null)
//   {
//	   System.out.println(d.getDepartmentName()+" "+d.getDepartmentName()+" "+d.getLocation());
//   for(Employee e : d.getEmployee())
//	  
//	  System.out.println(e.getEmployeeId()+" "+e.getEmployeeName()+" "+e.getSalary());
//   }
//   Employee e = session.get(Employee.class, 101);
//   if(e!=null) {
//	   
//	   System.out.println(e.getEmployeeId()+"  "+ e.getEmployeeName()+" "+e.getSalary());
//	   System.out.println(e.getDepartment().getdepartmentNo()+" "+e.getDepartment().getDepartmentName());
//	   System.out.println(e.getDepartment().getLocation());
//	   
//   
//  // session.delete(d);
// // trans.commit();
//	   session.close();
//  HibernateUtil.shutdown();
//    // lazy ffetching 
    	
    	
   //...................................................
    	
    	
    	SessionFactory factory = HibernateUtil.buildSessionFactory();
    	Session session  = factory.openSession();	
    	Course c = session.get(Course.class, "core java");
    	if(c!=null) {
    		System.out.println(c.getCourseName()+ "  "+ c.getCourseDuration());
    		System.out.println(c.getCourseFee() + "   "+ c.getFacultyName());
    		for(Student s : c.getStudent())
    			System.out.println(s.getStudentName()+" "+s.getMobileNo()+" "+s.getStudentAddress());
    		
    	
   }
    	System.out.println(".............................................");
    	Student s = session.get(Student.class, 8001);
    	if(s!=null)
    		{
    		System.out.println(s.getStudentName()+" "+s.getMobileNo()+" "+s.getStudentAddress());
    		for(Course c1 : s.getCourses())
    		{
    			System.out.println(c1.getCourseName()+" "+c1.getCourseDuration());
    			System.out.println(c1.getCourseFee()+" "+c1.getFacultyName());
    			
    		}
    	}
    	session.close();
    	HibernateUtil.shutdown();
    	
    	
   	
   	
   	
  
   	
   	
   	
}
}
