package main.basic_exercise;
/*
Write a Java program to create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
Expected Output
123
124
...
431
432
Total number of the three-digit-number is 24
 */
public class Exercise25 {
    public static void main(String[] args) {

        int amount=0;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                for(int k=1; k<=4; k++){
                    if(i!=j && i!=k && j!=k){
                        amount++;
                        System.out.println(i+""+j+""+k);
                    }
                }
            }
        }
        System.out.println("The total number of the three-digit-number is: " +amount);
    }
}
