package ru.capchik.java2020.Ex2;

public class DogNursery5 {
    private Dog[] nursery = new Dog[5];
    private int lastDog = 0;
    public void addDog(Dog d){
            nursery[lastDog] = d;
            if(lastDog < 5) lastDog++;
    }

}
