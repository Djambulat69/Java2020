package ru.capchik.java2020;

import java.util.Random;



public class Main {
    public static void main(String[] args) {
        // Task 1
        int sum = 0;
        int[] nums = new int[]{1, 2, 3, 5};
        for (int i = 0; i < nums.length; i++)
        {
            sum = sum + nums[i];
        }
        System.out.println(sum);

        int i = 0;
        sum = 0;
        while (i < nums.length) {
            sum = sum + nums[i];
            i++;
        }
        System.out.println(sum);

        i = 0;
        sum = 0;
        do
        {
            sum = sum + nums[i];
            i++;
        } while(i < nums.length);
        System.out.println(sum);

        //Task 2
        for (i = 0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }

        double a = 0;
        for (i = 1; i <= 10; i++)
        {
            a =(double) 1/i;
            String message = String.format("%.2f", a);
            System.out.println(message);
        }
        //Math.random
        int arr1[] = new int[10];
        for (i = 0; i < arr1.length; i++)
        {
            arr1[i] = (int) (Math.random() * 10);
            System.out.print(arr1[i] + " ");
        }
        System.out.print(" -> ");
        for (i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr1.length-1; j++) {
                if (arr1[i] < arr1[j]) {
                    int t = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = t;
                }
            }
        }

        for (i = 0; i < arr1.length; i++)
        {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        //Random
        Random random = new Random(67);
        int arr2[] = new int[10];
        for (i = 0; i < arr2.length; i++)
        {
            arr2[i] = random.nextInt(10);
            System.out.print(arr2[i] + " ");
        }
        System.out.print(" -> ");
        for (i = 0; i < arr2.length; i++)
        {
            for (int j = 0; j < arr2.length-1; j++) {
                if (arr2[i] < arr2[j]) {
                    int t = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = t;
                }
            }
        }

        for (i = 0; i < arr2.length; i++)
        {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        //Factorial
        fact(6);

        DogNursery5 nurs = new DogNursery5();
        Dog Sharik = new Dog("Sharik", 3);
        nurs.addDog(Sharik);
    }
    public static int fact(int a)
    {
        System.out.println("a = " + a);
        for (int i = a-1; i > 1; i--)
        {
            a *= i;
            System.out.println("a = " + a);
        }
        return a;
    };
}
