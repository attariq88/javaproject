package com.practices;


import java.util.HashMap;
import java.util.Locale;

public class DuplicateDataPractice {

    public static void main(String[] args) {
        // From a given sentence find out the duplicate data and the occurrences

        String sentence1 = "Today is sunday. Sunday is a good day. I play soccer on sunday.";

        HashMap<String, Integer> totalOccurences = new HashMap<>();
        HashMap<String, Integer> multipleOccurences = new HashMap<>();

        String[] arrayOfIndividualWords = sentence1.toUpperCase().replace(".","").split(" ");

        for (String individualWords : arrayOfIndividualWords) {
            Integer previousCount = totalOccurences.get(individualWords);
            if (previousCount == null){
                previousCount = 0;
            }
            totalOccurences.put(individualWords,previousCount+1);

            if ((previousCount+1) >1){
                int totalCount = previousCount +1;
                multipleOccurences.put(individualWords,totalCount);
            }

        }

        System.out.println(totalOccurences);
        System.out.println(multipleOccurences);

    }


}
