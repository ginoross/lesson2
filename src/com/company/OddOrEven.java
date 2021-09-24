package com.company;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What do you want to be your number: ");
        int Num = input.nextInt();

        if(Num%2 == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }




    }
}

