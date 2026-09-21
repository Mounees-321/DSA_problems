class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();

        int[] pf = new int[nums.length];
        pf[0] = nums[0];
        for(int i=1; i<nums.length; i++)
        {
            pf[i] = nums[i]+pf[i-1];
        }

         for(int i=0; i<nums.length; i++)
        {
            if(pf[i]==k)
                cnt++;
            if(mp.containsKey(pf[i]-k))
            {
                cnt+=mp.get(pf[i]-k);
            }

            mp.put(pf[i],mp.getOrDefault(pf[i],0)+1);
        }
        return cnt;     
    }
}