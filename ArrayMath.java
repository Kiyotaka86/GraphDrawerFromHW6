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
public class ArrayMath {
    
    static String dec = "%.3f";
    
    public static void println(double[] a){
        
        System.out.print("[");
        
        for(int i=0; i<a.length-1; ++i){
            System.out.print((String.format(dec, a[i])+", "));
            
        }
        System.out.print(String.format(dec, a[a.length-1])+"]\n");
       
    }
    
    public static double[] zeros(int n){
        double[] zer = new double[n];
        
        for(int i=0; i<n; i++)
            zer[i] = 0;
        
        return zer;
    }
    
    public static double[] ones(int n){
        double[] on = new double[n];
        
        for(int i=0; i<n; i++)
            on[i] = 1;
        
        return on;
    }
    
    public static double[] linspace(double a, double b, int n){
        double[] lin = new double[n];
     
        lin[0] = a;
        lin[lin.length-1] = b;
        
        for (int i=1; i<n-1;i++)
            lin[i] = a +((b-a)/(n-1))*i;
        
        return lin;
    }

    public static double min(double[] a){
        double min = a[0];
        
        for(int i=1; i<a.length;i++)
            if(min>a[i])
                min = a[i];
        
        return min;
    }
    
    public static double max(double[] a){
        double max = a[0];
        
        for(int i=1; i<a.length;i++)
            if(max<a[i])
                max = a[i];
        
        return max;
    }
        
    public static int imin(double[] a){
        double min = a[0];
        int imin = 0;
        
        for(int i=1; i<a.length;i++)
            if(min>a[i]){
                min = a[i];
                imin=i;
            }
        
        return imin;
    }
    
    public static int imax(double[] a){
        double max = a[0];
        int imax = 0;
        
        for(int i=1; i<a.length;i++)
            if(max<a[i]){
                max = a[i];
                imax = i;
            }   
        
        return imax;
    }
 
    public static double[] add(double[] a, double[] b){
        double[] res = new double[a.length];
        
        for(int i=0; i<res.length; ++i)
            res[i]=a[i]+b[i];

        return res;
    }
    
    public static double[] add(double n, double[] a){
        double[] res = new double[a.length];
        
        for(int i=0; i<res.length; ++i)
            res[i]=n+a[i];

        return res;
    }

    public static double[] add(double[] a, double n){
        double[] res = new double[a.length];
        
        for(int i=0; i<res.length; ++i)
            res[i]=a[i]+n;

        return res;
    }
        
    public static double[] subtract(double[] a, double[] b){
        double[] res = new double[a.length];
        
        for(int i=0; i<res.length; ++i)
            res[i]=a[i]-b[i];

        return res;
    }
    
    public static double[] subtract(double n, double[] a){
        double[] res = new double[a.length];
        
        for(int i=0; i<res.length; ++i)
            res[i]=n-a[i];

        return res;
    }

    public static double[] subtract(double[] a, double n){
        double[] res = new double[a.length];
        
        for(int i=0; i<res.length; ++i)
            res[i]=a[i]-n;

        return res;
    }    
    
    public static double[] multiply(double[] a, double[] b){
        double[] res = new double[a.length];
        
        for(int i=0; i<res.length; ++i)
            res[i]=a[i]*b[i];

        return res;
    }
    
    public static double[] multiply(double n, double[] a){
        double[] res = new double[a.length];
        
        for(int i=0; i<res.length; ++i)
            res[i]=n*a[i];

        return res;
    }

    public static double[] multiply(double[] a, double n){
        double[] res = new double[a.length];
        
        for(int i=0; i<res.length; ++i)
            res[i]=a[i]*n;

        return res;
    }    

    public static double[] divide(double[] a, double[] b){
        double[] res = new double[a.length];
        
        for(int i=0; i<res.length; ++i)
            res[i]=a[i]/b[i];

        return res;
    }
    
    public static double[] divide(double n, double[] a){
        double[] res = new double[a.length];
        
        for(int i=0; i<res.length; ++i)
            res[i]=n/a[i];

        return res;
    }

    public static double[] divide(double[] a, double n){
        double[] res = new double[a.length];
        
        for(int i=0; i<res.length; ++i)
            res[i]=a[i]/n;

        return res;
    }
  
    public static double[] pow(double[] a, double[] b){
        double[] res = new double[a.length];
        
        for(int i=0; i<res.length; ++i)
            res[i] = Math.pow(a[i], b[i]);

        return res;
    }
    
    public static double[] pow(double n, double[] a){
        double[] res = new double[a.length];
        
        for(int i=0; i<res.length; ++i)
            res[i] =Math.pow(n, a[i]);

        return res;
    }

    public static double[] pow(double[] a, double n){
        double[] res = new double[a.length];
        
        for(int i=0; i<res.length; ++i)
            res[i]=Math.pow(a[i], n);

        return res;
    }
    
    public static void setDisplayFormat(String a){
        dec = a;
        
    }
    
}
