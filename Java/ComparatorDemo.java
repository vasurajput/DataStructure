/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnatimeayega.Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author rv
 */
class Student {

    public String name;
    public String address;
    public int rollno;

    public Student(String name, String address, int rollno) {
        this.name = name;
        this.address = address;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", address=" + address + ", rollno=" + rollno + '}';
    }

}

class CompareByRollNumber implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.rollno - s2.rollno;
    }

}

class CompareByName implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }

}

public class ComparatorDemo {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("vasu", "nbd", 12));
        list.add(new Student("koku", "kotdwar", 11));
        list.add(new Student("oshu", "golden", 45));

        System.out.println("before sort");
        for (Student s : list) {
            System.out.println("name= " + s.name + " ,rollno= " + s.rollno + " add= " + s.address);
        }

        Collections.sort(list, new CompareByName());
        Collections.sort(list, new CompareByRollNumber());

        System.out.println("after sort");
        for (Student s : list) {
            System.out.println("name= " + s.name + " ,rollno= " + s.rollno + " add= " + s.address);
        }
        

    }

}
