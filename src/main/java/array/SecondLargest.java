package array;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.Integer.MIN_VALUE;

public class SecondLargest {
    public static int getSecondLargest(int[] arr)
    {
        int ans=0;
        if(arr.length < 2)
        {
            System.out.println(-1);
        }
        int largest=MIN_VALUE;
        int secondLargest=MIN_VALUE;

        for(int array : arr)
        {
            if(array > largest)
            {
                secondLargest = largest;
                largest=array;
                
            } else if (array > secondLargest && array != largest) {
                secondLargest=array;
            }

        }
        return (secondLargest == MIN_VALUE)? -1: secondLargest;
    }
    public static void main(String[] args) {
        int[] arr={3,56,78,90,12};
        getSecondLargest(arr);
        System.out.println(Arrays.toString(new int[]{getSecondLargest(arr)}));


    }
}
