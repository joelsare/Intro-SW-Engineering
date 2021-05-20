/**
 */
package util;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import datamodel.MyEmployeeSare;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @since JavaSE-1.8
 */
public class UtilDB {
   static SessionFactory sessionFactory = null;

   public static SessionFactory getSessionFactory() {
      if (sessionFactory != null) {
         return sessionFactory;
      }
      Configuration configuration = new Configuration().configure();
      StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
      sessionFactory = configuration.buildSessionFactory(builder.build());
      return sessionFactory;
   }

   public static List<MyEmployeeSare> listMyEmployeeSare() {
      List<MyEmployeeSare> resultList = new ArrayList<MyEmployeeSare>();

      Session session = getSessionFactory().openSession();
      Transaction tx = null;  // each process needs transaction and commit the changes in DB.

      try {
         tx = session.beginTransaction();
         List<?> MyEmployeeSares = session.createQuery("FROM MyEmployeeSare").list();
         for (Iterator<?> iterator = MyEmployeeSares.iterator(); iterator.hasNext();) {
            MyEmployeeSare MyEmployeeSare = (MyEmployeeSare) iterator.next();
            resultList.add(MyEmployeeSare);
         }
         tx.commit();
      } catch (HibernateException e) {
         if (tx != null)
            tx.rollback();
         e.printStackTrace();
      } finally {
         session.close();
      }
      return resultList;
   }

   //not used
   public static List<MyEmployeeSare> listMyEmployeeSare(String keyword) {
      List<MyEmployeeSare> resultList = new ArrayList<MyEmployeeSare>();

      Session session = getSessionFactory().openSession();
      Transaction tx = null;

      try {
         tx = session.beginTransaction();
         System.out.println((MyEmployeeSare)session.get(MyEmployeeSare.class, 1)); // use "get" to fetch data
        // Query q = session.createQuery("FROM MyEmployeeSare");
         List<?> MyEmployeeSares = session.createQuery("FROM MyEmployeeSare").list();
         for (Iterator<?> iterator = MyEmployeeSares.iterator(); iterator.hasNext();) {
            MyEmployeeSare MyEmployeeSare = (MyEmployeeSare) iterator.next();
            resultList.add(MyEmployeeSare);
         }
         tx.commit();
      } catch (HibernateException e) {
         if (tx != null)
            tx.rollback();
         e.printStackTrace();
      } finally {
         session.close();
      }
      return resultList;
   }

   public static void createMyEmployeeSare(String fname, String lname, String phone, String email) {
      Session session = getSessionFactory().openSession();
      Transaction tx = null;
      try {
         tx = session.beginTransaction();
         session.save(new MyEmployeeSare(fname, lname, phone, email));
         tx.commit();
      } catch (HibernateException e) {
         if (tx != null)
            tx.rollback();
         e.printStackTrace();
      } finally {
         session.close();
      }
   }
}
