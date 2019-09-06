package main.basic_exercise;
/*
Write a Java program to print the sum of two numbers
 */

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number:");
        int num1 = sc.nextInt();
        System.out.println("Input the second number:");
        int num2 = sc.nextInt();
        System.out.println("The sum of the two numbers is: " + (num1+num2));
    }
}
