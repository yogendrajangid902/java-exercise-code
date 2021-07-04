package com.company;

interface Printable{
    void Print();
}
interface Showable{
    void Show();
}
public class Q1 implements Printable,Showable{
    public static void main(String[] args){
        Q1 object = new Q1();
        object.Print();
        object.Show();
    }

    public void Print() {
        System.out.println("hello");
    }


    public void Show() {
        System.out.println("welcome");
    }


}