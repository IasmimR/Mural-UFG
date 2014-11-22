/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufg.inf.fabrica.muralufg;

import static org.testng.Assert.*;

/**
 *
 * @author Iasmim
 */
public class ExecutaDivulgacaoNGTest {
    
    public ExecutaDivulgacaoNGTest() {
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
     * Teste de método executarDivulgacao, da classe ExecutaDivulgacao.
     */
    @org.testng.annotations.Test
    public void testExecutarDivulgacao() {
        System.out.println("executarDivulgacao");
        int idMensagem = 0;
        ExecutaDivulgacao instance = new ExecutaDivulgacao();
        instance.executarDivulgacao(idMensagem);
        // TODO verifica o código de teste gerado e remove a chamada default para falha.
        fail("O caso de teste \u00e9 um prot\u00f3tipo.");
    }
    
}
