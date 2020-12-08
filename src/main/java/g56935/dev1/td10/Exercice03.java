/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g56935.dev1.td10;
/**
 *
 * @author 56935
 */
public class Exercice03 {

    public static void main(String[] args) {
        System.out.println("Tests : ");
        System.out.println(estAnagramme("guerison", "soigneur") + " = true");
        System.out.println(estAnagramme("engager", "grenage") + " = true");
        System.out.println(estAnagramme("piRatE", "PaTriE") + " = true");
        System.out.println(estAnagramme("taxi", "pros") + " = false");
        System.out.println(estAnagramme("peur", "pire") + " = false");
        System.out.println(estAnagramme("caramel", "coco") + " = false");
    }

    public static boolean estAnagramme(String mot, String candidat) {
        if (mot.length() != candidat.length()) {
            return false;
        }
        String motMinuscule = mot.toLowerCase();
        String candidatMinuscule = candidat.toLowerCase();
        int tailleMots = motMinuscule.length();
        boolean[] checkChars = new boolean[tailleMots];
        for (int i = 0; i < checkChars.length; i++) {
            checkChars[i] = false;
        }
        boolean charFound;
        int cpt;
        for (int i = 0; i < tailleMots; i++) {
            charFound = false;
            cpt = 0;
            while (cpt < tailleMots && !charFound) {
                if ((motMinuscule.charAt(i) == candidatMinuscule.charAt(cpt)) && !checkChars[cpt]) {
                    checkChars[cpt] = true;
                    charFound = true;
                }
                cpt++;
            }
        }
        boolean result = true;
        for (int i = 0; i < checkChars.length; i++) {
            if (!checkChars[i]) {
                result = false;
            }
        }
        return result;
    }
}
