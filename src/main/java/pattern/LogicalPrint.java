package pattern;

import java.util.Scanner;

public class LogicalPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and column you wanted: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if((i+j) % 2==0)
                {
                    System.out.print(1);
                }
                if((i+j)%2==1)
                {
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }
}
