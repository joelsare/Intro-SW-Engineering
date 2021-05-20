package hibernatecar.car;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car c1 = new Car(1, "Toyota", "Red", "ABC-000");
        
        Configuration config = new Configuration().configure().addAnnotatedClass(Car.class);

        SessionFactory sf = config.buildSessionFactory();
        
        Session se = sf.openSession();
        
        Transaction tx = se.beginTransaction();
        se.save(c1);
        tx.commit();
        
        Car car1 = se.get(Car.class, 1);
        System.out.println(c1.toString());
    }
}
