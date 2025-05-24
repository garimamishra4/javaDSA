 // move all zeros from given array to it's end while maintaing the relative order.
//leetcode solution
 class Movezerotoend {
    public void moveZeroes(int[] nums) {
         int n = nums.length;
        int[] temp = new int[n];
        int j = 0;
        for(int i=0; i<n; i++)
        {
            if(nums[i]!=0)
            temp[j++] = nums[i];
        }
        while(j<n)
        {
          temp[j++] = 0;
        }
        for(int i=0; i<n;i++)
        {
            nums[i] = temp[i];
        }
    }
}
   
