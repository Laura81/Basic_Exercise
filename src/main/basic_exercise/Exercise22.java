package main.basic_exercise;
/*
Write a Java program to compute the distance between two points on the surface of earth.
Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers
Input Data:
Input the latitude of coordinate 1: 25
Input the longitude of coordinate 1: 35
Input the latitude of coordinate 2: 35.5
Input the longitude of coordinate 2: 25.5
Expected Output

The distance between those points is: 1480.0848451069087 km
 */

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the latitude of coordinate 1: ");
        double lat1 = input.nextDouble();
        System.out.println("Input the longitude of coordinate 1: ");
        double long1 = input.nextDouble();
        System.out.println("Input the latitude of coordinate 2: ");
        double lat2 = input.nextDouble();
        System.out.println("Input the longitude of coordinate 2: ");
        double long2 = input.nextDouble();
        System.out.print("The distance between those points is: " + distance(lat1,long1,lat2,long2)+" km\n");
    }

    public static double distance(double lat1,double long1,double lat2,double long2){
        lat1=Math.toRadians(lat1);
        long1=Math.toRadians(long1);
        lat2=Math.toRadians(lat2);
        long2=Math.toRadians(long2);

        double earthRadius = 6371.01;
        return earthRadius * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(long1 - long2));
    }
}
