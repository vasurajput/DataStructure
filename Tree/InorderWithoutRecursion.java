/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnatimeayega.Tree;

import static apnatimeayega.Tree.LevelOrder.root;
import java.util.Stack;

/**
 * ITERATIVE INORDER TRAVERSAL
 * 
 * ALGO
 * 1) Create an empty stack S.
2) Initialize current node as root
3) Push the current node to S and set current = current->left until current is NULL
4) If current is NULL and stack is not empty then 
     a) Pop the top item from stack.
     b) Print the popped item, set current = popped_item->right 
     c) Go to step 3.
5) If current is NULL and stack is empty then we are done.
 * 
 *
 * @author Vasu Rajput
 */
public class InorderWithoutRecursion {

    static Node root;

    public static void main(String[] args) {

        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        iterativeInorder(root);
    }

    private static void iterativeInorder(Node root) {
        if (root == null) {
            System.out.println("root is empty");
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (current != null || stack.size() > 0) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(" " + current.data + " ");
            current = current.right;
        }
        stack.push(current);
    }
}
