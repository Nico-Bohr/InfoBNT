/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gy12;

/**
 *
 * @author Nico
 */
public class Nerver {
    
    static String nerver(int x){ 
        System.out.println("Hi " + x);
        System.out.println( x>=1 ? nerver(x+1) : "Fertig");
        return"";
    } 

    public static void main (String args[]){
        nerver(1);
    }
  
    
}


