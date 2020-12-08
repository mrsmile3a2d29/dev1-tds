/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g56935.dev1.calendrier;

import java.util.Scanner;

/**
 *
 * @author g56935
 */
public class calendrier {
/**
 * Méthode principale du projet
 * @param args 
 */
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez le numéro du mois : ");
        int mois = clavier.nextInt();
        if (mois < 1 || mois > 12) {
            throw new IllegalArgumentException("Le mois doit être compris entre 1 et 12 !");
        }
        System.out.print("Entrez l'année : ");
        int annee = clavier.nextInt();
        afficherTitre(mois, annee);
        afficherEnTete();
        int nbJours = nombreJours(mois, annee);
        int decalage = numeroJour(1, mois, annee);
        afficherMois(decalage, nbJours);
    }
/**
 * Méthode qui retourne le numéro du jour en fonction du mois et de l'année
 * @param jour est le jour entré
 * @param mois est le mois entré
 * @param annee est l'année entrée
 * @return un entier qui correspond au jour J
 */
    public static int numeroJour(int jour, int mois, int annee) {
        if(mois<1 || mois>12) {
            throw new IllegalArgumentException("Le mois doit être compris entre 1 et 12 !");
        }
        if(jour<1 || jour>nombreJours(mois, annee)) {
            throw new IllegalArgumentException("Le jour doit être compris entre 1 et "+nombreJours(mois, annee)+" !");
        }
        int anneeCorrigee = annee;
        int m = mois;
        int q = jour;
        if (mois == 1 || mois == 2) {
            anneeCorrigee = annee - 1;
            m = mois + 12;
        }
        int j = anneeCorrigee / 100;
        int k = anneeCorrigee % 100;
        return (q + ((m + 1) * 13) / 5 + k + (k / 4) + (j / 4) + j * 5 + 5) % 7;
    }
/**
 * Méthode qui retourne le nombre de jours compris dans un certain mois d'une certaine année
 * @param mois est le mois entré (entre 1 et 12)
 * @param annee est l'année entrée
 * @return un entier comprennant le nombre de jours du mois
 */
    public static int nombreJours(int mois, int annee) {
        if (mois < 1 || mois > 12) {
            throw new IllegalArgumentException("Le mois doit être compris entre 1 et 12 !");
        }
        int nbJours = 31;
        if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
            nbJours = 30;
        } else if (mois == 2) {
            if (estBissextile(annee)) {
                nbJours = 29;
            } else {
                nbJours = 28;
            }
        }
        return nbJours;
    }
/**
 * Méthode qui retourne si une année est bissextile ou non
 * @param annee est l'année entrée en paramètre
 * @return un boolean VRAI si bissextile et FALSE si non bissextile
 */
    public static boolean estBissextile(int annee) {
        return (((annee % 4) == 0) && ((annee % 100 != 0) || (annee % 400 == 0)));
    }
/**
 * Méthode qui affiche les numéros de jours du mois en fonction du décalage et du nombre de jours
 * @param decalage est le "blanc" qui se trouvera au début du mois
 * @param nombreJours représente le nombre de jours contenus dans le mois
 */
    public static void afficherMois(int decalage, int nombreJours) {
        if (decalage < 0 || decalage > 6) {
            throw new IllegalArgumentException("Le décalage doit être compris entre 0 et 6 !");
        }
        if (nombreJours < 1 || nombreJours > 31) {
            throw new IllegalArgumentException("Le nombre de jours doit être compris entre 1 et 31 !");
        }
        for (int i = 0; i < decalage; i++) {
            System.out.print("    ");
        }
        for (int j = 1; j <= nombreJours; j++) {
            if (j < 10) {
                System.out.print("0" + j + "  ");
            } else {
                System.out.print(j + "  ");
            }
            if ((j + decalage) % 7 == 0) {
                System.out.println("");
            }
        }
        System.out.println("");
    }
/**
 * Méthode qui affiche l'en-tête du calendrier
 */
    public static void afficherEnTete() {
        System.out.println("Lu  Ma  Me  Je  Ve  Sa  Di");
    }
/**
 * Méthode qui affiche le titre du calendrier
 * @param mois le mois choisi
 * @param annee l'année choisie
 */
    public static void afficherTitre(int mois, int annee) {
        if (mois < 1 || mois > 12) {
            throw new IllegalArgumentException("Le mois doit être compris entre 1 et 12 !");
        }
        System.out.println("   ====================");
        System.out.println("        " + nomMois(mois) + " " + annee);
        System.out.println("   ====================");
    }
/**
 * Méthode qui retourne le nom du mois en fonction du nombre que l'utilisateur a entré
 * @param mois le nombre entre 1 et 12 que l'utilisateur entre
 * @return (String) le nom du mois
 */
    public static String nomMois(int mois) {
        if (mois < 1 || mois > 12) {
            throw new IllegalArgumentException("Le mois doit être compris entre 1 et 12 !");
        }
        String rep;
        switch (mois) {
            case 1:
                rep = "Janvier";
                break;
            case 2:
                rep = "Février";
                break;
            case 3:
                rep = "Mars";
                break;
            case 4:
                rep = "Avril";
                break;
            case 5:
                rep = "Mai";
                break;
            case 6:
                rep = "Juin";
                break;
            case 7:
                rep = "Juillet";
                break;
            case 8:
                rep = "Aout";
                break;
            case 9:
                rep = "Septembre";
                break;
            case 10:
                rep = "Octobre";
                break;
            case 11:
                rep = "Novembre";
                break;
            case 12:
                rep = "Décembre";
                break;
            default:
                rep = "Erreur !";
                break;
        }
        return rep;
    }
}
