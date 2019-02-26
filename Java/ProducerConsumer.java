/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnatimeayega.Java;

import java.util.LinkedList;

/**
 *
 * @author rv
 */
public class ProducerConsumer {

    public static void main(String[] args) throws InterruptedException {
        prodCons pc = new prodCons();
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

    public static class prodCons {

        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;

        public void produce() throws InterruptedException {
            System.out.println("Produce Invoked");
            int value = 0;
            while (true) {
                synchronized (this) {
                    if (list.size() == capacity) {
                        wait();
                    }
                    System.out.println("Producer produced-"
                            + value);
                    list.add(value++);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }

        public void consume() throws InterruptedException {
            System.out.println("Consume Invoked");
            while (true) {
                synchronized (this) {
                    if (list.size() == 0) {
                        wait();
                    }
                    int val = list.removeFirst();
                    System.out.println("Consumer Consumed " + val);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
    }
}
