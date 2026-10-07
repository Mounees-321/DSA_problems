class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int glen =  Integer.MAX_VALUE;
        int l = 0 , r = 0;
        long run_sum = 0;
          while (r < nums.length) {

             run_sum += nums[r];
            r++;

             while (run_sum >= target) {
                glen = Math.min(glen, r - l);
                run_sum -= nums[l];
                l++;
            }
        }
                return glen == Integer.MAX_VALUE ? 0 : glen;


     }
}