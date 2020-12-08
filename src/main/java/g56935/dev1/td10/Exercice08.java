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
public class Exercice08 {

    public static void main(String[] args) {
        System.out.println(pgcd(20, 30) + " = 10");
        System.out.println(pgcd(30, 20) + " = 10");
        System.out.println(pgcd(64, 64) + " = 64");
        System.out.println(pgcd(1, 1) + " = 1");
        System.out.println(pgcd(0, 25) + " = 0");
        System.out.println(pgcd(12, 0) + " = 0");
        System.out.println(pgcd(0, 0) + " = 0");
        System.out.println(pgcd(-50, 25) + " = 25");
        System.out.println(pgcd(6, -12) + " = 6");
        System.out.println(pgcd(-5, -30) + " = 5");
    }

    public static int pgcd(int a, int b) {
        if(a==0 || b==0) {
            throw new IllegalArgumentException();
        }
        int max;
        double quotient1, quotient2;
        int result = 0;
        if (valAbs(a) > valAbs(b)) {
            max = valAbs(b);
        } else {
            max = valAbs(a);
        }
        for (int i = 1; i <= max; i++) {
            quotient1 = (double) a / i;
            quotient2 = (double) b / i;
            if ((quotient1 == a / i) && (quotient2 == b / i)) {
                result = i;
            }
        }
        return result;
    }

    public static int valAbs(int x) {
        if (x < 0) {
            x = -x;
        }
        return x;
    }
}
