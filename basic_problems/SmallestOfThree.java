// Problem : Compare three numbers and print the smallest among them.

package basic_problems;

import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number : ");
        int num3 = sc.nextInt();

        boolean condition1 = num1 == num2, condition2 = num2 == num3, condition3 = num1 == num3;
        if(condition1 && condition2){
            System.out.println("All numbers are equal to each other.");
            return;
        } else{
            if(num1 < num2){
                if(num1 < num3){
                    System.out.println(num1 + " is the smallest of the three.");
                } else if(condition3){
                    System.out.println(num1 + " and " + num3 + " are the smallest and equal to each other.");
                } else{
                    System.out.println(num3 + " is the smallest of the three.");
                }
            } else if(num2 < num3){
                if(condition1){
                    System.out.println(num1 + " and " + num2 + " are the smallest and equal to each other.");
                } else{
                    System.out.println(num2 + " is smallest of the three.");
                }
            } else if(condition2){
                System.out.println(num2 + " and " + num3 + " are the smallest and equal to each other.");
            } else if(condition3){
                System.out.println(num1 + " and " + num3 + " are the smallest and equal to each other.");
            } else{
                System.out.println(num3 + " is the smallest of the three.");
            }
        }
        sc.close();

    }
}
