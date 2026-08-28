class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();

        int j = 0;
        for(int i:nums)
        {
            int cur = target-i;
            if(mp.containsKey(cur))
            {
                return new int[]{j,mp.get(cur)};
            }

            mp.put(i,j);
            j++;

        }
        return new int[]{};
    }
}