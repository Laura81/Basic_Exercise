package main.basic_exercise;
/*
Write a Java program to compute the area of a hexagon.
Area of a hexagon = (6 * s^2)/(4*tan(π/6)) where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output
The area of the hexagon is: 93.53074360871938
 */

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        System.out.println("Input the lenght of a side of an hexagon: ");
        Scanner input = new Scanner(System.in);
        double s = input.nextDouble();
        System.out.print("The area of the hexagon is: " + hexagonArea(s)+"\n");
    }

    public static double hexagonArea(double s){
        return (6 * s*s)/(4 * Math.tan(Math.PI/6));
    }
}
