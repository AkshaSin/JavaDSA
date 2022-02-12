package com.Akshat;

import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Family = input.next();
        switch (Family) {
            case "Akshat" -> System.out.println("smart boi");
            case "Akshansh" -> System.out.println("dumbass");
            case "Ajit" -> System.out.println("F.A.T.H.E.R.");
            case "Rajni" -> System.out.println("mom B)");
            default -> System.out.println("you aint family bitch");

        }
    }
}
