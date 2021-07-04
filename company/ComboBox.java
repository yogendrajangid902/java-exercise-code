package com.company;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class ComboBox extends JFrame
{
    JFrame frame = new JFrame(" ");
    JComboBox cb1;
    JTextField txtsub;
    Container cc;
    JLabel lblsub, sub;

    public ComboBox()
    {
        super(" COMBO LIST");
        txtsub = new JTextField(20);
        cb1 = new JComboBox();
        lblsub = new JLabel(" SELECT SUBJECT:");
        sub= new JLabel(" SUBJECT NAME:");
        cc = getContentPane();
        cc.setLayout(null);
        cc.add(lblsub);
        cc.add(cb1);
        cc.add(txtsub);
        cc.add(sub);

        setSize(500,300);
        setLocation(0,0);
        setResizable(false);
        setLayout(null);
        cc.setBackground(Color.pink);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lblsub.setBounds(50,50,250,40);
        cb1.setBounds(170,50,250,35);
        sub.setBounds(50,150,250,40);
        txtsub.setBounds(170,150,250,35);

        cb1.addItem("DATA STRUCTURE IN C");
        cb1.addItem("OBJECT ORIENTED IN C++");
        cb1.addItem("CORE JAVA");
        cb1.addItem("ADVANCE JAVA");
        cb1.addItem("DATABASE MANAGEMENT SYSTEM");
        cb1.addItem("ADVANCE DATABASE MANAGEMENT SYSTEM");
        cb1.addItem("OPERATING SYSTEM");
        cb1.addItem("NETWORKING");
        cb1.addItem("VISUAL BASIC");

        cb1.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent event)
            {
                if (event.getStateChange() == ItemEvent.SELECTED)
                {
                    try
                    {
                        String no=cb1.getSelectedItem().toString();
                        txtsub.setText(no);
                    }
                    catch (Exception ex)
                    {
                        ex.printStackTrace();
                    }
                }
            }
        });
    }
    public static void main(String[] args)
    {
        new ComboBox();
    }
}
