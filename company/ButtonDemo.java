package com.company;

import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends Frame
{
    Button b1, b2;
    ButtonDemo ()
    {
        b1 = new Button ("OK");
        b2 = new Button ("CANCEL");
        this.setLayout (null);
        b1.setBounds (100, 100, 80, 40);;
        b2.setBounds (200, 100, 80, 40);
        this.add (b1);
        this.add (b2);
        this.setVisible (true);
        this.setSize (300, 300);
        this.setTitle ("button");
        this.addWindowListener (new WindowAdapter ()
                                {
                                    public void windowClosing (WindowEvent we)
                                    {
                                        System.exit (0);}
                                }
        );
    }
    public static void main (String args[])
    {
        new ButtonDemo ();
    }
}
