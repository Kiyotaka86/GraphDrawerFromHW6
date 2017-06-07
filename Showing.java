/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import javafx.scene.input.MouseButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Kio
 */

public class Showing extends JPanel{
    
    private double[] nums = null;
    private Plottable2D sourc = null;
    private Color col = Color.red;
    private String title = "HW6";

    
        @Override
        public void paintComponent(Graphics g){
            
        g.setColor(Color.white);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.black);
            
//        g.drawLine((int)(this.getWidth()*0.1),(int)(this.getHeight()*0.9) ,(int)(this.getWidth()*0.9), (int)(this.getHeight()*0.9));
//        g.drawLine((int)(this.getWidth()*0.1),(int)(this.getHeight()*0.1),(int)(this.getWidth()*0.1), (int)(this.getHeight()*0.9));
//        
//        g.drawString(String.valueOf(nums[0]), (int)(this.getWidth()*0.1), (int)(this.getHeight()*0.95));
//        g.drawString(String.valueOf(nums[1]), (int)(this.getWidth()*0.9), (int)(this.getHeight()*0.95));
//        g.drawString(String.valueOf(nums[2]), (int)(this.getWidth()*0.01), (int)(this.getHeight()*0.9));
//        g.drawString(String.valueOf(nums[3]), (int)(this.getWidth()*0.01), (int)(this.getHeight()*0.1));
//    
        g.setColor(col);                
        
        if(sourc!=null && nums!=null){
            
        double xmin = nums[0];
        double ymin = nums[2];
        double ymax = nums[3];
        double[] xs = new double[101];
        double xdist = nums[1]-nums[0];

        for(int i=0;i<101;++i){
            xs[i] = nums[0]+(xdist/100*i);
        }
        
        double[] xr = sourc.evaluate(xs);
        
        int xrange = (int) (this.getWidth());
        int yrange = (int) (this.getHeight());
        
        int startx, starty, endx, endy;
        

        
        
        for(int i=0; i<100 ;++i){
            
            startx = (int)((xs[i]-xs[0])*(xrange/(xs[99]-xs[0])));
            starty = (int)(this.getHeight()-(xr[i]-ymin)*(yrange/(ymax-ymin)));             
            endx = (int)((xs[i+1]-xs[0])*(xrange/(xs[99]-xs[0])));
            endy = (int)(this.getHeight()-(xr[i+1]-ymin)*(yrange/(ymax-ymin)));
            
               g.drawLine(startx, starty, endx, endy);
                       
            }
        
            }
        
        }
    
    public void setAxis(double[] a){
        this.nums = a;
        this.repaint();
    }
    
    public void setFunction(String a){
        sourc.setFunction(a);
        this.repaint();        
    }
    
    
    public void setDisplaySize(int w, int h){
        this.setDisplaySize(w, h);
        this.repaint();
        
    }
    
    
    public void setLineColor(Color a){
        this.col = a;
        this.repaint();
    }
    
    public void go(){        
        Plottable2D myFun = new MyFunction();
        this.sourc = myFun;
        this.setFunction("sin(x)"); 
        this.setAxis(new double[]{-10, 10, -10, 10}); // axis limits specified {xmin, xmax, ymin, ymax}
  


    }  
    
    public double[] getAxisrange(){
        return nums;
    }
    
    public double getxStart(){
        return nums [0];
        
    }
    
    public void setxStart(double a){
        nums[0] = a;
        this.repaint();
    }
    
    public double getxEnd(){
        return nums [1];
        
    }
    
    public void setxEnd(double a){
        nums[1] = a;
        this.repaint();
    }

    public double getyStart(){
        return nums [2];
        
    }
    
    public void setyStart(double a){
        nums[3] = a;
        this.repaint();
    }
    
    public double getyEnd(){
        return nums [3];
        
    }
    
    public void setyEnd(double a){
        nums[3] = a;
        this.repaint();
    }
    
    public String getFuncName(){
        return sourc.getFuncName();
    }
    
    
    public String getTitle(){
        return title;
        
    }
    

}