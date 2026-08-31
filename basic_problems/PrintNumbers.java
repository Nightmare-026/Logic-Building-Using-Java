// Problem : Print all numbers from 1 to N using a loop.

package basic_problems;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        System.out.println("Numbers from 0 to N are : ");
        if(n < 0){
            for(int i = 0; i >= n; i--){
                System.out.println(i);
            }
        } else {
            for(int i = 0; i <= n; i++){
            System.out.println(i);
        }
        }
        sc.close();
    }
}
