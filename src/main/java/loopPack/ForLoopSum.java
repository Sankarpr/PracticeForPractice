package loopPack;

import java.util.Scanner;

public class ForLoopSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter and Number: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum total is: "+sum);
    }
}
