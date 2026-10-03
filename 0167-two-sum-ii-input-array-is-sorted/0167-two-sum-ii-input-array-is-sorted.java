class Solution {
    public int[] twoSum(int[] nu, int target) {
        int l = 0 , h  = nu.length-1;

        while(l<=h)
        {
            int temp = nu[l]+nu[h];
            if(temp==target)
            {
                return new int[]{l+1,h+1};
            }
            else if(temp<target)
            {
                l++;
            }
            else
            {
                h--;
            }
        }
        return new int[]{};
    }
}