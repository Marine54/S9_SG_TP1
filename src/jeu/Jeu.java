/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu;

import moteur.MoteurGraphique;

/**
 *
 * @author Marine
 */
public class Jeu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MoteurGraphique moteur = new MoteurGraphique(new moteur.Jeu(), new moteur.Dessin());
        moteur.lancerJeu(500, 500, 30);
    }
    
}
