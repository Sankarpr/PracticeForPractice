package MatheLogic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact=1;
        if(n==1 || n==0)
        {
            System.out.println(1);
        }
        else {
            for (int i = 2; i <= n; i++) {
                fact=fact*i;
            }
            System.out.println(fact);
        }

    }
}
