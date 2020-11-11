package ru.capchik.java2020.Praktika8.Task3;

import java.util.*;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        Map<String, String> num_book = new HashMap<>();

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] commands = input.split(" ");
        for (int i = 0; i < commands.length; i++) {
            String s = commands[i];
            if (s.equals("LIST")){
                Map<String, String> sorted_num_book = new TreeMap<>(num_book);
                for (String key:
                        sorted_num_book.keySet()) {
                    System.out.println(key + " --- " + sorted_num_book.get(key));
                }
            }
            else {
                if (Pattern.matches("[a-zA-Z]+", s)){
                    if (num_book.containsKey(s))
                        System.out.println(s + " --- " + num_book.get(s));
                    else {
                        Scanner scan2 = new Scanner(System.in);
                        System.out.println("Введите номер:");
                        String inputNumber = scan2.nextLine();
                        num_book.put(s, num_check(inputNumber));
                    }
                }
                else if (!(num_check(s).equals("Неверный формат номера"))){
                    if (num_book.containsValue(num_check(s))){
                        int n = (new ArrayList<>(num_book.values()).indexOf(num_check(s)));
                        System.out.println(num_book.keySet().toArray()[n] + " --- " + num_check(s));
                    }
                    else {
                        Scanner scan2 = new Scanner(System.in);
                        System.out.println("Введите имя:");
                        String inputName = scan2.nextLine();
                        num_book.put(inputName, num_check(s));
                    }
                }


            }
        }
    }

    static String num_check(String input){
        input = input.trim();
        Pattern pattern = Pattern.compile("[ +\\-()]");
        String[] words = pattern.split(input);
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
                return number.toString();
            }
            else if (number.charAt(0) == '7'){
                number.deleteCharAt(0);
                number.insert(0, "+7 (");
                number.insert(7, ") ");
                number.insert(12, "-");
                number.insert(15, "-");
                return number.toString();
            }
            else return "Неверный формат номера";
        }
        else if (number.length() == 10){
            number.insert(0, "+7 (");
            number.insert(7, ") ");
            number.insert(12, "-");
            number.insert(15, "-");
            return number.toString();
        }
        else return "Неверный формат номера";
    }
}


/*
Dave Emma 89253334455 LIST
89265518876
89253334455
 */
