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
public class Exercice02Test {
    
    public Exercice02Test() {
    }
    /**
     * Test of somme method, of class Exercice02.
     */
    @Test
    public void testSommeSiNPlusGrandQue1() {
        System.out.println("somme");
        int n = 4;
        int expResult = 10;
        int result = Exercice02.somme(n);
        assertEquals(expResult, result);
    }
    
    public void testSommeSiNEgal1() {
        System.out.println("somme");
        int n = 1;
        int expResult = 1;
        int result = Exercice02.somme(n);
        assertEquals(expResult, result);
    }
    
    public void testSommeSiNEgale0() {
        System.out.println("somme");
        int n = 0;
        int expResult = 1;
        int result = Exercice02.somme(n);
        assertEquals(expResult, result);
    }
    
    public void testSommeSiNEstNegatif() {
        System.out.println("somme");
        int n = -3;
        int expResult = -5;
        int result = Exercice02.somme(n);
        assertEquals(expResult, result);
    }
    
}
