package main.basic_exercise;
/*
Write a Java program to count the letters, spaces, numbers and other characters of an input string.
Expected Output
The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23
space: 9
number: 10
other: 6
 */
import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        String test=input.nextLine();
        int letter=0;
        int space=0;
        int number=0;
        int other=0;
        for(int i=0; i<test.length();i++){
            if(Character.isLetter(test.charAt(i))){
                letter++;
            }
            else if(Character.isSpaceChar(test.charAt(i))){
                space++;
            }
            else if(Character.isDigit(test.charAt(i))) {
                number++;
            } else{
                other++;
            }
        }
        System.out.println("The string is: " + test);
        System.out.println("letters: "+letter);
        System.out.println("spaces: "+space);
        System.out.println("numbers: "+number);
        System.out.println("other: "+other);
    }
}
