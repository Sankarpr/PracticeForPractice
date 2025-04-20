package loopPack;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number that we want to reverse: ");
        int n=sc.nextInt();
        int rem=0;
        while(n > 0)
        {
            rem = n % 10;//otherwqay to do is rem =(rem*10 + n%10)
            System.out.print(rem);
            n=n/10;
        }

    }
}
