/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g56935.dev1.td10;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mrsmile
 */
public class Exercice04Test {
    
    public Exercice04Test() {
    }
    /**
     * Test of estPalindrome method, of class Exercice04.
     */
    @Test
    public void testEstPalindromeSiPalindromeTaillePaire() {
        System.out.println("estPalindrome");
        String mot = "erre";
        boolean expResult = true;
        boolean result = Exercice04.estPalindrome(mot);
        assertEquals(expResult, result);
    }
    @Test
    public void testEstPalindromeSiPalindromeTailleImpaire() {
        System.out.println("estPalindrome");
        String mot = "kayak";
        boolean expResult = true;
        boolean result = Exercice04.estPalindrome(mot);
        assertEquals(expResult, result);
    }
    @Test
    public void testEstPalindromeSiPalindromeAvecMajuscules() {
        System.out.println("estPalindrome");
        String mot = "kAYaK";
        boolean expResult = true;
        boolean result = Exercice04.estPalindrome(mot);
        assertEquals(expResult, result);
    }
    @Test
    public void testEstPalindromeSiPasPalindromeTaillePaire() {
        System.out.println("estPalindrome");
        String mot = "banane";
        boolean expResult = false;
        boolean result = Exercice04.estPalindrome(mot);
        assertEquals(expResult, result);
    }
    @Test
    public void testEstPalindromeSiPasPalindromeTailleImpaire() {
        System.out.println("estPalindrome");
        String mot = "carotte";
        boolean expResult = false;
        boolean result = Exercice04.estPalindrome(mot);
        assertEquals(expResult, result);
    }
    
}
