package ru.capchik.java2020.Praktika7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        //1
        /*
        String a, b;
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        a = text.substring(text.IndexOf("Вася заработал "), text.indexOf(" рублей"));
        b = text.substring(text.IndexOf("Маша - "), text.lastIndexOf(" "));
        System.out.println(a + " руб");
        System.out.println(b + " руб");
        */
        //2
        /*
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        if(input.matches("\\w*\\s\\w*\\s\\w*")){
            String[] str;
            str = input.split("\\s");
            System.out.printf("""
                    Фамилия: %s
                    Имя: %s
                    Отчество: %s
                    """, str[0], str[1], str[2]);
        }
        else if(input.matches("\\w*\\s\\w*")){
            String[] str;
            str = input.split("\\s");
            System.out.printf("""
                    Фамилия: %s
                    Имя: %s
                    """, str[0], str[1]);
        }
        else{
            System.out.println("Введенная строка не является ФИО");
        }
        */
        //3
        /*
        Scanner scan = new Scanner(System.in);
        String input2 = scan.nextLine();
        input2 = input2.trim();
        Pattern pattern = Pattern.compile("[ +\\-()]");
        String[] words = pattern.split(input2);
        String fullstr = "";
        for (String word : words) {
            fullstr = fullstr.concat(word);
        }
        StringBuffer number = new StringBuffer(fullstr);
        if (number.length() == 11){
            if (number.charAt(0) == '8'){
                number.deleteCharAt(0);
                number.insert(0, "+7 (");
                number.insert(7, ") ");
                number.insert(12, "-");
                number.insert(15, "-");
                System.out.println(number);
            }
            else if (number.charAt(0) == '7'){
                number.deleteCharAt(0);
                number.insert(0, "+7 (");
                number.insert(7, ") ");
                number.insert(12, "-");
                number.insert(15, "-");
                System.out.println(number);
            }
            else System.out.println("Неверный формат номера");
        }
        else if (number.length() == 10){
            number.insert(0, "+7 (");
            number.insert(7, ") ");
            number.insert(12, "-");
            number.insert(15, "-");
            System.out.println(number);
        }
        else System.out.println("Неверный формат номера");
        */
    }
}
