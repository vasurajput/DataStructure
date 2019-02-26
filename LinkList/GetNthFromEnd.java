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
public class GetNthFromEnd {

    static Node head;

    public static void main(String[] args) {
        head = new Node(20);
        head.next = new Node(4);
        head.next.next = new Node(15);
        head.next.next.next = new Node(35);
      

        getNthNode(4);
    }

    private static void getNthNode(int index) {
        System.out.println("index= " + index);
        Node main_ptr = head;
        Node ref_ptr = head;

        int count = 1;

        if (head != null) {
            while (count < index) {
                ref_ptr = ref_ptr.next;
                count++;
            }
            System.out.println("afterWhile= "+ ref_ptr.data);
            while (ref_ptr != null) {
                main_ptr = main_ptr.next;
                ref_ptr = ref_ptr.next;
            }
            System.out.println("result = " + main_ptr.data);
        }
    }
}
