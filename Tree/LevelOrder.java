/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnatimeayega.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author rv
 */
public class LevelOrder {

    static Node root;

    public static void main(String[] args) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        printLevelOrder(root);
    }

    private static void printLevelOrder(Node root) {
        if (root == null) {
            System.out.println("root is empty");
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node current = q.peek();
            q.poll();
            System.out.print(" " + current.data + " ");
            if (current.left != null) {
                q.add(current.left);
            }
            if (current.right != null) {
                q.add(current.right);
            }
        }
    }
}
