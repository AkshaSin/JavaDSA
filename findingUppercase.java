package com.Akshat;

import jdk.jshell.Snippet;

import java.util.Scanner;

public class findingUppercase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
        System.out.println(ch +" is lower case ");

        }else{
            System.out.println(ch + " is uppercase");
            }
    }
}
