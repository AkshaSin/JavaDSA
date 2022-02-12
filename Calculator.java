package com.Akshat;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float ans = 0;
        while(true){
            System.out.print("Enter the operation you want to do: ");
            char op = input.next().trim().charAt(0);
            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                System.out.print("Enter first number: ");
                float num1 = input.nextFloat();
                System.out.print("Enter second number: ");
                float num2 = input.nextFloat();
                if(op =='+'){
                    ans = num1 + num2;
                }
                if(op =='-'){
                    ans = num1 - num2;
                }
                if(op =='*'){
                    ans = num1 * num2;
                }
                if(op =='%'){
                    ans = num1 % num2;
                }
                if (op =='/'){
                    if(num2 ==0){
                        System.out.println("number cant be divided with zero");
                    }
                    ans = num1 / num2;
                }

            }
            else if (op =='x' || op =='X'){
                break;
            }
            else{
                System.out.println("invalid statement");
            }
            System.out.println("Answer is "+ ans);
        }

    }
}
