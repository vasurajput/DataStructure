/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnatimeayega.LinkList;

/**
 * PROGRAME TO COUNT LOOP NODE IN LINK LIST
 *
 * @author Vasu Rajput
 */
public class CountLoopNode {

    static Node head;

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next.next.next.next;

        int countNodesInLoop = countNodesInLoop(head);
        System.out.println("TotalNodes= " + countNodesInLoop);
    }

    private static int countNodesInLoop(Node head) {
        Node slow_ptr = head, fast_ptr = head;
        while (slow_ptr != null && fast_ptr != null && fast_ptr.next != null) {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
            if (slow_ptr == fast_ptr) {
                System.out.println("Loop Found");
                return countNode(slow_ptr);
            }
        }
        return 0;
    }

    private static int countNode(Node slow_ptr) {
        int result = 1;
        Node tempNode = slow_ptr;
        while (tempNode.next != slow_ptr) {
            result++;
            tempNode = tempNode.next;
        }
        System.out.println("count= " + result);
        return result;

    }

}
