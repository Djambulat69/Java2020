package ru.capchik.java2020.Praktika10.task1;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Log("Created\n");
    }

    public static void Log(String message){
        File logFile = new File("log.txt");
        ArrayList<String> messageList = new ArrayList<>();
        messageList.add(message);
        try {
            Files.write(Paths.get("log.txt"), messageList);
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
}
