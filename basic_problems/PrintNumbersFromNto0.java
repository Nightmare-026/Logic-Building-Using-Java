package basic_problems;
import java.util.Scanner;

public class PrintNumbersFrom0toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        if(n < 0){
            for(int i = n; i <= 0; i++){
                System.out.println(i);
            }
        }
        for(int i = n; i >= 0; i--){
            System.out.println(i);
        }
        sc.close();
    }
}
