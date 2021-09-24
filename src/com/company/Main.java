package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
       Scanner input = new Scanner(System.in);

        System.out.println("What is your first number: ");
        int firstNum = input.nextInt();

        System.out.println("What is your second number: ");
        int secNum = input.nextInt();

        double total = (double) firstNum / secNum;

        System.out.println(total);

        System.out.println(17 % 5);

        //Code sample 2

        if ((17 % 5) == 0) {
            System.out.println("Number is divisible by 5");
        }
    }
}
