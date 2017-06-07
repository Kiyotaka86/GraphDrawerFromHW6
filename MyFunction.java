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

import static hw6.ArrayMath.add;
import static hw6.ArrayMath.pow;

public class MyFunction implements Plottable2D{
 
    SymbolicFunction sym = new SymbolicFunction();
    
    public void setFunction(String a){
   
        String[] V = new String[1]; 
        V[0]     = "x"; // x = ind. variable
        String E   = a;

        try
        {  
        sym.initialize(V,E);
        }
        catch(Exception e)
        {
        System.out.println(e.getMessage());
        }
}
    
    
    public double[] evaluate(double[] x) {
        double[] ans = new double[x.length];
        for (int i=0; i<x.length;++i)
            ans[i] = sym.evaluate(x[i]);
        
        return ans;
    }
    
    public String getFuncName(){
        return sym.getConstructorString();
    }
    
}
