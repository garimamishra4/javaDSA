// given an array nums, return true if the array was originally sorted in non-decresing order, 
// then rotated some number of positions (including zero). otherwise return false.

class ChecksortedArray
{
    static boolean check (int[] nums)
    {
        int k=0; 
        int n =nums.length;
        for(int i= 0; i<n; i++)
        {
            if(nums[i]>nums[(i+1)%n])
            {
                k++;
            }

        }
        if(k>1) return false;
        return true;
    }

    public static void main(String[] args)
    {
        int[] arr = {5,1,2,3,4};
        boolean result = check(arr);
        System.out.print(result);        

    }
}
