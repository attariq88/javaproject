package com.practices;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

public class ReadPropertiesFile {


    public ReadPropertiesFile() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
//        Properties properties = new Properties();

//        try {
//            InputStream inputStream = new FileInputStream("src/com/practices/cofig.properties");
//        } catch (FileNotFoundException e) {
//            System.out.println("Please fix the file.");
//            e.printStackTrace();
//        }
        /*
        InputStream inputStream = new FileInputStream("src/com/practices/config.properties");
        properties.load(inputStream);

        String dbnameFromProperties = properties.getProperty("dbName");
        System.out.println(dbnameFromProperties);
         */

        System.out.println(readFile("src/com/practices/config.properties", "dbUser"));


    }

    public static String readFile(String location, String key) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream(location);
        properties.load(inputStream);

        String info = properties.getProperty(key);
        return info;

    }
}
