package loopPack;

public class WhileUsingPrintNumbers {
    public static void main(String[] args) {
        int num=1;
        while(num <= 50)
        {
            num++;
            if(num%3==0)
            {
                continue;
            }
            System.out.println(num);
            //num ++;
        }
    }
}
