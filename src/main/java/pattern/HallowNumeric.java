package pattern;

import java.util.Scanner;

public class HallowNumeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row: ");
        int r=sc.nextInt();
        //System.out.println("Enter column: ");
       // int c = sc.nextInt();
        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=r; j++)
            {
                if (i==1 || j==1 || j==r|| i==r)
                {
                    System.out.print(j);
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
