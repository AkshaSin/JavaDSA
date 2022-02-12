package com.Akshat;

import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float si = 0;
        System.out.print("enter the prinicple: ");
        float p = input.nextFloat();
        System.out.print("enter the rate of interest: ");
        float r = input.nextFloat();
        System.out.print("enter the time: ");
        float t = input.nextFloat();
        if(p!=0 || r!=0 || t!=0){
            si = (p*r*t)/100;
        }
        else{
            System.out.println("Principle cannot be 0");
        }
        float np = si +p;
        System.out.println("the Simple interest is: "+ si);
        System.out.println("your new principle after "+t+" years will be "+ np );

    }
}
