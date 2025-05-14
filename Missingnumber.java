import java.util.*;

 public class Missingnumber
 {
    public static void main(String[] args)
    {
        System.out.println("enter array size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {0,3,2};
        int sum = (n*(n+1))/2;
        int s = 0;
        for(int i = 0; i< arr.length ; i++)
        {
            s += arr[i];
        }
        int missingnumber = sum - s;
        System.out.println(missingnumber);
    }
 }
