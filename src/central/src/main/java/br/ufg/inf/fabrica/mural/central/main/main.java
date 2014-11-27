/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufg.inf.fabrica.mural.central.main;

import br.ufg.inf.fabrica.mural.central.dominio.Usuario;
import br.ufg.inf.fabrica.mural.central.persistencia.PapelDeUsuarioDAO;
import br.ufg.inf.fabrica.mural.central.persistencia.UsuarioDAO;
import static javafx.scene.input.KeyCode.U;

/**
 *
 * @author GAOliveira
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //UsuarioDAO usuario = new UsuarioDAO();
        PapelDeUsuarioDAO papel = new PapelDeUsuarioDAO();
        
        papel.buscaPapel(1L);
        //usuario.buscaUsuario(1L);
    }
    
}
