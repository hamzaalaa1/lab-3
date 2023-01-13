package iti.jets.dao;
 
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set; 
public class App 
{
    public static void main( String[] args )
    {
                 EntityManagerFactory Emf = Persistence.createEntityManagerFactory("hamza");
                 EntityManager em = Emf.createEntityManager();

                 Student s = new Student("jets","hamza","alaa");
                 em.getTransaction().begin();
                 em.persist(s);
                 em.getTransaction().commit();

                 em.getTransaction().begin();
                 em.persist(new Teacher(new java.util.Date(),"mohamed","alaa"));
                 em.getTransaction().commit();

    }
}
