package com.practices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class HashMapPractice2 {
    public static void main(String[] args) {

        ArrayList<String> listOfUSA = new ArrayList<>();
        listOfUSA.add("NY");
        listOfUSA.add("TX");
        listOfUSA.add("FL");

        ArrayList<String> listOfCanada = new ArrayList<>();
        listOfCanada.add("ON");
        listOfCanada.add("MT");
        listOfCanada.add("BC");


        HashMap<String, ArrayList<String>> provinceList = new HashMap<>();

        provinceList.put("USA", listOfUSA);
        provinceList.put("Canada", listOfCanada);
//        System.out.println(provinceList);
//        System.out.println(provinceList.get("Canada"));

        ArrayList<HashMap<String, ArrayList<String>>> provinceList2 = new ArrayList<>();

        provinceList2.add(provinceList);
        System.out.println(provinceList2);
    }
}
