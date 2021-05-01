package com.practices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();
        cities.add("Dhaka");
        cities.add("Rajshahi");

        ArrayList<String> names = new ArrayList<>();
        names.add("Tariq");
        names.add("Simlin");
        names.add("Yara");
        names.add("Tahim");

        //System.out.println(names);

        Iterator iterator = cities.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next().toString();
            //System.out.println(name);
            names.add(name);
        }
        System.out.println(names);
    }
}
