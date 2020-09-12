package ru.capchik.java2020.Ex3;

public class Human {
    private Head Head;
    private Leg Leg1;
    private Leg Leg2;
    private Hand Hand1;
    private Hand Hand2;

    public Human(Head Head, Leg Leg1,Leg Leg2, Hand Hand1, Hand Hand2){
        this.Head = Head;
        this.Leg1 = Leg1;
        this.Leg2 = Leg2;
        this.Hand1 = Hand1;
        this.Hand2 = Hand2;
    }

    @Override
    public String toString() {
        return "Human{" +
                "Head=" + Head +
                ", Leg1=" + Leg1 +
                ", Leg2=" + Leg2 +
                ", Hand1=" + Hand1 +
                ", Hand2=" + Hand2 +
                '}';
    }

    public ru.capchik.java2020.Ex3.Hand getHand1() {
        return Hand1;
    }
    public ru.capchik.java2020.Ex3.Hand getHand2() {
        return Hand2;
    }

    public ru.capchik.java2020.Ex3.Head getHead() {
        return Head;
    }

    public ru.capchik.java2020.Ex3.Leg getLeg1() {
        return Leg1;
    }
    public ru.capchik.java2020.Ex3.Leg getLeg2() {
        return Leg2;
    }
    public void setHand1(ru.capchik.java2020.Ex3.Hand hand1) {
        Hand1 = hand1;
    }
    public void setHand2(ru.capchik.java2020.Ex3.Hand hand2) {
        Hand2 = hand2;
    }

    public void setHead(ru.capchik.java2020.Ex3.Head head) {
        Head = head;
    }

    public void setLeg1(ru.capchik.java2020.Ex3.Leg leg) {
        Leg1 = leg;
    }
    public void setLeg2(ru.capchik.java2020.Ex3.Leg leg) {
        Leg2 = leg;
    }
}
