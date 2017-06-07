/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;

/**
 *
 * @author Kio
 */
public interface Plottable2D {
	public double[] evaluate(double[] x);
        public void setFunction(String a);
        public String getFuncName();
        
}