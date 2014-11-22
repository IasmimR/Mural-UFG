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
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of getId method, of class Usuario.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Usuario instance = null;
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Usuario.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        Usuario instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogin method, of class Usuario.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Usuario instance = null;
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogin method, of class Usuario.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        Usuario instance = null;
        instance.setLogin(login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSenha method, of class Usuario.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        Usuario instance = null;
        String expResult = "";
        String result = instance.getSenha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSenha method, of class Usuario.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String senha = "";
        Usuario instance = null;
        instance.setSenha(senha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isApenasProdutor method, of class Usuario.
     */
    @Test
    public void testIsApenasProdutor() {
        System.out.println("isApenasProdutor");
        Usuario instance = null;
        boolean expResult = false;
        boolean result = instance.isApenasProdutor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApenasProdutor method, of class Usuario.
     */
    @Test
    public void testSetApenasProdutor() {
        System.out.println("setApenasProdutor");
        boolean apenasProdutor = false;
        Usuario instance = null;
        instance.setApenasProdutor(apenasProdutor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAdministrador method, of class Usuario.
     */
    @Test
    public void testIsAdministrador() {
        System.out.println("isAdministrador");
        Usuario instance = null;
        boolean expResult = false;
        boolean result = instance.isAdministrador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdministrador method, of class Usuario.
     */
    @Test
    public void testSetAdministrador() {
        System.out.println("setAdministrador");
        boolean administrador = false;
        Usuario instance = null;
        instance.setAdministrador(administrador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obterUsuariosGrupo method, of class Usuario.
     */
    @Test
    public void testObterUsuariosGrupo() {
        System.out.println("obterUsuariosGrupo");
        String grupoDestinatario = "";
        Usuario instance = null;
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.obterUsuariosGrupo(grupoDestinatario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
