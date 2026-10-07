class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         int glen = Integer.MAX_VALUE;
        int l = 0, r = 0;
        long run_sum = 0;

       while(r < nums.length || run_sum >= target) {

            if (run_sum >= target) {
                glen = Math.min(glen, r - l);
                run_sum -= nums[l];
                System.out.println(run_sum + " l : " + l + " , r : " + r + " lo " + glen);
                l++;
            }
            else if (r < nums.length) {
                System.out.println("runs : " + run_sum);
                run_sum += nums[r];
                r++;
            }
        }

        return glen == Integer.MAX_VALUE ? 0 : glen;}
}