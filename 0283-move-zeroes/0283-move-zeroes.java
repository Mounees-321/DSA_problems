class Solution {
    public void moveZeroes(int[] nums) {
        int zp = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]!=0)
            {
                int temp  = nums[zp];
                nums[zp] = nums[i];
                nums[i] = temp;
                zp++;
            }
        }
        
    }
}