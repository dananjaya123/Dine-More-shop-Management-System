package lk.ijse.dinemore.util;


import lk.ijse.dinemore.entity.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

    private static SessionFactory sessionFactory=bulidSessionFactory();
    private static StandardServiceRegistry registry;

    private static SessionFactory bulidSessionFactory() {
        registry=new StandardServiceRegistryBuilder().loadProperties("/lk/ijse/dinemore/propertyFile/application.properties").build();
        Metadata metadata=new MetadataSources(registry).
               addAnnotatedClass(Chef.class).
                addAnnotatedClass(Deliver.class).
                addAnnotatedClass(Reception.class).
                addAnnotatedClass(Item.class).
                addAnnotatedClass(Customer.class).
                addAnnotatedClass(Orders.class).
                addAnnotatedClass(OrderDetails.class).
                buildMetadata();
        return metadata.getSessionFactoryBuilder().build();
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
