/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufg.inf.fabrica.muralufg;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Timer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Iasmim
 */
public class NotificacaoIT {
    
    public NotificacaoIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTimer method, of class Notificacao.
     */
    @Test
    public void testGetTimer() {
        System.out.println("getTimer");
        Notificacao instance = null;
        Timer expResult = null;
        Timer result = instance.getTimer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimer method, of class Notificacao.
     */
    @Test
    public void testSetTimer() {
        System.out.println("setTimer");
        Timer timer = null;
        Notificacao instance = null;
        instance.setTimer(timer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensagem method, of class Notificacao.
     */
    @Test
    public void testGetMensagem() {
        System.out.println("getMensagem");
        Notificacao instance = null;
        String expResult = "";
        String result = instance.getMensagem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMensagem method, of class Notificacao.
     */
    @Test
    public void testSetMensagem() {
        System.out.println("setMensagem");
        String mensagem = "";
        Notificacao instance = null;
        instance.setMensagem(mensagem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSenha method, of class Notificacao.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        Notificacao instance = null;
        String expResult = "";
        String result = instance.getSenha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSenha method, of class Notificacao.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String senha = "";
        Notificacao instance = null;
        instance.setSenha(senha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdDispositivo method, of class Notificacao.
     */
    @Test
    public void testGetIdDispositivo() {
        System.out.println("getIdDispositivo");
        Notificacao instance = null;
        String expResult = "";
        String result = instance.getIdDispositivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdDispositivo method, of class Notificacao.
     */
    @Test
    public void testSetIdDispositivo() {
        System.out.println("setIdDispositivo");
        String idDispositivo = "";
        Notificacao instance = null;
        instance.setIdDispositivo(idDispositivo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogin method, of class Notificacao.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Notificacao instance = null;
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogin method, of class Notificacao.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        Notificacao instance = null;
        instance.setLogin(login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdUsuario method, of class Notificacao.
     */
    @Test
    public void testGetIdUsuario() {
        System.out.println("getIdUsuario");
        Notificacao instance = null;
        long expResult = 0L;
        long result = instance.getIdUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdUsuario method, of class Notificacao.
     */
    @Test
    public void testSetIdUsuario() {
        System.out.println("setIdUsuario");
        long idUsuario = 0L;
        Notificacao instance = null;
        instance.setIdUsuario(idUsuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class Notificacao.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Notificacao instance = null;
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class Notificacao.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        Notificacao instance = null;
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desabilitarNotificacoesDirigidas method, of class Notificacao.
     */
    @Test
    public void testDesabilitarNotificacoesDirigidas() {
        System.out.println("desabilitarNotificacoesDirigidas");
        Notificacao instance = null;
        String expResult = "";
        String result = instance.desabilitarNotificacoesDirigidas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agendarNotificacao method, of class Notificacao.
     */
    @Test
    public void testAgendarNotificacao() {
        System.out.println("agendarNotificacao");
        ArrayList<Usuario> listaDestinatario = null;
        int idMensagem = 0;
        String mensagem = "";
        Notificacao instance = null;
        instance.agendarNotificacao(listaDestinatario, idMensagem, mensagem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrarComFalha method, of class Notificacao.
     */
    @Test
    public void testRegistrarComFalha() {
        System.out.println("registrarComFalha");
        Date dataCorrente = null;
        ArrayList<String> listaPublicacao = null;
        Notificacao instance = null;
        instance.registrarComFalha(dataCorrente, listaPublicacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterDispositivos method, of class Notificacao.
     */
    @Test
    public void testObterDispositivos() {
        System.out.println("obterDispositivos");
        Notificacao instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.obterDispositivos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
