class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ls =  new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);
        for(int i=0; i<n-2; i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int tg  =-nums[i];

            int l = i+1 ,r = n-1;
            while(l<r)
        {
                if(nums[l]+nums[r]==tg)
                {
                    ls.add(Arrays.asList(-tg,nums[l],nums[r]));
                    l++;
                    r--;

                    while(l<r && nums[l]==nums[l-1])
                    {
                        l++;
                    }
                    while(l<r && nums[r]==nums[r+1] )
                    {
                        r--;
                    }
                }
                else if(nums[l]+nums[r]<tg)
                {
                    l++;
                }
                else
                {
                    r--;
                }
            }}
        
        return ls;
        
    }
}

 