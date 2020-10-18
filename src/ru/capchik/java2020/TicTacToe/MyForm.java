package ru.capchik.java2020.TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyForm {
    private JPanel panel1;
    private char step = 'X';

    public Component getPanel1() {
        return  panel1;
    }
    public MyForm(){
        panel1.setLayout(new GridLayout(0, 3));
        JButton button1 = new JButton();
        panel1.add(button1);
        JButton button2 = new JButton();
        panel1.add(button2);
        JButton button3 = new JButton();
        panel1.add(button3);
        JButton button4 = new JButton();
        panel1.add(button4);
        JButton button5 = new JButton();
        panel1.add(button5);
        JButton button6 = new JButton();
        panel1.add(button6);
        JButton button7 = new JButton();
        panel1.add(button7);
        JButton button8 = new JButton();
        panel1.add(button8);
        JButton button9 = new JButton();
        panel1.add(button9);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setButton(button1);
                changeStep();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setButton(button2);
                changeStep();
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setButton(button3);
                changeStep();
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setButton(button4);
                changeStep();
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setButton(button5);
                changeStep();
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setButton(button6);
                changeStep();
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setButton(button7);
                changeStep();
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setButton(button8);
                changeStep();
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setButton(button9);
                changeStep();
            }
        });
    }
    private void changeStep(){
        if (step == 'X') step = 'O';
        else step = 'X';
    }

    public void setButton(JButton button) {
        if (button.getText().equals("")){
            if (step == 'X') button.setText("X");
            else button.setText("O");
        }
    }
}
