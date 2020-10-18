package ru.capchik.java2020.TicTacToe;

import ru.capchik.java2020.TicTacToe.MyForm;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setLocationRelativeTo(null);

        frame.add(new MyForm().getPanel1());


    }
}