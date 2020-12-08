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
public class Exercice01 {
    public static void main(String[] args) {
        System.out.println("Tests : ");
        System.out.println(max(4, 2)+" = 4");
        System.out.println(max(3, 6)+" = 6");
        System.out.println(max(3, 3)+" = 3");
    }
    public static int max(int a, int b) {
        int result;
        if(a>b){
            result = a;
        } else {
            result = b;
        }
        return result;
    }
}
