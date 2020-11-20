package ru.capchik.java2020.Praktika9;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();
        String[] chars = new String[]{"А", "В","Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х", };

        IntStream.range(1, 200).forEach(
                region -> Arrays.stream(chars).forEach(
                        letterA -> Arrays.stream(chars).forEach(
                                letterB -> Arrays.stream(chars).forEach(
                                        letterC -> IntStream.range(1, 10).forEach(
                                                num -> {
                                                    String number = String.format("%s%d%d%d%s%s%03d%n", letterA, num, num, num, letterB, letterC, region);
                                                    if (!letterA.equals(letterB) && !letterB.equals(letterC) && !letterA.equals(letterC)){
                                                        //System.out.print(number);
                                                        numbers.add(number);
                                                    }
                                                }
                                        )
                                )
                        )
                )
        );

        Scanner scanner = new Scanner(System.in);
        String userNumber = scanner.next();

        String f;
        long time1 = System.nanoTime();
        if (numbers.contains(userNumber)) f = "найден"; else f = "не найден";
        long time = System.nanoTime() - time1;
        System.out.printf("Поиск перебором: номер %s, поиск занял %d нс\n", f, time);

        Collections.sort(numbers);

        time1 = System.nanoTime();
        if (Collections.binarySearch(numbers, userNumber) > 0) f = "найден"; else f = "не найден";
        time = System.nanoTime() - time1;
        System.out.printf("Бинарный поиск: номер %s, поиск занял %d нс\n", f, time);

        HashSet<String> numbersSet = new HashSet<>(numbers);

        time1 = System.nanoTime();
        if (numbersSet.contains(userNumber)) f = "найден"; else f = "не найден";
        time = System.nanoTime() - time1;
        System.out.printf("Поиск HashSet: номер %s, поиск занял %d нс\n", f, time);

        TreeSet<String> numbersTree = new TreeSet<>(numbers);

        time1 = System.nanoTime();
        if (numbersTree.contains(userNumber)) f = "найден"; else f = "не найден";
        time = System.nanoTime() - time1;
        System.out.printf("Поиск TreeSet: номер %s, поиск занял %d нс\n", f, time);
    }
}