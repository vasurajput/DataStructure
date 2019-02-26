/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnatimeayega.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *LEVEL ORDER TRAVERSAL LINE BY LINE
 * 
 * @author Vasu Rajput
 */
public class LevelOrderLineByLine {

    static Node root;

    public static void main(String[] args) {

        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        levelOrderLineByLine(root);
    }

    private static void levelOrderLineByLine(Node root) {
        if (root == null) {
            System.out.println("root is empty");
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (true) {
            int nodeCount = q.size();
            if (nodeCount == 0) {
                break;
            }
            while (nodeCount > 0) {
                Node current = q.peek();
                System.out.print(" " + current.data + " ");
                q.remove();
                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }
                nodeCount--;

            }
            System.out.println("");
        }
    }
}
