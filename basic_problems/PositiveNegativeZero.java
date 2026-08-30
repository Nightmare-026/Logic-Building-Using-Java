// Problem : Check whether a number is positive, negative, or zero.

package basic_problems;
import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        float num = sc.nextFloat();

        // Using if else statement 
        if(num == 0){
            System.out.println(0 + " is neither positive or negative number.");
        } else if(num > 0){
            System.out.println(num + " is a positive number.");
        } else{
            System.out.println(num + " is a negative number.");
        }

        sc.close();
    }   
}
