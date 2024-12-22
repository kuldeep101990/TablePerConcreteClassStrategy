package tablePerConcreteClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateInheritanceExample {

	 public static void main(String[] args) {
	        // Load the configuration and build the SessionFactory
	        Configuration configuration = new Configuration();
	        configuration.configure("hibernate.cfg.xml");
	        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	        		.applySettings(configuration.getProperties())
	        		.build();
	        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

	        // Create a session
	        Session session = sessionFactory.openSession();
	        Transaction transaction = null;

	        try {
	            transaction = session.beginTransaction();

	            // Create an Employee object
	            Employee employee = new Employee();
	            employee.setId(1L);
	            employee.setName("John Doe");
	            employee.setAddress("123 Elm Street");
	            employee.setSalary(50000.0);
	            employee.setTitle("Manager");

	            // Create a Student object
	            Student student = new Student();
	            student.setId(2L);
	            student.setName("Jane Doe");
	            student.setAddress("456 Oak Avenue");
	            student.setMajor("Computer Science");
	            student.setGpa(3.8);

	            // Save objects
	            session.save(employee);
	            session.save(student);

	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) transaction.rollback();
	            e.printStackTrace();
	        } finally {
	            session.close();
	            sessionFactory.close();
	        }
	    }	            
}