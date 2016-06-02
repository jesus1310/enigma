import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class EnigmaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EnigmaTest
{
    /**
     * Default constructor for test class EnigmaTest
     */
    public EnigmaTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testCommit01Bayon()
    {
        Enigma enigma = new Enigma();
        Mecanismo mecanismo01 = new MecanismoMultiplicacionPrimo(7);
        
        assertEquals(35084, enigma.encripta(mecanismo01, 5012));
        assertEquals(63000, enigma.encripta(mecanismo01, 9000));
        assertEquals(-1,    enigma.encripta(mecanismo01, 10));        
        assertEquals(5012,  enigma.desencripta(mecanismo01, 35084));        
        assertEquals(9000,  enigma.desencripta(mecanismo01, 63000));              
        assertEquals(-1,  enigma.desencripta(mecanismo01, 70)); 
    }
}
