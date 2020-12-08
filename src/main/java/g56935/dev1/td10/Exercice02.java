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
public class Exercice02 {

    public static void main(String[] args) {
        System.out.println("Tests : ");
        System.out.println(somme(4)+" = 10");
        System.out.println(somme(1)+" = 1");
        System.out.println(somme(0)+" = 1");
        System.out.println(somme(-3)+" = -5");
    }

    public static int somme(int n) {
        int result = 0;
        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                result += i;
            }
        } else {
            for (int i = 1; i >= n; i--) {
                result += i;
            }
        }
        return result;
    }
}
