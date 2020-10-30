package ru.capchik.java2020.Praktika8.Task2;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> mails = new TreeSet<>();
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] commands = input.split(" ");
        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]){
                case "ADD":{
                    if (Pattern.matches("\\w+@\\w+\\.\\w+", commands[i])) mails.add(commands[i+1]);
                    else System.out.println("Неверный формат email");
                    break;
                }
                case "LIST":{
                    for (String s:
                         mails) {
                        System.out.println(s);
                    }
                    break;
                }
            }
        }
    }
}
