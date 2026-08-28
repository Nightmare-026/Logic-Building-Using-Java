package basic_problems;

import java.util.Scanner;

public class checkEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Integer : ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is a Even number.");
        } else{
            System.out.println(num + " is an Odd number.");
        }

        sc.close();
    }
    
}
