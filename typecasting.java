package com.Akshat;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//          float num1 = input.nextFloat();  this is allowed
//          float num2 = input.nextInt();  this is also allowed since float > int
//          int num3 = input.nextInt();  this is allowed
//          int num4 = input.nextFloat();  this is not allowed since int is smaller than float
        // typecasting example
//        int num = (int)(56.65f); // need to do typecasting in we want float value in integer
//        System.out.println(num);

        //automatic type promotions in experssions
//        int a = 255;
//        byte b = (byte)(a); // since byte can only store 256 values when we typecast java subtracts int value from 256
//        System.out.println(b); // java automatically converts byte into integer when its sees mathematical operations

//        int number = 'A';
//        System.out.println(number); // java works on UNICODE (not ASCII)

       // if given multiple primtives like float, double, int, long, char, byte in one operation java will promote automaticlly to the bigger type
       // which is double>float>long>int>byte>char
    }
}
