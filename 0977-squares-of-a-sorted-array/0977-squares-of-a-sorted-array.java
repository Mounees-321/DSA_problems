class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0 , j = nums.length-1;
        int[] ar = new int[nums.length];
        int m = j;
        while(m>=0)
        {
            int ip =nums[i]*nums[i] , jp = nums[j]*nums[j];
            if(ip>jp)
            {
                ar[m] = ip;
                i++;
            }
            else
            {
                ar[m] = jp;
                j--;
            }
            m--;

        }

      
       
        return ar;


    }
}