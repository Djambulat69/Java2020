package ru.capchik.java2020.Ex3;

public class HumanTest {
    public static void main(String[] args){
        Head head = new Head(2,2);
        Hand r_hand = new Hand(5,"Right");
        Hand l_hand = new Hand(5,"Left");
        Leg r_leg = new Leg(4,"Right");
        Leg l_leg = new Leg(5,"left");
        Human man = new Human(head,r_leg,l_leg,r_hand,l_hand);
        System.out.println(man.toString());
    }
}
