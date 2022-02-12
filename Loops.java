package com.Akshat;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Write a Number : ");
       // for loops
//        int num = 1;
//        for(int a = input.nextInt(); num <= a ; num++){
//            System.out.println(num);
//        }
        // while loop
//        int num = 1;
//        int a = input.nextInt();
//        while(num <= a){
//            System.out.println(num);
//            num++;
//        }
        // do while loop (we use do while because it always executes atleast once as it does the action first checks the condition later)
        int num = 1;
        int a = input.nextInt();
        do {
            System.out.println(num);
            num++;
        } while (num<=a);
    }
}
