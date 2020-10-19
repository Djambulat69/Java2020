package ru.capchik.java2020.calcul2;

import ru.capchik.java2020.calcul2.CalcForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcForm {
    private JPanel mainPanel;
    private JPanel panelCenter;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JPanel panelNorth;
    private JTextArea textArea1;
    private JPanel panelSouth;
    private JButton resetButton;
    private double result;
    private String op;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public CalcForm(){
        op = "";
        result = 0;
        panelCenter.setLayout(new GridLayout(4, 4));
        panelCenter.add(button1);
        panelCenter.add(button2);
        panelCenter.add(button3);
        panelCenter.add(button4);
        panelCenter.add(button5);
        panelCenter.add(button6);
        panelCenter.add(button7);
        panelCenter.add(button8);
        panelCenter.add(button9);
        panelCenter.add(button10);
        panelCenter.add(button11);
        panelCenter.add(button12);
        panelCenter.add(button13);
        panelCenter.add(button14);
        panelCenter.add(button15);
        panelCenter.add(button16);
        panelNorth.setLayout(new FlowLayout());
        panelNorth.add(textArea1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText() + "1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText() + "2");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText() + "3");
            }
        });
        button4.addActionListener(new ActionListener() { // /
            @Override
            public void actionPerformed(ActionEvent e) {
                result = operation(op, result, Double.parseDouble(textArea1.getText()));
                textArea1.setText(null);
                op = "/";
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText() + "4");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText() + "5");
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText() + "6");
            }
        });
        button8.addActionListener(new ActionListener() { // *
            @Override
            public void actionPerformed(ActionEvent e) {
                result = operation(op, result, Double.parseDouble(textArea1.getText()));
                textArea1.setText(null);
                op = "*";
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText() + "7");
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText() + "8");
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText() + "9");
            }
        });
        button12.addActionListener(new ActionListener() { // -
            @Override
            public void actionPerformed(ActionEvent e) {
                result = operation(op, result, Double.parseDouble(textArea1.getText()));
                textArea1.setText(null);
                textArea1.setText(null);
                op = "-";
            }
        });
        button13.addActionListener(new ActionListener() { // +
            @Override
            public void actionPerformed(ActionEvent e) {
                result = operation(op, result, Double.parseDouble(textArea1.getText()));
                textArea1.setText(null);
                op = "+";
            }
        });
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText() + "0");
            }
        });
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(textArea1.getText() + ".");
            }
        });
        button16.addActionListener(new ActionListener() { // =
            @Override
            public void actionPerformed(ActionEvent e) {
                result = operation(op, result, Double.parseDouble(textArea1.getText()));
                textArea1.setText(Double.toString(result));
                result = 0;
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText(null);
                result = 0;
                op = "";
            }
        });
    }
    private double operation(String op, double a, double b){
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            case "" -> b;
            default -> 0;
        };
    }
}
