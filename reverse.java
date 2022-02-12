package com.Akshat;

import java.util.Scanner;
// writing thereverse if whatever number has been given in input
public class reverse {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        int num = input.nextInt();
        int rans = 0;
        while(num > 0){
            int rem = num % 10;
            num = num / 10;
            rans = (rans * 10) + rem;
        }
        System.out.println(rans);

    }
}
