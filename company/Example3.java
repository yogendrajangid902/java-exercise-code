package com.company;

import java.util.*;



class Example3 {

    public static void main(String[] args)

    {



        // Initializing the array

        int a[] = { 1, 2, 3, 4, 5, 6 };



        // Sorting the array in asscending order

        Arrays.sort(a);



        // Reversing the array

        reverse(a);



        // Printing the elements

        System.out.println(Arrays.toString(a));

    }



    public static void reverse(int[] a)

    {



        // Length of the array

        int n = a.length;



        // Swaping the first half elements with last half

        // elements

        for (int i = 0; i < n / 2; i++) {



            // Storing the first half elements temporarily

            int temp = a[i];



            // Assigning the first half to the last half

            a[i] = a[n - i - 1];



            // Assigning the last half to the first half

            a[n - i - 1] = temp;

        }

    }
}