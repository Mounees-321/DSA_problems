class Solution {
    public int maxArea(int[] ht) {
            int l =  0 , h = ht.length - 1;
            int maxA = 0;

            while(l<h)
            {
                int curA = (h-l)*(Math.min(ht[l],ht[h]));

                if(ht[h]<=ht[l])
                {
                    h--;
                }
                else
                {
                    l++;
                }

                maxA  = Math.max(curA,maxA);
            }
            return maxA;
    }
}