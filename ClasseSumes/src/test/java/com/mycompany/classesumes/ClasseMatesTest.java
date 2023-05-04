package com.mycompany.classesumes;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danilopez
 */
public class ClasseMatesTest {

    private final ClasseMates operaciones = new ClasseMates();
    
    //Test per veure la funció del metòde factorial
    @Test
    public void testFactorial() {
        assertEquals(1, operaciones.factorial(0));
        assertEquals(1, operaciones.factorial(1));
        assertEquals(120, operaciones.factorial(5));
        assertEquals(3628800, operaciones.factorial(10));
        
    }
    
    //Test per veure la funció del metòde sumaFibonacci
    @Test
    public void testSumaFibonacci() {
        assertEquals(0, operaciones.sumaFibonacci(0));
        assertEquals(1, operaciones.sumaFibonacci(1));
        assertEquals(12, operaciones.sumaFibonacci(5));
        assertEquals(54, operaciones.sumaFibonacci(8));
    }
    
    //Test per veure la funció del metòde dividir, deuria donar 2
    @Test
    public void testDivision() {
        assertEquals(5, operaciones.division(10, 2));
    }

}
