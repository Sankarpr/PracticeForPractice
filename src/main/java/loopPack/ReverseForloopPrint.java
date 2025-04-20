package loopPack;

import java.util.Scanner;

public class ReverseForloopPrint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        //for(int i=0; i<=n; n--)//alternate way to write the same program
        for(int i=n; i>=0; i--)
        {
            System.out.println(i);
        }
    }
}
