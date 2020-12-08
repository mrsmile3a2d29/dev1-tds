/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g56935.dev1.td10;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mrsmile
 */
public class Exercice08Test {

    public Exercice08Test() {
    }

    /**
     * Test of pgcd method, of class Exercice08.
     */
    @Test
    public void testPgcdAPlusPetitQueB() {
        System.out.println("pgcd");
        int a = 20;
        int b = 30;
        int expResult = 10;
        int result = Exercice08.pgcd(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testPgcdAPlusGrandQueB() {
        System.out.println("pgcd");
        int a = 40;
        int b = 20;
        int expResult = 20;
        int result = Exercice08.pgcd(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testPgcdAEgalB() {
        System.out.println("pgcd");
        int a = 64;
        int b = 64;
        int expResult = 64;
        int result = Exercice08.pgcd(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testPgcdAEtBEgalUn() {
        System.out.println("pgcd");
        int a = 1;
        int b = 1;
        int expResult = 1;
        int result = Exercice08.pgcd(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testPgcdAZero() {
        System.out.println("pgcd");
        int a = 0;
        int b = 25;
        assertThrows(IllegalArgumentException.class, () -> { Exercice08.pgcd(a, b); } );
    }

    @Test
    public void testPgcdBZero() {
        System.out.println("pgcd");
        int a = 12;
        int b = 0;
        assertThrows(IllegalArgumentException.class, () -> { Exercice08.pgcd(a, b); } );
    }

    @Test
    public void testPgcdAEtBZero() {
        System.out.println("pgcd");
        int a = 0;
        int b = 0;
        assertThrows(IllegalArgumentException.class, () -> { Exercice08.pgcd(a, b); } );
    }

    @Test
    public void testPgcdANegatif() {
        System.out.println("pgcd");
        int a = -50;
        int b = 25;
        int expResult = 25;
        int result = Exercice08.pgcd(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testPgcdBNegatif() {
        System.out.println("pgcd");
        int a = 6;
        int b = -12;
        int expResult = 6;
        int result = Exercice08.pgcd(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testPgcdAEtBNegatifsAPlusGrandQueB() {
        System.out.println("pgcd");
        int a = -5;
        int b = -30;
        int expResult = 5;
        int result = Exercice08.pgcd(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testPgcdAEtBNegatifsAPlusPetitQueB() {
        System.out.println("pgcd");
        int a = -8;
        int b = -4;
        int expResult = 4;
        int result = Exercice08.pgcd(a, b);
        assertEquals(expResult, result);
    }

}
