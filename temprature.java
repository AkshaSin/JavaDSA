package com.Akshat;

import java.util.Scanner;

public class temprature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Enter temprature in Celsius: ");
            float temp1 = input.nextFloat();
            float temp2 = temp1 * 9 / 5 + 32;
            System.out.println("the temprature in farehiet will be " + temp2);


        }
    }
