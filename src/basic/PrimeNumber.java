package basic;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int temp = 0;
        System.out.println("Enter the number");
        int num = s.nextInt();
        for(int i=2; i<=num-1; i++) {
            if (num % i == 0) {
                temp = temp + 1;
            }
        }
            if(temp>0){
                System.out.println(num + " is a not prime");
            }
            else{
                System.out.println(num+ " is prime");
            }
    }
}
