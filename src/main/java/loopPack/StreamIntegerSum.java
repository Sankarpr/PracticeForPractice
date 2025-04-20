package loopPack;

import java.util.Scanner;

public class StreamIntegerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Xnum = sc.nextInt();
        int sum = 0;
        while (Xnum != -1) {
            sum = Xnum + sum;
            Xnum = sc.nextInt();
        }
        System.out.println(sum);
    }
}