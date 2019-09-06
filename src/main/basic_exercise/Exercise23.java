package main.basic_exercise;
/*
Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output

Reverse string: xof nworb kciuq ehT
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        String origin;
        String reverse="";

        Scanner input = new Scanner(System.in);
        System.out.println("Input the original string: ");
        origin = input.nextLine();

        int len=origin.length();

        for(int i=len-1; i>=0; i--){
            reverse=reverse + origin.charAt(i);
        }

        System.out.println("Original string is: "+origin);
        System.out.println("Reverse string is: "+reverse);
    }
}
