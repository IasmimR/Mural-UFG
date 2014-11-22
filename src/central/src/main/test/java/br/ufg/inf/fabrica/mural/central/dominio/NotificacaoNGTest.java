/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufg.inf.fabrica.muralufg;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Timer;
import static org.testng.Assert.*;

/**
 *
 * @author Iasmim
 */
public class NotificacaoNGTest {
    
    public NotificacaoNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Teste de método getTimer, da classe Notificacao.
     */
    @org.testng.annotations.Test
    public void testGetTimer() {
        System.out.println("getTimer");
        Notificacao instance = null;
        Timer expResult = null;
        Timer result = instance.getTimer();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setTimer, da classe Notificacao.
     */
    @org.testng.annotations.Test
    public void testSetTimer() {
        System.out.println("setTimer");
        Timer timer = null;
        Notificacao instance = null;
        instance.setTimer(timer);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getMensagem, da classe Notificacao.
     */
    @org.testng.annotations.Test
    public void testGetMensagem() {
        System.out.println("getMensagem");
        Notificacao instance = null;
        String expResult = "";
        String result = instance.getMensagem();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setMensagem, da classe Notificacao.
     */
    @org.testng.annotations.Test
    public void testSetMensagem() {
        System.out.println("setMensagem");
        String mensagem = "";
        Notificacao instance = null;
        instance.setMensagem(mensagem);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getSenha, da classe Notificacao.
     */
    @org.testng.annotations.Test
    public void testGetSenha() {
        System.out.println("getSenha");
        Notificacao instance = null;
        String expResult = "";
        String result = instance.getSenha();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setSenha, da classe Notificacao.
     */
    @org.testng.annotations.Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String senha = "";
        Notificacao instance = null;
        instance.setSenha(senha);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getIdDispositivo, da classe Notificacao.
     */
    @org.testng.annotations.Test
    public void testGetIdDispositivo() {
        System.out.println("getIdDispositivo");
        Notificacao instance = null;
        String expResult = "";
        String result = instance.getIdDispositivo();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setIdDispositivo, da classe Notificacao.
     */
    @org.testng.annotations.Test
    public void testSetIdDispositivo() {
        System.out.println("setIdDispositivo");
        String idDispositivo = "";
        Notificacao instance = null;
        instance.setIdDispositivo(idDispositivo);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getLogin, da classe Notificacao.
     */
    @org.testng.annotations.Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Notificacao instance = null;
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setLogin, da classe Notificacao.
     */
    @org.testng.annotations.Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        Notificacao instance = null;
        instance.setLogin(login);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getIdUsuario, da classe Notificacao.
     */
    @org.testng.annotations.Test
    public void testGetIdUsuario() {
        System.out.println("getIdUsuario");
        Notificacao instance = null;
        long expResult = 0L;
        long result = instance.getIdUsuario();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setIdUsuario, da classe Notificacao.
     */
    @org.testng.annotations.Test
    public void testSetIdUsuario() {
        System.out.println("setIdUsuario");
        long idUsuario = 0L;
        Notificacao instance = null;
        instance.setIdUsuario(idUsuario);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getUsuario, da classe Notificacao.
     */
    @org.testng.annotations.Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Notificacao instance = null;
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setUsuario, da classe Notificacao.
     */
    @org.testng.annotations.Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        Notificacao instance = null;
        instance.setUsuario(usuario);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método desabilitarNotificacoesDirigidas, da classe Notificacao.
     */
    @org.testng.annotations.Test
    public void testDesabilitarNotificacoesDirigidas() {
        System.out.println("desabilitarNotificacoesDirigidas");
        Notificacao instance = null;
        String expResult = "";
        String result = instance.desabilitarNotificacoesDirigidas();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método agendarNotificacao, da classe Notificacao.
     */
    @org.testng.annotations.Test
    public void testAgendarNotificacao() {
        System.out.println("agendarNotificacao");
        ArrayList<Usuario> listaDestinatario = null;
        int idMensagem = 0;
        String mensagem = "";
        Notificacao instance = null;
        instance.agendarNotificacao(listaDestinatario, idMensagem, mensagem);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método registrarComFalha, da classe Notificacao.
     */
    @org.testng.annotations.Test
    public void testRegistrarComFalha() {
        System.out.println("registrarComFalha");
        Date dataCorrente = null;
        ArrayList<String> listaPublicacao = null;
        Notificacao instance = null;
        instance.registrarComFalha(dataCorrente, listaPublicacao);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método obterDispositivos, da classe Notificacao.
     */
    @org.testng.annotations.Test
    public void testObterDispositivos() {
        System.out.println("obterDispositivos");
        Notificacao instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.obterDispositivos();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }
    
}
