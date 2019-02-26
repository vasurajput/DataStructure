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
class SleepDemo implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(Thread.currentThread().getName() + " demo in control");
            try {
                Thread.sleep(2000);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

public class SleepMethod {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Run Main Method");
        System.out.println("Run main method dobara");
        Thread thread = new Thread(new SleepDemo());
        thread.start();
        thread.join();
        Thread t2 = new Thread(new SleepDemo());
        t2.start();
        t2.join();

        

    }
}
