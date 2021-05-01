package com.practices;

import java.util.Hashtable;

public class practices {
    public static void main(String[] args) {
        /*
            read both the config files
            store the key value from the config to maps
            store the data from the map to a arraylist of map
         */
        Hashtable<Integer, String> studentList = new Hashtable<>();
        studentList.put(003, "Simlin");
        studentList.put(002, "Piu");
        studentList.put(004, "Niha");
        System.out.println(studentList);

    }
}
