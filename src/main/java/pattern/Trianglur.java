package pattern;

import java.util.Scanner;

public class Trianglur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row Value: ");
        int r=sc.nextInt();
        System.out.println("Enter the column value: ");
        int c= sc.nextInt();

        for(int i=1; i<=r; i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
