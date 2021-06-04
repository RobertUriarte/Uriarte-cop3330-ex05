/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Robert Uriarte
 */

import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args){ //Program to print add, subtract, multiply, and divide two numbers
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the first number? ");
        int first = scan.nextInt();
        System.out.print("What is the second number? ");
        int second = scan.nextInt();

        System.out.println(first + " + " + second + " = " + (first+second));
        System.out.println(first + " - " + second + " = " + (first-second));
        System.out.println(first + " * " + second + " = " + (first*second));
        System.out.print(first + " / " + second + " = " + (first/second));
    }
}
