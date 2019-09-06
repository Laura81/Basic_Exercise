package main.basic_exercise;

import java.util.Scanner;

/*
Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39
25 < 39
25 <= 39
 */
public class Exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int num1 = input.nextInt();
        System.out.println("Input the second number: ");
        int num2 = input.nextInt();

        if (num1 == num2){
            System.out.printf("%d == %d\n", num1, num2);
        }
        if (num1 != num2){
            System.out.printf("%d != %d\n", num1, num2);
        }
        if (num1 > num2){
            System.out.printf("%d >%d\n", num1, num2);
        }
        if (num1 < num2){
            System.out.printf("%d < %d\n", num1, num2);
        }
        if (num1 <= num2){
            System.out.printf("%d <= %d\n", num1, num2);
        }
        if (num1 >=num2){
            System.out.printf("%d >= %d\n", num1, num2);
        }
    }
}
