class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cnt = 0;
        for(int i=0; i<n;i++)
        {
            int run_sum = 0;
            for(int j=i; j<n; j++)
            {
                run_sum+=nums[j];
                if(run_sum==k)
                    cnt++;
                
                
            }
        }
        return cnt;
    }
}