class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int pf = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        for(int i=0; i<nums.length; i++)
        {
            pf+=nums[i];
            int cur = pf-k;
            if(mp.containsKey(cur))
            {
                res+=mp.get(cur);
            }
            mp.put(pf,mp.getOrDefault(pf,0)+1);
        }
        return res;
    
    }
}