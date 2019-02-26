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
class NamingDemo extends Thread {

    public NamingDemo(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }

}

public class NamingThreadDemo {

    public static void main(String[] args) {
        NamingDemo t1 = new NamingDemo("vasu");
        NamingDemo t2 = new NamingDemo("konika");

        t1.start();
        t2.start();
    }
}
