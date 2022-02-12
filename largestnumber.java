package com.Akshat;

import java.util.Scanner;

public class largestnumber {
    public static void main(String[] args) {
        Scanner inpput = new Scanner(System.in);
        System.out.print("enter value of a: ");
        int a = inpput.nextInt();
        System.out.print("enter vakue of b: ");
        int b = inpput.nextInt();
        System.out.print("enter value of c: ");
        int c = inpput.nextInt();
        // one way
//        int max = a;
//        if (b> max){
//           max = b;
//        }
//        if (c> max){
//          max = c;
//
//        }
        // another way
        int max = 0;
        if (a> b){
            max = a;
        }else{
            max = b;
        }
        if(c> max){
            max = c;
        }
        System.out.println("the maximum value is " + max);
    }
}
