package basic_problems;

import java.util.Scanner;

public class isPalindome {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a Integer to check Palindrome : ");
            int num = sc.nextInt();
            if(num <= 0 && num <= 9){
                System.out.println("Your number is a Palindrome.");
                return;
            }

            int temp = num, rem, palindrome = 0;
            while(temp != 0){
                rem = temp % 10;
                palindrome = palindrome * 10 + rem;
                temp = temp / 10;
            }
            if(num == palindrome){
                System.out.println("Your number is a Palindrome.");
            } else{
                System.out.println("Your number is not a Palindrome.");
            }
        }


}
