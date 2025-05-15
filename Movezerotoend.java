 // move all zeros from given array to it's end while maintaing the relative order.
 import java.util.*;

 public class Movezerotoend
 {
    static void pushZeros(int[] arr)
    {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]!=0)
            temp[j++] = arr[i];
        }
        while(j<n)
        {
          temp[j++] = 0;
        }
        for(int i=0; i<n;i++)
        {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,0,4,3,0,5,0};
        pushZeros(arr);
        for(int num : arr)
        {
            System.out.println(num + " ");
        }
    }
 } 
