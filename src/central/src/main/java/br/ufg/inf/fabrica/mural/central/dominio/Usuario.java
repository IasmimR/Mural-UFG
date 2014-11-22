/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.fabrica.mural.central.dominio;
import java.util.ArrayList;


public class Usuario {
	
	private long id;
	private String login;
	private String senha;
	private boolean apenasProdutor;
	private boolean administrador;

    public Usuario(long id, String login, String senha) {
        this.id = id;
        this.login = login;
        this.senha = senha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isApenasProdutor() {
        return apenasProdutor;
    }

    public void setApenasProdutor(boolean apenasProdutor) {
        this.apenasProdutor = apenasProdutor;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
	        
  
    public ArrayList<String> obterUsuariosGrupo(String grupoDestinatario) {
        return null; //Não implementado - considerado fora do escopo	
    }
	

}
