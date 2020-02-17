import junit.framework.*;	// JUnit import java.util.*;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;

// Clase con casos de prueba para Criba

public class CribaTest extends TestCase
{

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
// Programa principal (usa un componente de JUnit)




// Constructor


 
// Casos de prueba

public void testPrimos()
{
int[] nullArray = Criba.generarPrimos(0); assertEquals(nullArray.length, 0);

int[] minArray = Criba.generarPrimos(2); assertEquals(minArray.length, 1);
assertEquals(minArray[0], 2);

int[] threeArray = Criba.generarPrimos(3); assertEquals(threeArray.length, 2);
assertEquals(threeArray[0], 2);
assertEquals(threeArray[1], 3);

int[] centArray = Criba.generarPrimos(100); assertEquals(centArray.length, 25);
assertEquals(centArray[24], 97);
}

    /**
     * Test of generarPrimos method, of class Criba.
     */
    @org.junit.Test
    public void testGenerarPrimos() {
        System.out.println("generarPrimos");
        int max = 0;
        int[] expResult = null;
        int[] result = Criba.generarPrimos(max);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
