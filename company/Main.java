package com.company;


    interface printable{
        void print();
    }
    class A2 implements printable  {

        public void print() {
            System.out.println("hello");
        }

    }
    public class Main {
        public static void main(String args[]){
            A2 object = new A2();
            object.print();
        }
    }