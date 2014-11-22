package br.ufg.inf.fabrica.mural.central.dominio;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

public class Notificacao {
	
        Timer timer;
        String mensagem,senha,idDispositivo,login;
	long idUsuario;
        Usuario usuario = new Usuario(idUsuario,login,senha);
        
    public Notificacao(String login, String senha, String mensagem,String idDispositivo) {
        this.mensagem = mensagem;
        this.senha = senha;
        this.idDispositivo = idDispositivo;
        this.login = login;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String desabilitarNotificacoesDirigidas() {
                timer.cancel();
		return "Notificação desabilitada";
    } 
	

    public void agendarNotificacao(ArrayList<Usuario> listaDestinatario, int idMensagem, String mensagem) {
        timer = new Timer();
        //Executa tarefa a cada 24 horas a partir da primeira
        //Executa tarefa todo dia as 6 da manha
	Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 6);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date time = (Date) calendar.getTime();
        timer.schedule(new tarefasDiarias(), time);                 
    }
	
	public void registrarComFalha(Date dataCorrente, ArrayList<String> listaPublicacao) {
		//Não implementado - considerado fora do escopo
	}
	
	public ArrayList<String> obterDispositivos() {
            return null;
		//Não implementado - considerado fora do escopo
	}
	
        
    class tarefasDiarias extends TimerTask { 
        private int idMensagem;
//classe apoio
        @Override
        public void run() {
            ExecutaDivulgacao executa = new ExecutaDivulgacao();
            executa.executarDivulgacao(idMensagem);
        
        }

    
    }
}

