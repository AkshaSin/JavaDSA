package com.Akshat;

import java.util.Scanner;
//finding how many times 3 occure in a random number
public class countingoccurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("write a random number");
        int num = input.nextInt();
        System.out.println("write the number you want to find");
        int fnum = input.nextInt();
        if(fnum>9) {
            System.out.println("pls write a single digit number");
        }
        int count = 0;
        while(num > 0 ){
            int rem = num % 10;
            int newnum = num / 10;
            if( rem ==fnum){
                count++;
            }
            num = newnum ;

        }
        System.out.println(count);

        }


}
