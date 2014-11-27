package br.ufg.inf.fabrica.mural.central.main;

import br.ufg.inf.fabrica.mural.central.dominio.Usuario;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *  @author Geovane
 */
public class GerarTabelas {

    public static void main(String[] args) throws Exception{

        Configuration conf = new AnnotationConfiguration();
        conf.configure("hibernate.cfg.xml");
        SchemaExport se = new SchemaExport(conf);
        se.create(true, true);     
        
            
    }
}