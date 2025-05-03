package pattern;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row value: ");
        int r=sc.nextInt();
        System.out.println("Enter the column Value: ");
        int c= sc.nextInt();
        for (int i=0;i<=r; i++)
        {
            for (int j=0; j<=c; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
