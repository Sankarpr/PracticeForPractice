package loopPack;

import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter natural number: ");
        int n = sc.nextInt();

        int sum = 0;
        int count = 1;

        // Use while loop to calculate sum
        while (count <= n) {
            sum += count;
            count++;
        }

        System.out.println("The sum of "+n+" natural numbers are given below: ");
        System.out.println(sum);
        sc.close();
    }
}
