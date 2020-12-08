/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g56935.dev1.td10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mrsmile
 */
public class Exercice01Test {
    
    public Exercice01Test() {
    }
    /**
     * Test of max method, of class Exercice01.
     */
    @org.junit.jupiter.api.Test
    public void testMaxSiAPlusGrandQueB() {
        System.out.println("max");
        int a = 4;
        int b = 2;
        int expResult = 4;
        int result = Exercice01.max(a, b);
        assertEquals(expResult, result);
    }
    
    public void testMaxSiAPlusPetitQueB() {
        System.out.println("max");
        int a = 1;
        int b = 6;
        int expResult = 6;
        int result = Exercice01.max(a, b);
        assertEquals(expResult, result);
    }
    
    public void testMaxSiAEgalB() {
        System.out.println("max");
        int a = 3;
        int b = 3;
        int expResult = 3;
        int result = Exercice01.max(a, b);
        assertEquals(expResult, result);
    }
    
}
