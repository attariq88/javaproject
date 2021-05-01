package com.practices;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, String> informationMap = new HashMap<>();
        informationMap.put("Bangladesh", "Dhaka");
        informationMap.put("New Zealand", "Auckland");
        informationMap.put(null, "Washington");

        System.out.println(informationMap);
        System.out.println(informationMap.get("Bangladesh"));
        System.out.println(informationMap.get(null));

        System.out.println("*********");
        System.out.println(informationMap.size());
        System.out.println(informationMap.containsKey("Bangladesh"));
        System.out.println(informationMap.containsValue("Auckland"));

        HashMap<String, Integer> ageList = new HashMap<>();
        ageList.put("Simlin", 27);
        ageList.put("Yara", 10);
        ageList.put("Tahim", 4);
    }
}
