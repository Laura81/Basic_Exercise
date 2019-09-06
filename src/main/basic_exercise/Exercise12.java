package main.basic_exercise;
/*
Write a Java program that takes "n" numbers as input to calculate and print the average of the numbers
 */

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int limit;
        int count = 0;
        int number;
        double sum = 0;
        System.out.println("Enter total number:");
        limit = sc.nextInt();

        while (count<limit){
            System.out.println("Enter the number:" + (count+1));
            number=sc.nextInt();
            sum = sum+number;
            count++;
        }
        double avg=sum/limit;
        System.out.println("The average is: " + avg);
    }
}
