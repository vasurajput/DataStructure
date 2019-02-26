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
public class GetNthNode {

    static Node head;

    public static void main(String[] args) {
        head = new Node(0);
        head.next = new Node(10);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        printList(head);
        printNthNode(2);
    }

    private static void printNthNode(int index) {

        Node temp = head;
        int count = 0;
        while (temp.next != null) {
            if (count == index) {
                System.out.println("result= " + temp.data);
                return;
            }
            count++;
            temp = temp.next;
        }
    }

    private static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(" " + current.data + " -> ");
            current = current.next;
        }
        System.out.println("");
    }
}
