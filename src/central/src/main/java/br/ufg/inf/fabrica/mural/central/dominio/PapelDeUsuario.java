/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufg.inf.fabrica.mural.central.dominio;

import java.io.Serializable;

/**
 *
 * @author Ulrich
 */
public class PapelDeUsuario implements Serializable {
	
	long id;
	String nome;
	
	public PapelDeUsuario(Usuario usuario) {
		
	}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
        
        
}
