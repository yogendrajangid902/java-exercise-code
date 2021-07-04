package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JPanel implements ActionListener {
    private JTextField display = new JTextField("0");
    private String buttonText = "789/456*123-0.=+";
    private double result = 0;
    private String operator = "=";
    private boolean calculating = true;

    public Calculator() {
        setLayout(new BorderLayout());
        display.setEditable(true);
        display.setSize(400,50);
        add(display, "North");
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4, 4));
        for (int i = 0; i < buttonText.length(); i++) {
            JButton b = new JButton(buttonText.substring(i, i + 1));
            p.add(b);
            b.addActionListener(this);
        }
        add(p, "Center");
    }

    public void actionPerformed(ActionEvent evt) {
        String cmd = evt.getActionCommand();
        if ('0' <= cmd.charAt(0) && cmd.charAt(0) <= '9' || cmd.equals(".")) {
            if (calculating)
                display.setText(cmd);
            else
                display.setText(display.getText() + cmd);
            calculating = false;
        } else {
            if (calculating) {
                if (cmd.equals("-")) {
                    display.setText(cmd);
                    calculating = false;
                } else
                    operator = cmd;
            } else {
                double x = Double.parseDouble(display.getText());
                calculate(x);
                operator = cmd;
                calculating = true;
            }
        }
    }

    private void calculate(double n) {
        if (operator.equals("+"))
            result += n;
        else if (operator.equals("-"))
            result -= n;
        else if (operator.equals("*"))
            result *= n;
        else if (operator.equals("/")) {
            try {
                result /= n;
            } catch (ArithmeticException e) {
                display.setText("infinity");
            }
        } else if (operator.equals("="))
            result = n;
        display.setText("" + result);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(500, 500);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Container contentPane = frame.getContentPane();
        contentPane.add(new Calculator());
        frame.show();
    }
}
