class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n = nums.length;
        int sl = 0;

        for(int i=1; i<n; i++)
        {
            if(nums[i]!=nums[sl])
            {
                nums[++sl]=nums[i];
            }
        }
        return sl+1;
    }
}