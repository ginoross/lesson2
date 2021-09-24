package com.company;

import java.util.Scanner;

public class EmployeePay {

    public static void main(String[] args) {

        final double Tax = 0.8;
        final int MaxHours = 45;

        int HoursPay = 0;
        float PreTaxPay = 0;
        double PostTaxPay = 0;

        Scanner input = new Scanner(System.in);


        System.out.println("What is your name: ");
        String EmployeeName = input.next();

        System.out.println("How many hours have you worked: ");
        int EmployeeHours = input.nextInt();

        System.out.println("What is your hourly wage: ");
        float EmployeeWage = input.nextFloat();

        if (EmployeeHours > MaxHours) {
            HoursPay += ((EmployeeHours - MaxHours * 1.5) + MaxHours);
            System.out.println("The person should recieve pay for " + HoursPay + " hours of work.");
        }
        else {
            HoursPay = EmployeeHours;
            System.out.println("The person should recieve pay for " + HoursPay + " hours of work.");
        }
        PreTaxPay = HoursPay*EmployeeWage;
        PostTaxPay = PreTaxPay*Tax;

        System.out.println("The amout that the employee should recieve pre tax is "+PreTaxPay+" and after tax this would be "+PostTaxPay);

        //Return and do rounding
    }
}
