ques - Finding the minimum and maximum element in an array or list? This is a fundamental task.

    sol -

import java.util.*;

public class Minmax
{
    public static void main(String[] args)
    {
        System.out.println("enter array size:");
        Scanner v = new Scanner(System.in);
        int n = v.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements:");
        for(int i=0; i<arr.length;i++)
        {
        arr[i] = v.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for(int i=0; i<arr.length; i++)
        {
           if(arr[i]<min)
           {
            min =arr[i];
           }  
           if(arr[i]>max)
           {
            max = arr[i];
           }
        }
        System.out.println(min);
        System.out.println(max);



    }
}
