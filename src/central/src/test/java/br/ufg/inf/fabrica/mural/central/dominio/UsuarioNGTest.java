/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufg.inf.fabrica.mural.central.dominio;

import java.util.ArrayList;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Iasmim
 */
public class UsuarioNGTest {
    
    public UsuarioNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Teste de método getId, da classe Usuario.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Usuario instance = null;
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setId, da classe Usuario.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        Usuario instance = null;
        instance.setId(id);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getLogin, da classe Usuario.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Usuario instance = null;
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setLogin, da classe Usuario.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        Usuario instance = null;
        instance.setLogin(login);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getSenha, da classe Usuario.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        Usuario instance = null;
        String expResult = "";
        String result = instance.getSenha();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setSenha, da classe Usuario.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String senha = "";
        Usuario instance = null;
        instance.setSenha(senha);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método isApenasProdutor, da classe Usuario.
     */
    @Test
    public void testIsApenasProdutor() {
        System.out.println("isApenasProdutor");
        Usuario instance = null;
        boolean expResult = false;
        boolean result = instance.isApenasProdutor();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setApenasProdutor, da classe Usuario.
     */
    @Test
    public void testSetApenasProdutor() {
        System.out.println("setApenasProdutor");
        boolean apenasProdutor = false;
        Usuario instance = null;
        instance.setApenasProdutor(apenasProdutor);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método isAdministrador, da classe Usuario.
     */
    @Test
    public void testIsAdministrador() {
        System.out.println("isAdministrador");
        Usuario instance = null;
        boolean expResult = false;
        boolean result = instance.isAdministrador();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setAdministrador, da classe Usuario.
     */
    @Test
    public void testSetAdministrador() {
        System.out.println("setAdministrador");
        boolean administrador = false;
        Usuario instance = null;
        instance.setAdministrador(administrador);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método obterUsuariosGrupo, da classe Usuario.
     */
    @Test
    public void testObterUsuariosGrupo() {
        System.out.println("obterUsuariosGrupo");
        String grupoDestinatario = "";
        Usuario instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.obterUsuariosGrupo(grupoDestinatario);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }
    
}
