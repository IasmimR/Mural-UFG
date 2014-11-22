/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufg.inf.fabrica.muralufg;

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
public class ExecutaDivulgacaoIT {
    
    public ExecutaDivulgacaoIT() {
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
     * Test of executarDivulgacao method, of class ExecutaDivulgacao.
     */
    @Test
    public void testExecutarDivulgacao() {
        System.out.println("executarDivulgacao");
        int idMensagem = 0;
        ExecutaDivulgacao instance = new ExecutaDivulgacao();
        instance.executarDivulgacao(idMensagem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
