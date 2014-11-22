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
public class PapelDeUsuarioTest {
    
    public PapelDeUsuarioTest() {
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
     * Test of getId method, of class PapelDeUsuario.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        PapelDeUsuario instance = null;
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class PapelDeUsuario.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        PapelDeUsuario instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class PapelDeUsuario.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        PapelDeUsuario instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class PapelDeUsuario.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        PapelDeUsuario instance = null;
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterGrupos method, of class PapelDeUsuario.
     */
    @Test
    public void testObterGrupos() {
        System.out.println("obterGrupos");
        PapelDeUsuario instance = null;
        instance.obterGrupos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of papelDeUsuario method, of class PapelDeUsuario.
     */
    @Test
    public void testPapelDeUsuario() {
        System.out.println("papelDeUsuario");
        Usuario usuario = null;
        PapelDeUsuario instance = null;
        String expResult = "";
        String result = instance.papelDeUsuario(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterPapeisUsuario method, of class PapelDeUsuario.
     */
    @Test
    public void testObterPapeisUsuario() {
        System.out.println("obterPapeisUsuario");
        PapelDeUsuario instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.obterPapeisUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
