package br.ufg.inf.fabrica.mural.central.dominio;
import java.util.ArrayList;
 


public class SolicitacaoOuvidoria {	
	   
    int idMensagem;String mensagem,login,senha,idDispositivo;
    long idUsuario;
    ArrayList<Usuario> listaGrupoDestinatario;
    String grupoDestinatario = "Ouvidores";
    ArrayList<String> listaGrupoUsuarios;
    Usuario user = new Usuario(idUsuario,login,senha);

    public SolicitacaoOuvidoria(int idMensagem, String mensagem, String login, String senha, String idDispositivo, long idUsuario, ArrayList<Usuario> listaGrupoDestinatario, ArrayList<String> listaGrupoUsuarios) {
        this.idMensagem = idMensagem;
        this.mensagem = mensagem;
        this.login = login;
        this.senha = senha;
        this.idDispositivo = idDispositivo;
        this.idUsuario = idUsuario;
        this.listaGrupoDestinatario = listaGrupoDestinatario;
        this.listaGrupoUsuarios = listaGrupoUsuarios;
    }

    public int getIdMensagem() {
        return idMensagem;
    }

    public void setIdMensagem(int idMensagem) {
        this.idMensagem = idMensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
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

    public String getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(String idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public ArrayList<Usuario> getListaGrupoDestinatario() {
        return listaGrupoDestinatario;
    }

    public void setListaGrupoDestinatario(ArrayList<Usuario> listaGrupoDestinatario) {
        this.listaGrupoDestinatario = listaGrupoDestinatario;
    }

    public String getGrupoDestinatario() {
        return grupoDestinatario;
    }

    public void setGrupoDestinatario(String grupoDestinatario) {
        this.grupoDestinatario = grupoDestinatario;
    }

    public ArrayList<String> getListaGrupoUsuarios() {
        return listaGrupoUsuarios;
    }

    public void setListaGrupoUsuarios(ArrayList<String> listaGrupoUsuarios) {
        this.listaGrupoUsuarios = listaGrupoUsuarios;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
           

    void SolicitacaoOuvidoria(String mensagem){   
	    this.mensagem = mensagem;
	    if (validarInformacao(mensagem)){
	        executarSolicitacao();
	    }
	    else {
	        //se a mensagem estiver vazia retornará false e chamará o codigo 10009
	        System.out.print("10009: Informação a ser divulgada não esta presente na requisição");

	}}
       
       
    void executarSolicitacao(){
            listaGrupoUsuarios = user.obterUsuariosGrupo(grupoDestinatario);
	    //chamar void agendarNotificacao(Usuario listaDestinario)
	    Notificacao notificacao = new Notificacao(login,senha,mensagem,idDispositivo); 
	    notificacao.agendarNotificacao(listaGrupoDestinatario, idMensagem, mensagem);
    }
    

	boolean validarInformacao (String mensagem){
	   boolean verificaMensagemVazia = false;
	   if ((mensagem.equals("")) || (mensagem.equals(null))){
	       verificaMensagemVazia = false;
	   }
	   else
	   {      verificaMensagemVazia = true;
	   }
	       return verificaMensagemVazia;
	}

}
