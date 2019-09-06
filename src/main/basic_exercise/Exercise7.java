package main.basic_exercise;
/*
Write a Java program that takes a number as input and prints its multiplication
table upto 10
 */

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();

        for(int i=0; i<=10; i++){
            int sum= a*i;
            System.out.println(a + "x" + i+ "="+ sum);
        }
    }
}
