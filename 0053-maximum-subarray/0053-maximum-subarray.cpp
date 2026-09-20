class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int res = nums[0];
        int tot = 0;

        for(auto i : nums)
        {
            if(tot<0)
                tot=0;
            
            tot+=i;
            res=max(tot,res);
        }
        return res;
    }
};