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
public class Fibonacci {
  static int fib(int x){
    return x<=1?x :fib(x-1)+ fib(x-2);
    
 }
 public static void main(String[] args){
    System.out.println("fib(5) = "+fib(7));
    }  
}
