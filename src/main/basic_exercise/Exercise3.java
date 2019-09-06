package main.basic_exercise;
/*
Write a Java program to divide two numbers and print on the screen.
 */

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number:");
        double num1 = sc.nextDouble();
        System.out.println("Input the second number:");
        double num2 = sc.nextDouble();
        double div=num1/num2;
        System.out.println("The division of two numbers is: " + div);
    }
}
