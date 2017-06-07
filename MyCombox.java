/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

/**
 *
 * @author Kio
 */
public class MyCombox extends JComboBox<String> implements ActionListener{
    
    private final String[] colors = {"Red", "Black", "Green"}; 
    
    public MyCombox(){
        for (int i=0 ; i<colors.length; ++i)
            this.addItem(colors[i]);
        this.setBounds(10,10,300,200);
               
    }

    public String[] getCols(){
        return colors;
    }

    
}
