/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnatimeayega.Array;

/**
 * PROGRAME FOR REVERSE ARRAY
 *
 * @author Vasu Rajput
 * 
 * ALGO
 * 1- Initialize two pointer start and end
 * 2- initialize start=0 and end = arr.length-1
 * 3- while start< end
 * 4- swap start and end , increment start++ and decrement end--
 */
public class ReverseArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        System.out.println("before Reverse Array is");
        printArrat(arr);
        reverseArray(arr, 0, n -1);
        System.out.println("After Reverse Array is");
        printArrat(arr);
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

    private static void printArrat(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("" + arr[i] + " ");
        }
    }
}
