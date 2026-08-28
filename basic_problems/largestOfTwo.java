// Problem : Compare two numbers and print the larger one.

package basic_problems;

import java.util.Scanner;

public class largestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        float num1 = sc.nextFloat();
        System.out.print("Enter second number : ");
        float num2 = sc.nextFloat();
        if(num1 == num2){
            System.out.println("Both are equal.");
            return;
        }

        // // Using Ternary Operator
        // float result = (num1 > num2) ? num1 : num2;
        // System.out.println(result + " is greater.");

        // Using if else
        if(num1 > num2){
            System.out.println(num1 + " is greater.");
        } else{
            System.out.println(num2 + " is greater.");
        }


        sc.close();
    }
}
