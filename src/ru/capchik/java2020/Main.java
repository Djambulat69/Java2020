package ru.capchik.java2020;

import java.util.Random;


public class Main {

    public static void main(String[] args) {
        // Task 1
        int sum = 0;
        int[] nums = new int[]{1, 2, 3, 5};
        for (int i = 0; i < nums.length; i++) {
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

        int arr[] = new int[10];
        for (i = 0; i < arr.length; i++)
        {
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        for (i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] > arr[i+1])
            {
                int t = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = t;
            }
        }
        for (i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
        }
    }
}
