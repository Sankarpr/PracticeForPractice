package pattern;

import java.util.Scanner;

public class NumericRectPatternNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter R: ");
        int r= sc.nextInt();
        System.out.println("Enter C: ");
        int c= sc.nextInt();
        for(int i=1; i<=r; i++)
        {
            for (int j=1;j<=c;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
