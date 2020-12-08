/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g56935.dev1.td10;

/**
 *
 * @author mrsmile
 */
public class Exercice05 {
    public static void main(String[] args) {
        System.out.println("Tests : ");
        System.out.println(nbOccurences('a', "cheval") + " = 1");
        System.out.println(nbOccurences('t', "trottinette") + " = 5");
        System.out.println(nbOccurences('y', "hexagonal") + " = 0");
        System.out.println(nbOccurences('f', "cHifFre") + " = 2");
        System.out.println(nbOccurences('T', "trottiner") + " = 3");
    }
    
    public static int nbOccurences(char lettre, String texte) {
        String texteMin = texte.toLowerCase();
        char lettreMin = Character.toLowerCase(lettre);
        int nbOccurences = 0;
        
        for (int i = 0; i < texteMin.length(); i++) {
            if(texteMin.charAt(i) == lettreMin) {
                nbOccurences++;
            }
        }
        return nbOccurences;
    }
}
