class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length/2;
        int res=0;
        for(int i:nums)
        {
            int val =  map.getOrDefault(i, 0);

            map.put(i,val+1);
             if(val+1>n)
            {
                res = i;
                break;
            }
            
        } 
        return  res;
    }
}