/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnatimeayega.Tree;

import java.util.Stack;

/**
 *
 * @author Vasu Rajput
 */
public class IterativePreOrder {

    static Node root;

    public static void main(String[] args) {
        root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);

        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(2);

        printIterative(root);
    }

    private static void printIterative(Node root) {
        if (root == null) {
            System.out.print("root is empty");
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (stack.empty() == false) {
            Node myNode = stack.peek();
            System.out.print(" " + myNode.data + " ");
            stack.pop();
            if (myNode.left != null) {
                stack.push(myNode.left);
            }
            if (myNode.right != null) {
                stack.push(myNode.right);
            }
        }
    }
}
