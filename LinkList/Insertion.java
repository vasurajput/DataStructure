/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnatimeayega.LinkList;

/**
 *
 * @author rv
 */
public class Insertion {

    static Node head;

    public static void main(String[] args) {
        head = new Node(0);
        head.next = new Node(3);
        head.next.next = new Node(5);
        System.out.println("Main List");
        printList(head);

        System.out.println("");
        System.out.println("After Insert At Front");
        insertAtFirst(6);        //For Insert at Front
        printList(head);

        System.out.println("");
        System.out.println("After Insert At Given Node");
        insertAfterGivenNode(head.next.next, 8);     //For Insert after Given Node
        printList(head);

        System.out.println("");
        System.out.println(" Insert At Last");
        insertAtLast(13);
        printList(head);

    }

    //Print LinkList
    private static void printList(Node head) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        while (head != null) {
            System.out.print(" " + head.data + " -> ");
            head = head.next;
        }
    }

    //Insert at Front of List
    private static void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //Insert After GIven Node
    private static void insertAfterGivenNode(Node previousNode, int data) {
        Node newNode = new Node(data);
        if (previousNode == null) {
            System.out.println("Previous Node can't be null");
            return;
        }
        newNode.next = previousNode.next;
        previousNode.next = newNode;
    }

    //Insert At Last
    private static void insertAtLast(int data) {
        Node NewNode = new Node(data);
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = NewNode;
    }
}
