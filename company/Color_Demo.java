package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Color_Demo extends Frame
{
    Label lbl1,lbl2,lbl3,lbl4,lbl5;
    public Color_Demo()
    {
        lbl1 = new Label("RED");
        lbl1.setForeground(Color.red);
        add(lbl1);
        lbl2 = new Label("MAGENTA");
        lbl2.setForeground(Color.magenta);
        add(lbl2);
        lbl3 = new Label("BLUE");
        lbl3.setForeground(Color.blue);
        add(lbl3);
        lbl4 = new Label("GREEN");
        lbl4.setForeground(Color.green);
        add(lbl4);
        lbl5 = new Label("CYAN");
        lbl5.setForeground(Color.cyan);
        add(lbl5);
        setVisible(true);
        setSize(400, 300);
        setLayout(new FlowLayout());
        
    }

    public static void main(String[] args)
    {
        new Color_Demo();
    }
}
