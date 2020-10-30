package ru.capchik.java2020.Praktika8.Task1;

import java.util.ArrayList;
import java.util.Scanner;







public class Main {

//ADD Какое-то дело0 ADD Какое-то дело1 ADD Какое-то дело2 ADD Какое-то дело3 ADD Какое-то дело4 ADD Какое-то дело5 ADD 4 Какое-то дело на четвёртом месте EDIT 3 Новое название дела DELETE 7 LIST
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] commands = input.split(" ");
        ArrayList<String> deals = new ArrayList<>();
        String word = "";
        for (String c:
             commands) {
            if (c.equals("ADD") || c.equals("EDIT") || c.equals("DELETE") || c.equals("LIST") || isInteger(c)){
                if (!word.equals("")){
                    word = word.trim();
                    deals.add(word);
                }
                word = "";
                deals.add(c);
            }
            else {
                word = word.concat(c + " ");
            }
            }
        for (int i = 0; i < deals.size(); i++) {
            switch (deals.get(i)){
                case "LIST": {
                    for (int j = 0; j < list.size(); j++) {
                        System.out.printf("\n%d. %s", j, list.get(j));
                    }
                    break;
                }
                case "ADD":{
                    try{
                        int n = Integer.parseInt(deals.get(i+1));
                        String deal = deals.get(i+2);
                        if (n < list.size() && n > -1) list.add(n, deal);
                        else System.out.printf("Can't add deal at %d index", n);
                    }
                    catch (NumberFormatException ex){
                        String deal = deals.get(i+1);
                        list.add(deal);
                    }
                    break;
                }
                case "EDIT":{
                    int n = Integer.parseInt(deals.get(i+1));
                    String deal = deals.get(i+2);
                    if (n < list.size() && n > -1) list.set(n, deal);
                    else System.out.printf("Can't edit deal at %d index", n);
                    break;
                }
                case "DELETE":{
                    int n = Integer.parseInt(deals.get(i+1));
                    if (n < list.size() && n > -1) list.remove(n);
                    else System.out.printf("Can't delete deal at %d index", n);
                    break;
                }
            }
        }

    }public static boolean isInteger(String s) {
        try {
            int i = Integer.parseInt(s);
            return true;
        }
        catch (Exception ex) {
            return false;
        }
}

}
