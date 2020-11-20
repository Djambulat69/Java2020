package ru.capchik.java2020.Praktika10.task2;

import ru.capchik.java2020.Praktika10.task1.Main.*;
import java.io.File;
import java.util.Scanner;

import static ru.capchik.java2020.Praktika10.task1.Main.Log;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String path = scan.next();
        File m = new File(path);
        System.out.println(getFolderSize(m) + " byte");

    }
    static long getFolderSize(File folder) {
        long length = 0;
        File[] files = folder.listFiles();

        int count = files.length;

        for (int i = 0; i < count; i++) {
            if (files[i].isFile()) {
                length += files[i].length();
            }
            else {
                length += getFolderSize(files[i]);
            }
        }
        Log("size of " + folder.getAbsolutePath() + ": " + length + " byte");
        return length;
    }
}
