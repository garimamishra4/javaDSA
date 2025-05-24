//provide the sum of maximum consecutively occuring ones in an array
//leetcode solution

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxcount=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count+=1;
            }
            else
            {
                count = 0;
                }
                maxcount = Math.max(maxcount,count);


        }
        return maxcount;
    }
}
