package main.basic_exercise;
/*
Write a Java program to print the area and perimeter of a circle.
 */

import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce the radius:");
        double radius = sc.nextDouble();

        double perimeter = 2*Math.PI*radius;
        double area = Math.PI*radius*radius;

        System.out.println("The perimeter is: " + perimeter);
        System.out.println("The area is: " + area);
    }
}
