package main.basic_exercise;
/*
Write a Java program that takes two numbers as input and display the product
of two numbers
 */

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number:");
        int a = sc.nextInt();
        System.out.println("Input the second number");
        int b = sc.nextInt();
        int result = a*b;
        System.out.println("The sum of two number is: " + result);
    }
}
