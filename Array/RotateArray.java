/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnatimeayega.Array;

/**
 * PROGRAME FOR ARRAY ROTATION
 *
 * @author Vasu Rajput
 * GeekLink= https://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/
 * ALGO:  Time Complexity in O(n)
 * 1- A[] = {1,2,3,4,5,6,7}
 * A = [1,2]
 * B = [3,4,5,6,7]
 * Reverse A = [2,1,3,4,5,6,7]
 * Reverse B = [2,1,7,6,5,4,3]
 * Reverse All = [3,4,5,6,7,1,2]
 */
public class RotateArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        rotate(arr, d);
        printArray(arr);
    }

    private static void rotate(int[] arr, int d) {
        int n = arr.length;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    private static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
        }
    }

}
