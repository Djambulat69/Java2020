package ru.capchik.java2020.TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyForm {
    private JPanel panel;

    private JPanel panelCenter;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;

    private String step = "X";

    public Component getPanelCenter() {
        return panel;
    }



    public MyForm(){

        panelCenter.setLayout(new GridLayout(0, 3));
        panelCenter.add(button1);
        panelCenter.add(button2);
        panelCenter.add(button3);
        panelCenter.add(button4);
        panelCenter.add(button5);
        panelCenter.add(button6);
        panelCenter.add(button7);
        panelCenter.add(button8);
        panelCenter.add(button9);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean change = setButton(button1);
                checkButtons(step);
                if (change) changeStep();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean change = setButton(button2);
                checkButtons(step);
                if (change) changeStep();
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean change = setButton(button3);
                checkButtons(step);
                if (change) changeStep();
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean change = setButton(button4);
                checkButtons(step);
                if (change) changeStep();
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean change = setButton(button5);
                checkButtons(step);
                if (change) changeStep();
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean change = setButton(button6);
                checkButtons(step);
                if (change) changeStep();
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean change = setButton(button7);
                checkButtons(step);
                if (change) changeStep();
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean change = setButton(button8);
                checkButtons(step);
                if (change) changeStep();
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean change = setButton(button9);
                checkButtons(step);
                if (change) changeStep();
            }
        });
    }
    private void changeStep(){
        if (step.equals("X")) step = "O";
        else step = "X";
    }
    private boolean setButton(JButton button) {
        if (button.getText().equals("")){
            if (step.equals("X")) {
                button.setText("X");
                return true;
            }
            else {
                button.setText("O");
                return true;
            }
        }
        else return false;
    }
    private void checkButtons(String c) {
        if (win(c)) {
            JOptionPane.showMessageDialog(panel, winner(step));
            setButtonsEmpty();
        }
        else if (!button1.getText().equals("")
                && !button2.getText().equals("")
                && !button3.getText().equals("")
                && !button4.getText().equals("")
                && !button5.getText().equals("")
                && !button6.getText().equals("")
                && !button7.getText().equals("")
                && !button8.getText().equals("")
                && !button9.getText().equals(""))
        {
            JOptionPane.showMessageDialog(panel, winner("Friendship"));
            setButtonsEmpty();
        }
    }

    private void setButtonsEmpty() {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
    }

    private boolean win(String c) {
        return button1.getText().equals(c) && button2.getText().equals(c) && button3.getText().equals(c) ||
                button4.getText().equals(c) && button5.getText().equals(c) && button6.getText().equals(c) ||
                button7.getText().equals(c) && button8.getText().equals(c) && button9.getText().equals(c) ||
                button1.getText().equals(c) && button4.getText().equals(c) && button7.getText().equals(c) ||
                button2.getText().equals(c) && button5.getText().equals(c) && button8.getText().equals(c) ||
                button3.getText().equals(c) && button6.getText().equals(c) && button9.getText().equals(c) ||
                button1.getText().equals(c) && button5.getText().equals(c) && button9.getText().equals(c) ||
                button3.getText().equals(c) && button5.getText().equals(c) && button7.getText().equals(c);
    }
    private String winner(String winner){
        return winner + " is winner";
    }
}

