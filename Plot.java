/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Kio
 */
public class Plot {
    
    private JFrame frame;
    private Showing panel;
    private int width;
    private int height;
    private String title = "HW6";
    
    public Plot(){
        this.width =500;
        this.height =400;
        this.frame = new JFrame(title);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.panel = new Showing();
        frame.add(panel);
        
        panel.setPreferredSize(new Dimension(width,height));
        frame.pack();
        
        
        frame.setSize(width, height);
        
        frame.pack();
        
        frame.setVisible(true);
        
    }
    
    
    public void setAxis(double[] a){
        panel.nums = a;
        panel.repaint();
    }
    
    public void setFunction(Plottable2D sourc){
        panel.sourc = sourc;
        panel.repaint();

        
    }
    
    
    public void setDisplaySize(int w, int h){
        this.width = w;
        this.height = h;
        this.frame.setSize(this.width,this.height);
        panel.repaint();
        
    }
    
    public void setTitle(String t){
        this.frame.setTitle(t);
        panel.title = t;
        panel.repaint();
    }
    
    public void setXLabel(String t){
        panel.xlab = t;
        panel.repaint();
    }
    
    public void setYLabel(String t){
        panel.ylab = t;
        panel.repaint();
    }
    
    public void setLineColor(Color a){
        panel.col = a;
        
    }
    
    
    public class Showing extends JPanel{
    
        private double[] nums = null;
        private Plottable2D sourc = null;
        private String title = null;
        private String xlab= null;
        private String ylab = null;
        private Color col = Color.red;
    
        @Override
        public void paintComponent(Graphics g){
            
        g.setColor(Color.white);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.black);
            
        g.drawLine((int)(this.getWidth()*0.1),(int)(this.getHeight()*0.9) ,(int)(this.getWidth()*0.9), (int)(this.getHeight()*0.9));
        g.drawLine((int)(this.getWidth()*0.1),(int)(this.getHeight()*0.1),(int)(this.getWidth()*0.1), (int)(this.getHeight()*0.9));
        
        g.drawString(String.valueOf(nums[0]), (int)(this.getWidth()*0.1), (int)(this.getHeight()*0.95));
        g.drawString(String.valueOf(nums[1]), (int)(this.getWidth()*0.9), (int)(this.getHeight()*0.95));
        g.drawString(String.valueOf(nums[2]), (int)(this.getWidth()*0.01), (int)(this.getHeight()*0.9));
        g.drawString(String.valueOf(nums[3]), (int)(this.getWidth()*0.01), (int)(this.getHeight()*0.1));
    
        if(title!=null)
            g.drawString(title,(int)(this.getWidth()*0.5), (int)(this.getHeight()*0.1));
        
        if(xlab!=null)
            g.drawString(xlab,(int)(this.getWidth()*0.5), (int)(this.getHeight()*0.95));
              
        g.setColor(col);                
        
        if(sourc!=null && nums!=null){
            
        double xmin = nums[0];
        double ymin = nums[2];
        double[] xs = new double[101];
        double xdist = nums[1]-nums[0];

        for(int i=0;i<101;++i){
            xs[i] = nums[0]+(xdist/100*i);
        }
        
        double[] xr = sourc.evaluate(xs);
        
        int xrange = (int) (this.getWidth()*0.8);
        int yrange = (int) (this.getHeight()*0.8);
        
        int startx, starty, endx, endy;
        

        
        
        for(int i=0; i<100 ;++i){
            
            startx = (int)((xs[i]-xs[0])*(xrange/(xs[99]-xs[0]))+(this.getWidth()*0.1));
            starty = (int)(this.getHeight()-(xr[i]-ymin)*(yrange/(nums[3]-ymin))-(this.getHeight()*0.1));             
            endx = (int)((xs[i+1]-xs[0])*(xrange/(xs[99]-xs[0]))+(this.getWidth()*0.1));
            endy = (int)(this.getHeight()-(xr[i+1]-ymin)*(yrange/(nums[3]-ymin))-(this.getHeight()*0.1));
            
            if(starty<=(this.getHeight()*0.9))
               g.drawLine(startx, starty, endx, endy);
                       
            }
        
            }
        
        }
    
        
        
        
}
    
    
    
}
