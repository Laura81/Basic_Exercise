package main.basic_exercise;

import java.util.Scanner;

public class Exercise15b {
    public static void main(String[] args) {

        System.out.println("Input the a variable: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Input the b variable: ");
        int b = input.nextInt();
        System.out.println("Variable a= " + a + "," + "Variable b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Variables after switch" + "\n a = " + a + "\n " + "b = " + b);
    }
}
