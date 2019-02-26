/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnatimeayega.LinkList;

/**
 *
 * @author Vasu Rajput
 */
public class PairwiseSwap {

    static Node head;

    public static void main(String[] args) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        System.out.println("Before pair swapping");
        printList(head);
        pairswap(head);
        System.out.println("After pair swapping");
        printList(head);
    }

    private static void pairswap(Node head) {
        if (head == null) {
            System.out.println("List Is Empty");
            return;
        }
        Node temp = head;
        while (temp != null && temp.next != null) {
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
    }

    private static void printList(Node head) {
        while (head != null) {
            System.out.print(" " + head.data + " -> ");
            head = head.next;
        }
        System.out.println("");
    }
}
