class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curm = 0 , tm = 0 , i= 0;
        while(i<nums.length)
        {
            if(nums[i]!=1)
            {
                tm = Math.max(tm,curm);
                curm = 0;
            }
            else
            {
                curm++;
            }
            
            i++;
        }
        return Math.max(tm,curm);
    }
}