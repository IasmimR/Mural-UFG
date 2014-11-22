/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufg.inf.fabrica.muralufg;

import java.util.ArrayList;
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
public class SolicitacaoOuvidoriaIT {
    
    public SolicitacaoOuvidoriaIT() {
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
     * Test of getIdMensagem method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testGetIdMensagem() {
        System.out.println("getIdMensagem");
        SolicitacaoOuvidoria instance = null;
        int expResult = 0;
        int result = instance.getIdMensagem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdMensagem method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testSetIdMensagem() {
        System.out.println("setIdMensagem");
        int idMensagem = 0;
        SolicitacaoOuvidoria instance = null;
        instance.setIdMensagem(idMensagem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMensagem method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testGetMensagem() {
        System.out.println("getMensagem");
        SolicitacaoOuvidoria instance = null;
        String expResult = "";
        String result = instance.getMensagem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMensagem method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testSetMensagem() {
        System.out.println("setMensagem");
        String mensagem = "";
        SolicitacaoOuvidoria instance = null;
        instance.setMensagem(mensagem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogin method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        SolicitacaoOuvidoria instance = null;
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogin method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        SolicitacaoOuvidoria instance = null;
        instance.setLogin(login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSenha method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        SolicitacaoOuvidoria instance = null;
        String expResult = "";
        String result = instance.getSenha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSenha method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String senha = "";
        SolicitacaoOuvidoria instance = null;
        instance.setSenha(senha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdDispositivo method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testGetIdDispositivo() {
        System.out.println("getIdDispositivo");
        SolicitacaoOuvidoria instance = null;
        String expResult = "";
        String result = instance.getIdDispositivo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdDispositivo method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testSetIdDispositivo() {
        System.out.println("setIdDispositivo");
        String idDispositivo = "";
        SolicitacaoOuvidoria instance = null;
        instance.setIdDispositivo(idDispositivo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdUsuario method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testGetIdUsuario() {
        System.out.println("getIdUsuario");
        SolicitacaoOuvidoria instance = null;
        long expResult = 0L;
        long result = instance.getIdUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdUsuario method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testSetIdUsuario() {
        System.out.println("setIdUsuario");
        long idUsuario = 0L;
        SolicitacaoOuvidoria instance = null;
        instance.setIdUsuario(idUsuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaGrupoDestinatario method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testGetListaGrupoDestinatario() {
        System.out.println("getListaGrupoDestinatario");
        SolicitacaoOuvidoria instance = null;
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.getListaGrupoDestinatario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaGrupoDestinatario method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testSetListaGrupoDestinatario() {
        System.out.println("setListaGrupoDestinatario");
        ArrayList<Usuario> listaGrupoDestinatario = null;
        SolicitacaoOuvidoria instance = null;
        instance.setListaGrupoDestinatario(listaGrupoDestinatario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrupoDestinatario method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testGetGrupoDestinatario() {
        System.out.println("getGrupoDestinatario");
        SolicitacaoOuvidoria instance = null;
        String expResult = "";
        String result = instance.getGrupoDestinatario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrupoDestinatario method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testSetGrupoDestinatario() {
        System.out.println("setGrupoDestinatario");
        String grupoDestinatario = "";
        SolicitacaoOuvidoria instance = null;
        instance.setGrupoDestinatario(grupoDestinatario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaGrupoUsuarios method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testGetListaGrupoUsuarios() {
        System.out.println("getListaGrupoUsuarios");
        SolicitacaoOuvidoria instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getListaGrupoUsuarios();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaGrupoUsuarios method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testSetListaGrupoUsuarios() {
        System.out.println("setListaGrupoUsuarios");
        ArrayList<String> listaGrupoUsuarios = null;
        SolicitacaoOuvidoria instance = null;
        instance.setListaGrupoUsuarios(listaGrupoUsuarios);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        SolicitacaoOuvidoria instance = null;
        Usuario expResult = null;
        Usuario result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        Usuario user = null;
        SolicitacaoOuvidoria instance = null;
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SolicitacaoOuvidoria method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testSolicitacaoOuvidoria() {
        System.out.println("SolicitacaoOuvidoria");
        String mensagem = "";
        SolicitacaoOuvidoria instance = null;
        instance.SolicitacaoOuvidoria(mensagem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executarSolicitacao method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testExecutarSolicitacao() {
        System.out.println("executarSolicitacao");
        SolicitacaoOuvidoria instance = null;
        instance.executarSolicitacao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarInformacao method, of class SolicitacaoOuvidoria.
     */
    @Test
    public void testValidarInformacao() {
        System.out.println("validarInformacao");
        String mensagem = "";
        SolicitacaoOuvidoria instance = null;
        boolean expResult = false;
        boolean result = instance.validarInformacao(mensagem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
