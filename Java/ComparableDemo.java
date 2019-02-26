/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnatimeayega.Java;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author rv
 */
public class ComparableDemo implements Comparable<ComparableDemo> {

    public static void main(String[] args) {
        ArrayList<ComparableDemo> list = new ArrayList<>();
        list.add(new ComparableDemo(2.4, "vasu", 2011));
        list.add(new ComparableDemo(2.2, "oshu", 2009));
        list.add(new ComparableDemo(2.9, "koku", 2019));

        System.out.println("Movie before sorting");
        for (ComparableDemo d : list) {
            System.out.println("rating= " + d.getRating() + ", name= " + d.getName() + ", year= " + d.getYear());
        }

        Collections.sort(list);

        System.out.println("Movie After sorting");
        for (ComparableDemo d : list) {
            System.out.println("rating= " + d.getRating() + ", name= " + d.getName() + ", year= " + d.getYear());
        }
    }

    private double rating;
    private String name;
    private int year;

    public ComparableDemo(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(ComparableDemo comp) {
        return this.year - comp.getYear();
    }

}
