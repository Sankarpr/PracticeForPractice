package pattern;

import java.util.Scanner;

public class UpDownTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row Value: ");
        int r=sc.nextInt();
        for (int i=1; i<=r; i++)//i=r;i>=1;i--
        {
            for (int j=1; j<=((r+1)-i); j++)//j=1;j<=i;j++u
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
