package com.Akshat;

import java.util.Scanner;

public class greetingmsg {
    public static void main(String[] args) {
        Scanner inpuy = new Scanner(System.in);
        System.out.print("WHat is your name? ");
        String a = inpuy.nextLine();
        System.out.println("welcome to java "+ a +"!");
    }
}
