package loopPack;

import java.util.Scanner;

public class OddEvenSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                sum1 -= i;
            }
            else {
                sum1 += i;
            }

        }
        System.out.println(sum1);
    }
}
