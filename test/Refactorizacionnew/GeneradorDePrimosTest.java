/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Refactorizacionnew;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LENOVO
 */
public class GeneradorDePrimosTest {
    
    public GeneradorDePrimosTest() {
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
     * Test of generarPrimos method, of class GeneradorDePrimos.
     */
    @Test
    public void testGenerarPrimos() {
        System.out.println("generarPrimos");
        int max = 0;
        int[] expResult = null;
        int[] result = GeneradorDePrimos.generarPrimos(max);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
 

private static boolean esPrimo[]; private static int primos[];

public static int[] generarPrimos (int max)
{
if (max < 2) {  return new int[0];
} else {
inicializarCandidatos(max); eliminarMultiplos(); obtenerCandidatosNoEliminados(); return primos;
}
}

private static void inicializarCandidatos (int max)
{
int i;
esPrimo = new boolean[max+1];
esPrimo[0] = esPrimo[1] = false; for (i=2; i<esPrimo.length; i++)
esPrimo[i] = true;
}

private static void eliminarMultiplos (){}
// Código del antiguo método cribar()
private static void obtenerCandidatosNoEliminados (){}

}

