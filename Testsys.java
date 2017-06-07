/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;

import cam.symfun.*;

/**
 *
 * @author Kio
 */
public class Testsys {
    public static void main(String[] args){
    SymbolicFunction Sym = new SymbolicFunction(); 
    
    String[] V = new String[1];                 
    V[0]       = new String("x"); // x = ind. variable
    String E   = "2*x + sin(x)";

    try
    {  
    Sym.initialize(V,E);
    }
    catch(Exception e)
    {
    System.out.println(e.getMessage());
    }
    
    double val = Sym.evaluate(2.0);
    System.out.println(" SymbolicFunction F = " + Sym.getConstructorString());
    System.out.println(" Evaluated at x     = 2.0 is : " + val);
   
    }
}
