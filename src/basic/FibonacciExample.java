package basic;

import java.util.Scanner;

public class FibonacciExample {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask the user for the number of terms
            System.out.print("Enter the number of terms for the Fibonacci series: ");
            int n = scanner.nextInt();

            // Variables to store the first two terms
            int first = 0, second = 1;

            System.out.println("Fibonacci Series:");

            // Print the series
            for (int i = 0; i <= n; i++) {
                System.out.print(first + " ");

                // Calculate the next term
                int next = first + second;
                first = second;
                second = next;
            }
        }


}
