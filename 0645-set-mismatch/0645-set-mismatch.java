class Solution {
    public int[] findErrorNums(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int cheat = -1;
        for(int i=0; i<nums.length; i++)
        {
            if (map.containsKey(nums[i])) {
                cheat  = nums[i];
            }   
            else 
            {
                map.put(nums[i], 1);
            }               
        }
        for(int i=1; i<=nums.length; i++)
        {
             if(!map.containsKey(i))
             {
                return new int[]{cheat,i};
             }
        }
        return new int[] {};
    }
}