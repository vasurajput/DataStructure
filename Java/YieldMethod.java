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
class yieldDemo extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " demo class in control");
        }
    }

}

public class YieldMethod {

    public static void main(String[] args) {
        yieldDemo demo = new yieldDemo();
        demo.start();
        for (int i = 0; i < 5; i++) {
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + " main class in control");
        }
    }
}
