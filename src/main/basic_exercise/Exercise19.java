package main.basic_exercise;

import java.util.Scanner;

/*
Write a Java program and compute the sum of the digits of an integer.
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7
 */
public class Exercise19 {
    public static void main(String[] args) {
        System.out.println("Input the number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("The sum of the digits is: " + sumDigits(number));
    }

    public static int sumDigits(int number){
        int sum = 0;
        while (number != 0){
            sum += number % 10;
            number /=10;
        }
        return sum;
    }
}
