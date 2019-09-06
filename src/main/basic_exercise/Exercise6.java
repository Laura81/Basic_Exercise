package main.basic_exercise;
/*
Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers
 */

import java.util.Scanner;
/*
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */
public class Exercise6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number:");
        int num1 = sc.nextInt();
        System.out.println("Input the second number:");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        int multyply = num1*num2;
        int substract = num1-num2;
        int divide = num1/num2;
        int rnumb = num1%num2;
       // System.out.printf("Sum=%d\nMultyply=%d\nSubstract=%d\nDivide=%d\nRest=%d\n",sum,multyply,substract,divide,rnumb);
        System.out.println(num1+"+"+num2 + "="+sum+"\n"+num1+"*"+num2 +"="+multyply+"\n"+num1+"-"+num2+"="+substract+"\n"
        +num1+"/"+num2+"="+divide+"\n"+num1+"%"+num2+"="+rnumb);
    }
}
