package loopPack;

import java.util.Scanner;

public class ReverseOrderPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int cnt=0;
        while(cnt <= n)
        {
            System.out.println(n);
            n--;
        }
    }
}
