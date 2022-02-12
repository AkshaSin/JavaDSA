package com.Akshat;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        int a = input.nextInt();
        if(a%2==0){
            System.out.println(a+" is a even number");
        }
        else{
            System.out.println(a+" is a odd number");
        }

    }
}
