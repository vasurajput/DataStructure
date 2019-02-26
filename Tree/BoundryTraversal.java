/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnatimeayega.Tree;

/**
 * PROGRAME FOR BOUNDRY TRAVERSAL
 *
 * @author Vasu Rajput
 */
public class BoundryTraversal {

    static Node root;

    public static void main(String[] args) {
        root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.right = new Node(25);
        printBoundary(root);
    }

    private static void printBoundary(Node root) {
        if (root != null) {

            System.out.print(" " + root.data + " ");
            //print left-boundry in top-down manner
            printLeftBoundry(root.left);

            // Print all leaf nodes
            printLeaves(root.left);
            printLeaves(root.right);

            //print right-boundry in bottom-up manner
            printRightBoundry(root.right);
        }
    }

    private static void printLeftBoundry(Node node) {
        if (node != null) {
            if (node.left != null) {

                // to ensure top down order, print the node 
                // before calling itself for left subtree 
                System.out.print(node.data + " ");
                printLeftBoundry(node.left);
            } else if (node.right != null) {
                System.out.print(node.data + " ");
                printLeftBoundry(node.right);
            }

            // do nothing if it is a leaf node, this way we avoid 
            // duplicates in output 
        }

    }

    private static void printLeaves(Node node) {
        if (node != null) {
            printLeaves(node.left);

            // Print it if it is a leaf node 
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }
            printLeaves(node.right);
        }

    }

    private static void printRightBoundry(Node node) {
        if (node != null) {
            if (node.right != null) {
                // to ensure bottom up order, first call for right 
                // subtree, then print this node 
                printRightBoundry(node.right);
                System.out.print(node.data + " ");
            } else if (node.left != null) {
                printRightBoundry(node.left);
                System.out.print(node.data + " ");
            }
            // do nothing if it is a leaf node, this way we avoid 
            // duplicates in output 
        }
    }

}
