/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufg.inf.fabrica.mural.central.persistencia;

import br.ufg.inf.fabrica.mural.central.dominio.Papel;
import br.ufg.inf.fabrica.mural.central.dominio.Usuario;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Ulrich
 */
public class UsuarioDAO {
	
	String persisString = "br.ufg.inf.fabrica.muralufg_central_jar_1.0-SNAPSHOTPU";
        
        ArrayList<Papel> listPapel = new ArrayList<Papel>();
        
        
       

	public Usuario buscaUsuario(Long id) {		
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory(persisString);
		EntityManager entityManager = emfactory.createEntityManager();
		Usuario user = null;
		
		try {			
			user = entityManager.find(Usuario.class, id);
		} catch (Exception e) {
			e.printStackTrace();
                        
		}
                System.out.println(user.getId());
		
		return user;
	}
        
       
}
