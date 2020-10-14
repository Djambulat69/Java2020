package ru.capchik.java2020.Ex10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyForm {
    private JTextArea textArea1;
    private JPanel panel1;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton resultButton;
    private JButton resetButton;
    private double result;
    private String op;

    public JPanel getPanel1() {
        return panel1;
    }

    private double operation(String op, double a, double b){
        if (op.equals("+")){
            return a + b;
        }
        if (op.equals("-")){
            return a - b;
        }
        if (op.equals("*")){
            return a * b;
        }
        if (op.equals("/")){
            return a / b;
        }
        if (op.equals("")){
            return b;
        }
        return 0;
    }
    public MyForm() {
        op = "";
        result = 0;
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = operation(op, result, Double.parseDouble(textArea1.getText()));
                textArea1.setText(null);
                op = "+";
            }
        });
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = operation(op, result, Double.parseDouble(textArea1.getText()));
                textArea1.setText(null);
                op = "-";
            }
        });
        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = operation(op, result, Double.parseDouble(textArea1.getText()));
                textArea1.setText(null);
                op = "*";
            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = operation(op, result, Double.parseDouble(textArea1.getText()));
                textArea1.setText(null);
                op = "/";
            }
        });
        resultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = operation(op, result, Double.parseDouble(textArea1.getText()));
                textArea1.setText(Double.toString(result));
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
        textArea1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        textArea1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });




    }
}
