// Problem : Swap two numbers using XOR operator

package basic_problems;
import java.util.Scanner;

public class SwapUsingXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("After swapping first number = " + num1 + " second number = " + num2);
        sc.close();

    }
}
