package ru.capchik.java2020.Praktika10.task3;

import ru.capchik.java2020.Praktika10.task1.Main.*;

import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

import static ru.capchik.java2020.Praktika10.task1.Main.Log;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("From: ");
        String pathFrom = scan.next();
        System.out.print("To: ");
        String pathTo = scan.next();

        File file = new File(pathFrom);
        File[] listOfFiles = file.listFiles();

        try {
            assert listOfFiles != null;
            for (File f : listOfFiles) {
                Files.copy(f.toPath(), new File( pathTo + File.separator + f.getName()).toPath());
            }
            Log("Copied from " + pathFrom + " to " + pathTo);
        }
        catch (Exception ex){
            System.out.println(ex.toString());
        }
    }
}
