package main.basic_exercise;
/*
Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
 */

import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the width: ");
        double width = input.nextDouble();
        System.out.println("Input the height: ");
        double height = input.nextDouble();
        double area = width*height;
        double perimeter = 2 * (width+height);
        System.out.println("area = "+  area);
        System.out.println("perimeter = "+  perimeter);

    }




}
