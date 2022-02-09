package orm.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import orm.entity.Employee;





public class TestORM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Configuration config = new Configuration();
    	 config.configure("hibernate.cfg.xml");
    	 SessionFactory factory = config.buildSessionFactory();
    	 Session session=factory.openSession();
    	Transaction transaction =session.beginTransaction();
    	 
    	 System.out.println("Employee 1 - Saved");
    	Employee emp1=new Employee(0,"Sai",12345.6f);
    	 session.save(emp1);
    	 System.out.println("Saved Successfully");
    	 transaction.commit();
    	 session.close();
		 //System.out.println("Employee 1 - Saved");
	}

}
