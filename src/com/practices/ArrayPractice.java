package com.practices;

import com.sun.source.tree.WhileLoopTree;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {

//        String [] names = {"Aziz","Shakib","Tariq"};
//        System.out.println(Arrays.toString(names));
//        Object [] anything = {"Tariq","Bangladesh",30};
//        String [] newNames = names.clone();
//        System.out.println(newNames.length);
//        Object nameFromAnything = anything[0];
//        Object countryFromAnything = anything[1];
//        Object ageFromAnything = anything[2];
        //System.out.println(nameFromAnything+" is "+ageFromAnything+" and from "+countryFromAnything);

//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }

//        Scanner input = new Scanner(System.in);
////        String fruitName = input.next();
//        String [] fruitNames = new String[3];
//        for (int i = 0; i < fruitNames.length; i++) {
//            System.out.println("Input 3 of your favourite fruits names");
//            fruitNames[i] = input.next();
//            System.out.println(Arrays.toString(fruitNames));
//        }

        Random random = new Random();

        int[] randomArray = new int[5];

        for (int i = 0; i < randomArray.length; i++) {
            int randomNumber = random.nextInt(50);
            randomArray[i] = randomNumber;


        }
        System.out.println(Arrays.toString(randomArray));

    }

}


