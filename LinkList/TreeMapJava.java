/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnatimeayega.LinkList;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author rv
 */
public class TreeMapJava {

    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int arr[] = {3, 2, 1, -1, 0, -2};
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
//            Integer get = map.get(arr[i]);
//            System.out.println("get= " + get);
//            if (map.get(arr[i]) == null) {
//                map.put(arr[i], 1);
//            } else {
//                map.put(arr[i], ++get);
//            }
        }

        for (Map.Entry m : map.entrySet()) {
            System.out.println("key= " + m.getKey() + ", value= " + m.getValue());
        }
    }
}
