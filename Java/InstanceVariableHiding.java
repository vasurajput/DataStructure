/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnatimeayega.Java;

import java.util.Arrays;

/**
 *
 * @author rv
 */
public class InstanceVariableHiding {
    
    int i = 10;
    public void hide(){
        int i = 20;
        System.out.println("localeVariable= "+ i);
        System.out.println("InstanceVariable= "+ this.i);
    }
    public static void main(String[] args) {
        InstanceVariableHiding in = new InstanceVariableHiding();
        Class c = in.getClass();
        System.out.println("className= "+ c.getName() + ", "+ Arrays.toString(c.getMethods()));
        in.hide();
    }
}
