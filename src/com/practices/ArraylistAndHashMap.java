package com.practices;

import java.util.ArrayList;
import java.util.HashMap;

public class ArraylistAndHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> cityAndZipcodeOfUSA = new HashMap<>();
        cityAndZipcodeOfUSA.put("Buffalo", 14214);
        cityAndZipcodeOfUSA.put("Niagara", 14305);

        HashMap<String, Integer> cityAndZipcodeOfBangladesh = new HashMap<>();
        cityAndZipcodeOfBangladesh.put("Basabo", 1214);
        cityAndZipcodeOfBangladesh.put("Gulshan", 1229);

        ArrayList<HashMap<String, Integer>> cityAndCodes = new ArrayList<>();
        cityAndCodes.add(cityAndZipcodeOfUSA);
        cityAndCodes.add(cityAndZipcodeOfBangladesh);

//        HashMap<String,Integer> firstCountry = cityAndCodes.get(0);
//        System.out.println(firstCountry.get("Buffalo"));

        System.out.println(cityAndCodes.get(0).get("Buffalo"));


    }
}
