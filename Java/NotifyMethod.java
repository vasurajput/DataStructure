/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnatimeayega.Java;

import java.util.Scanner;

/**
 *
 * @author rv
 */
public class NotifyMethod {

    public static void main(String[] args) throws InterruptedException {
        final Pc pc = new Pc();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
    }

    public static class Pc {

        public void produce() throws InterruptedException {
            synchronized (this) {
                System.out.println("producer thread running");
                wait();
                System.out.println("Resumed Producer Thread");
            }
        }

        public void consume() throws InterruptedException {
            Thread.sleep(100);
            System.out.println("Consumer Thread Running");
            Scanner s = new Scanner(System.in);
            synchronized (this) {
                System.out.println("Waiting for retun key");
                s.nextLine();
                System.out.println("Return Key pressed");
                notify();
                Thread.sleep(2000);
            }
        }
    }
}
