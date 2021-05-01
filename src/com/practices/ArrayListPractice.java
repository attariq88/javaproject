package com.practices;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> stateList = new ArrayList<>();
        stateList.add("NY");
        stateList.add("Tx");
        stateList.add("FL");

        System.out.println(stateList);

        for (int i = 0; i < stateList.size(); i++) {
            System.out.println(stateList.get(i));
        }

        stateList.remove("Tx");
        System.out.println(stateList);
        System.out.println(stateList.isEmpty());
        //stateList.clear();
        System.out.println(stateList.isEmpty());

        ArrayList<Integer> age = new ArrayList<>();
        age.add(20);
        age.add(21);
        age.remove(Integer.valueOf(20));
        System.out.println(age);

        System.out.println("**********");
        ArrayList<Object> objectList = new ArrayList<>();
        objectList.add("True");
        objectList.add(true);
        objectList.add(32);
        System.out.println(objectList);

        for (int i = 0; i < objectList.size(); i++) {
            System.out.println(objectList.get(i));
        }
        System.out.println("********");
        //Iterator
        Iterator iterator = stateList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
