/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnatimeayega.LinkList;

/**
 *
 * @author vasu rajput
 */
public class PrintMiddle {

    static Node head;

    public static void main(String[] args) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

       

        findMiddle(head);
    }

    private static void findMiddle(Node head) {
        try {
            if (head == null) {
                System.out.println("List is Empty");
                return;
            }
            System.out.println("head= " + head);
            Node fast_ptr = head;
            Node slow_ptr = head;
            System.out.println("fast= " + fast_ptr);
            if (head != null) {
                while (fast_ptr != null && fast_ptr.next != null) {
                    fast_ptr = fast_ptr.next.next;
                    slow_ptr = slow_ptr.next;

                }
                System.out.println("slow_ptr= " + slow_ptr.data);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
