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
public class Exercice03Test {
    
    public Exercice03Test() {
    }

    /**
     * Test of estAnagramme method, of class Exercice03.
     */

    @Test
    public void testEstAnagrammeSiAnagrammeSansRepetitionDeLettres() {
        System.out.println("estAnagramme");
        String mot = "guerison";
        String candidat = "soigneur";
        boolean expResult = true;
        boolean result = Exercice03.estAnagramme(mot, candidat);
        assertEquals(expResult, result);
    }
    
    public void testEstAnagrammeSiAnagrammeAvecRepetitionDeLettres() {
        System.out.println("estAnagramme");
        String mot = "engager";
        String candidat = "grenage";
        boolean expResult = true;
        boolean result = Exercice03.estAnagramme(mot, candidat);
        assertEquals(expResult, result);
    }
    
    public void testEstAnagrammeSiAnagrammeAvecMajuscules() {
        System.out.println("estAnagramme");
        String mot = "piRatE";
        String candidat = "PaTriE";
        boolean expResult = true;
        boolean result = Exercice03.estAnagramme(mot, candidat);
        assertEquals(expResult, result);
    }
    
    public void testEstAnagrammeSiPasAnagrammeSansRepetitionDeLettresSansLettresEnCommun() {
        System.out.println("estAnagramme");
        String mot = "taxi";
        String candidat = "pros";
        boolean expResult = false;
        boolean result = Exercice03.estAnagramme(mot, candidat);
        assertEquals(expResult, result);
    }
    
    public void testEstAnagrammeSiPasAnagrammeSansRepetitionDeLettresAvecLettresEnCommun() {
        System.out.println("estAnagramme");
        String mot = "peur";
        String candidat = "pire";
        boolean expResult = false;
        boolean result = Exercice03.estAnagramme(mot, candidat);
        assertEquals(expResult, result);
    }
    
    public void testEstAnagrammeSiMotsDeDifferentesTailles() {
        System.out.println("estAnagramme");
        String mot = "caramel";
        String candidat = "coco";
        boolean expResult = false;
        boolean result = Exercice03.estAnagramme(mot, candidat);
        assertEquals(expResult, result);
    }
    
}
