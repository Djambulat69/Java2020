package ru.capchik.java2020.Praktika11.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String pathToCsv = "C:\\Users\\Djamb\\Downloads\\Практика 11\\movementList.csv";
        BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
        String row = csvReader.readLine();
        while (row != null) {
            String[] data = row.split(",");
            //data
            for (String s:
                 data) {
                System.out.print(s + " ");
            }
            System.out.println();
            //data
            row = csvReader.readLine();
        }
        csvReader.close();


    }
}
