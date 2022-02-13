package com.Akshat;

import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int count = 0;
        int a= num1;
        while(a <= num2){
            if( a>0 ){
                int c = a % 10;   //taking the units place of the number
                int newnum = a/10;
                int b = newnum % 10;
                newnum = newnum/10;
                if(a == (c*c*c + b*b*b + newnum*newnum*newnum )){
                    System.out.println(a);
                    count++;
                }
            }
        a++;
        }
        System.out.println(count +" are the number of armstrong numbers that appear");

    }
}
