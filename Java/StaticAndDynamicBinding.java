/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnatimeayega.Java;

/**
 *
 * @author rv
 */
public class StaticAndDynamicBinding {

    public static class superclass 
    { 
        static void print() 
        { 
            System.out.println("print in superclass."); 
        } 
    } 
    public static class subclass extends superclass 
    { 
        static void print() 
        { 
            System.out.println("print in subclass."); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        superclass A = new superclass(); 
        superclass B = new subclass(); 
        A.print(); 
        B.print(); 
    } 
}
