

import java.util.*;

 public class ReverseArray
 {
    public static void main(String[] args)
    {
        int[] arr = new int[4];
        System.out.println("enter array elements: ");
        Scanner v = new Scanner(System.in);
        for(int i=0; i<4 ; i++)
        {
            arr[i] = v.nextInt();
        }
        System.out.println("reversed array is : ");
        int start = 0;
        int end = arr.length-1;
        while( start < end) 
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for(int i=0; i<4 ; i++)
        {
            System.out.println(arr[i]);
        }

    }
 }
