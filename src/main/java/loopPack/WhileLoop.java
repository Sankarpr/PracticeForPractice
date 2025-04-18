package loopPack;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        // Initialize counter
        int num = 1;

        // Use while loop to print numbers from 1 to n
        System.out.println("First " + n + " numbers are:");
        while (num <= n) {
            System.out.println(num + " ");
            num++;
        }

        scanner.close();
    }
}
