/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnatimeayega.Array;

/**
 * PROGRAME TO FIND IN SORTED AND ROTATED ARRAY
 *
 * @author Vasu Rajput  
 */
public class SearchInRotateArray {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 1, 2};
        int n = arr.length;
        int seacrhElement = 2;
        int searchInSortAndRotateArr = searchInSortAndRotateArr(arr, 0, n -1 , seacrhElement);
        System.out.println("seacrhIndex= " + searchInSortAndRotateArr);
    }

    private static int searchInSortAndRotateArr(int[] arr, int low, int high, int seacrhElement) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        System.out.println("mid= " + mid);
        if (arr[mid] == seacrhElement) {
            return mid;
        }

        if (arr[low] <= arr[mid]) {
            if (seacrhElement > arr[low] && seacrhElement < arr[mid]) {
                return searchInSortAndRotateArr(arr, low, mid - 1, seacrhElement);
            }
            return searchInSortAndRotateArr(arr, mid + 1, high, seacrhElement);
        }

        if (seacrhElement >= arr[mid] && seacrhElement <= arr[high]) {
            return searchInSortAndRotateArr(arr, mid + 1, high, seacrhElement);
        }
        return searchInSortAndRotateArr(arr, low, mid - 1, seacrhElement);
    }
}
