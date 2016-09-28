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
public class Dessin implements DessinAbstract{

    @Override
    public void dessiner(BufferedImage image) {
    Graphics2D g=image.createGraphics();
    g.setColor(Color.red);
    g.drawRect(100,100,300,100);
        int t=10;
    g.drawOval(100-t,100-t, 2*t, 2*t);
        }
    
    
}
