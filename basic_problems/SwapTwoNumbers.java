// Problem : Swap the values of two variables using a temporary third variable.

package basic_problems;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second value : ");
        int num2 = sc.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping First number = " + num1 + " and Second number = " + num2);
        sc.close();
    }
    
}
