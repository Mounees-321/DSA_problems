class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i=n-2;
        while ((i>=0) && nums[i+1]<=nums[i])
        {
            i--;
        }
        if(i>=0)
        {
            int j = n-1;
            while(nums[i]>=nums[j])
            {
                j--;
            }
            int temp = nums[j];
            nums[j] =nums[i];
            nums[i] = temp;
        }

i = i+1;
int j = n-1;
while (i < j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;

    i++;
    j--;
}
        
    }
}