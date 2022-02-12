package com.Akshat;

import java.util.Scanner;

// find the value of the 7th fibonnaci number
public class fibonnaci {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n =input.nextInt();
       int a = 0;
       int b = 1;
       int c;
       int count = 0;
       while(count <=n){
           c = a + b;
           a = b;
           b = c;
           count++;
           System.out.print(c+ " ");
        }

    }
}
