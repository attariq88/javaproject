package com.practices;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String tempContainer;
        String finalContainer = "";

        try {
            FileReader fileReader = new FileReader("C:\\Tariq\\PPT\\Java & salenium\\Java\\class notes.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((tempContainer = bufferedReader.readLine()) != null) {
                if (finalContainer.equals("")) {
                    finalContainer = finalContainer + tempContainer;
                } else {
                    finalContainer = finalContainer + tempContainer + "\n";
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(finalContainer);

    }
}
