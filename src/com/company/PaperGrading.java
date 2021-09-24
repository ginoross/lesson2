package com.company;

import java.util.Scanner;

public class PaperGrading {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Boolean quit = false;
        int maxMark = 0;

        System.out.println("Please enter the maximum mark: ");
        maxMark = input.nextInt();

        while (!quit) {
            int paperMark = 0;

            do {
                System.out.println("Please enter the student's mark: ");
                paperMark = input.nextInt();

            } while (paperMark > maxMark);

            double stuPercent = (double) paperMark / maxMark;
            if (stuPercent > 0.79) {
                System.out.println('A');
            } else {
                if (stuPercent > 0.69) {
                    System.out.println('B');
                } else {
                    if (stuPercent > 0.59) {
                        System.out.println('C');
                    } else {
                        if (stuPercent > 0.49) {
                            System.out.println('D');
                        } else {
                            if (stuPercent > 0.39) {
                                System.out.println('E');
                            } else {
                                System.out.println('U');
                            }

                        }

                    }
                }
            }

        }
    }
}
