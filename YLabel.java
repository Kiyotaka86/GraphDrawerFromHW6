/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import javax.swing.JLabel;

/**
 *
 * @author Kio
 */
public class YLabel extends JLabel {
    private String name = "ylabel";
    
    
    @Override
    public void setText(String a){
       name = a;
       
    }
    
    @Override
    public String getText(){
        return name;
    }
    
   
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

	AffineTransform aT = g2.getTransform();
	double x = getWidth()/2.0;
	double y = getHeight()/2.0;
	aT.rotate(Math.toRadians(270), x, y);
	g2.setTransform(aT);

	super.paintComponent(g);
	
    }
    
    
}
