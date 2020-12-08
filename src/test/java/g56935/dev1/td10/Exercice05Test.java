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
public class Exercice05Test {

    public Exercice05Test() {
    }

    /**
     * Test of nbOccurences method, of class Exercice05.
     */
    @Test
    public void testNbOccurencesLettrePresenteUneFois() {
        System.out.println("nbOccurences");
        char lettre = 'a';
        String texte = "cheval";
        int expResult = 1;
        int result = Exercice05.nbOccurences(lettre, texte);
        assertEquals(expResult, result);
    }

    @Test
    public void testNbOccurencesLettrePresentePlusDuneFois() {
        System.out.println("nbOccurences");
        char lettre = 't';
        String texte = "trottinette";
        int expResult = 5;
        int result = Exercice05.nbOccurences(lettre, texte);
        assertEquals(expResult, result);
    }

    @Test
    public void testNbOccurencesLettreAbsente() {
        System.out.println("nbOccurences");
        char lettre = 'y';
        String texte = "hexagonal";
        int expResult = 0;
        int result = Exercice05.nbOccurences(lettre, texte);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testNbOccurencesLettrePresenteAvecMajusculesDansTexte() {
        System.out.println("nbOccurences");
        char lettre = 'f';
        String texte = "ChiFfrE";
        int expResult = 2;
        int result = Exercice05.nbOccurences(lettre, texte);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testNbOccurencesLettrePresenteAvecLettreEnMajuscule() {
        System.out.println("nbOccurences");
        char lettre = 'T';
        String texte = "trottiner";
        int expResult = 3;
        int result = Exercice05.nbOccurences(lettre, texte);
        assertEquals(expResult, result);
    }

}
