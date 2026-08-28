// Problem : Compare three numbers and print the largest among them.

package basic_problems;

import java.util.Scanner;

public class largestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        float num1 = sc.nextFloat();
        System.out.print("Enter second number : ");
        float num2 = sc.nextFloat();
        System.out.print("Enter third number : ");
        float num3 = sc.nextFloat();

        // // Using ternary operator - method 1
        // float result = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3) ? num2 : num3;
        // System.out.println(result + " is largest number.");

        // // Using ternary operator - method 2
        // float result = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : (num2 > num3) ? num2 : num3;
        // System.out.println(result + " is largest number.");

        // // Using if else and logical operators
        // if(num1 > num2 && num1 > num3){
        //     System.out.println(num1 + " is largest number.");
        // } else if(num2 > num3){
        //     System.out.println(num2 + " is largest number.");
        // } else{
        //     System.out.println(num3 + " is largest number");
        // }

        if(num1 > num2){
            if(num1 > num3){
                System.out.println(num1 + " is largest number.");
            } else{
                System.out.println(num3 + " is largest number.");
            }
        } else if(num2 > num3){
            System.out.println(num2 + " is largest number.");
        } else{
            System.out.println(num3 + " is largest number.");
        }

        sc.close();
    }
}
