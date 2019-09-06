package main.basic_exercise;
/*
Write a Java program to swap two variables.
 */

import java.util.Scanner;

public class Exercise15a {
    public static void main(String[] args) {
        System.out.println("Input the a variable: ");
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        System.out.println("Input the b variable: ");
        int b = input.nextInt();
        System.out.println("Variable a= " +a + "," + "Variable b = " +b);
        int temp;

        temp= a;
        a = b;
        b= temp;
        System.out.println("Variables after switch" + "\n a = " + a + "\n " + "b = " + b);

    }
}
