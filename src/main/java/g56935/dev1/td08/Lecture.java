/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g56935.dev1.td08;

import java.util.Scanner;

/**
 *
 * @author g56935
 */
public class Lecture {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int entier = lireEntier("Entrez votre annee de naissance : ");
        System.out.println("Vous avez "+(2020-entier)+" ans !");
        double virgule = lireDouble("Entrez le montant (en virgules) : ");
        System.out.println("Avec la TVA (21%) celà coute : "+(virgule+virgule*0.21));
        int entier2 = lireEntier("Veuillez entrer un entier compris entre 0 et 100 : ", 0, 100);
        System.out.println(entier2+" est compris entre 0 et 100 ! Bravo");
    }
    
    public static int lireEntier(String message, int min, int max) {
        Scanner clavier = new Scanner(System.in);
        int entier = lireEntier(message);
        while(entier<min || entier>max) {
            System.out.println(entier+" n'est pas compris entre "+min+" et "+max+" !");
            entier = lireEntier(message);
        }
        return entier;
    }
    
    public static double lireDouble(String message) {
        Scanner clavier = new Scanner(System.in);
        System.out.print(message);
        while(!clavier.hasNextDouble()) {
            clavier.next();
            System.out.println("Ce n'est pas un double !");
            System.out.print(message);
        }
        return clavier.nextDouble();
    }
    
    public static int lireEntier(String message) {
        Scanner clavier = new Scanner(System.in);
        System.out.print(message);
        while(!clavier.hasNextInt()) {
            String r = clavier.next();
            System.out.println("Ce n'est pas un entier !");
            System.out.print(message);
        }
        return clavier.nextInt();
    }
}

