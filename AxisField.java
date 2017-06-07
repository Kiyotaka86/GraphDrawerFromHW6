/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;

import javax.swing.JTextField;

/**
 *
 * @author Kio
 */
public class AxisField extends JTextField{
    
    public void setText(double a){
        String vals = String.valueOf(String.format("%.3f", a));
        super.setText(vals);
        
    }
    
    
    
    
}
