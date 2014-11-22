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
public class PapelDeUsuarioNGTest {
    
    public PapelDeUsuarioNGTest() {
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
     * Teste de método getId, da classe PapelDeUsuario.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        PapelDeUsuario instance = null;
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setId, da classe PapelDeUsuario.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        PapelDeUsuario instance = null;
        instance.setId(id);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método getNome, da classe PapelDeUsuario.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        PapelDeUsuario instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método setNome, da classe PapelDeUsuario.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        PapelDeUsuario instance = null;
        instance.setNome(nome);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método obterGrupos, da classe PapelDeUsuario.
     */
    @Test
    public void testObterGrupos() {
        System.out.println("obterGrupos");
        PapelDeUsuario instance = null;
        instance.obterGrupos();
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método papelDeUsuario, da classe PapelDeUsuario.
     */
    @Test
    public void testPapelDeUsuario() {
        System.out.println("papelDeUsuario");
        Usuario usuario = null;
        PapelDeUsuario instance = null;
        String expResult = "";
        String result = instance.papelDeUsuario(usuario);
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }

    /**
     * Teste de método obterPapeisUsuario, da classe PapelDeUsuario.
     */
    @Test
    public void testObterPapeisUsuario() {
        System.out.println("obterPapeisUsuario");
        PapelDeUsuario instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.obterPapeisUsuario();
        assertEquals(result, expResult);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }
    
}
