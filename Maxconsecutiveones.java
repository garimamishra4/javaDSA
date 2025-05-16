// Given a binary array nums,return the maximum number of consecutive 1's in the array. 
public class Maxconsecutiveones
{
     static int Findmax(int[] nums)
    {
      int maxcount = 0;
      int count = 0;
      for(int i =0; i<nums.length ; i++)
      {
        if(nums[i] == 1)
        {
            count+=1;
            if(maxcount<count)
            {
            maxcount = count;
            }
        }
        else {count=0;}
      }
     return maxcount;
    }

    public  static void main(String[] args)
    {
        int[] arr = {1,1,0,1,1,1};
        int result =  Findmax(arr);
        System.out.print(result);
    }
}
