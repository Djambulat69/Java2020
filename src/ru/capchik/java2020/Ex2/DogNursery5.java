package ru.capchik.java2020.Ex2;

import java.sql.SQLOutput;

public class DogNursery5 {
    private Dog[] nursery = new Dog[5];
    private int lastDog = 0;
    public void addDog(Dog d){
        if (lastDog < 5) {
            nursery[lastDog] = d;
            lastDog++;
        }
        else
        {
            System.out.println("Nursery is full");
        }
    }

}
