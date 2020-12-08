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
public class Exercice04 {
    public static void main(String[] args) {
        System.out.println("Tests : ");
        System.out.println(estPalindrome("erre") + " = true");
        System.out.println(estPalindrome("kayak") + " = true");
        System.out.println(estPalindrome("kAYaK") + " = true");
        System.out.println(estPalindrome("banane") + " = false");
        System.out.println(estPalindrome("carotte") + " = false");
    }
    
    public static boolean estPalindrome(String mot) {
        boolean result = true;
        String motMin = mot.toLowerCase();
        int tailleMot = mot.length();
        int milieuMot;
        if (tailleMot%2==0) {
            milieuMot = tailleMot/2;
        } else {
            milieuMot = (tailleMot/2)+1;
        }
        for (int i = 0; i < milieuMot; i++) {
            if(motMin.charAt(i) != motMin.charAt(tailleMot-1-i)) {
                result = false;
            }
        }
        return result;
    }
}
