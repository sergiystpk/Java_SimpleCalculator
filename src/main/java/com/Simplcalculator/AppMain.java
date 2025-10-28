package com.Simplcalculator;

import java.util.Scanner;

public class AppMain {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
      float a = sc.nextFloat();
        System.out.println("Enter the operation (+,-,*,/");
        char operation = sc.next().charAt(0);
        System.out.println("Enter second number");
        float b = sc.nextFloat();


        if (operation == '+') {

        float result = a + b;
        System.out.println(a + " + " + b + " = " + result);

        } else if (operation == '-') {

           float result = a - b;
            System.out.println(a + " - " + b + " = " + result);

        } else if (operation == '*') {

            float result = a * b;
            System.out.println(a + " * " + b + " = " + result);

        } else if (operation == '/') {

            float result = a / b;
            System.out.println(a + " / " + b + " = " + result);

        } else{
            System.out.println("The specified operation is not supported by the calculator");
        }

    }

}
