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
public class GarbageDemo {

    String obj_name;

    public GarbageDemo(String obj_name) {
        this.obj_name = obj_name;
    }

    static void show() {
        GarbageDemo g = new GarbageDemo("t1");
        g.display();
    }

    public static void main(String[] args) {
        show();
        System.gc();

    }

    
    protected void finalize() {
        System.out.println(this.obj_name + " sussecfully garbaged");
    }

    private void display() {
        GarbageDemo demo = new GarbageDemo("t2");

    }
}
