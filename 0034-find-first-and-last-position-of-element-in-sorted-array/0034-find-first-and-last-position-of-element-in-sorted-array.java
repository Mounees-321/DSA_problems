class Solution {
    public int is_Val(int[] nums,int tg, boolean fl)
    {
        int low = 0 ,high = nums.length-1;
        int res = -1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(nums[mid]==tg)
            {
                res = mid;
                if(fl)
                {
                    high = mid-1;
                }
                else
                {
                    low = mid+1;

                }
            }
            else if(nums[mid]<tg)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;

            }
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        return new int[]{is_Val(nums,target,true),is_Val(nums,target,false)};
    }
}