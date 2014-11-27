package br.ufg.inf.fabrica.mural.central.persist;

import br.ufg.inf.fabrica.mural.central.dominio.Papel;
import br.ufg.inf.fabrica.mural.central.dominio.Usuario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateFactory {

    private static SessionFactory factory;

    static{
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.configure();
        
        cfg.addAnnotatedClass(Papel.class);
        cfg.addAnnotatedClass(Usuario.class);
        
        factory = cfg.buildSessionFactory();
    }

    public static Session getSession(){
        return factory.openSession();
    }
}
