package br.ufg.inf.fabrica.mural.central.dominio;

import java.util.ArrayList;

public class PapelDeUsuario {

	private long id;
	private String nome;
	

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

    
    
    public PapelDeUsuario(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
	
    
    public void obterGrupos() {
		 //Não implementado - Considerado fora do escopo
	}
    public String papelDeUsuario(Usuario usuario) {
            return null; //Não implementado - Considerado fora do escopo
    }
	
    public ArrayList<String> obterPapeisUsuario() {
            return null;  //Não implementado - Considerado fora do escopo
    }
    
    
 }
