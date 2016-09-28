/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moteur;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author Marine
 */
public class Dessin implements DessinAbstract {

    @Override
    public void dessiner(BufferedImage image) {
        Graphics2D g = image.createGraphics();
        g.setColor(Color.red);
        
        // Ajout du rectangle
        g.drawRect(100, 100, 300, 100);
        
        // Ajout des 4 cercles
        int rayon = 10;
        g.drawOval(100 - rayon, 100 - rayon, 2 * rayon, 2 * rayon);
        g.drawOval(400 - rayon, 100 - rayon, 2 * rayon, 2 * rayon);
        g.drawOval(100 - rayon, 200 - rayon, 2 * rayon, 2 * rayon);
        g.drawOval(400 - rayon, 200 - rayon, 2 * rayon, 2 * rayon);
    }

}
