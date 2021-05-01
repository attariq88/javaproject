package com.practices;

import java.util.Arrays;
import java.util.Locale;

public class AnagramPractice {

    public static boolean getIsAnagram(String a, String b){
        boolean isAnagram = false;

        String x = a.toUpperCase();
        String y = b.toUpperCase();

        char[] charArrayOfx = x.toCharArray();
        char[] charArrayOfy = y.toCharArray();

        Arrays.sort(charArrayOfx);
        Arrays.sort(charArrayOfy);

        isAnagram = Arrays.equals(charArrayOfx,charArrayOfy);

        return isAnagram;
    }

    public static void main(String[] args) {
        System.out.println(getIsAnagram("Army","MARY"));
    }
}
