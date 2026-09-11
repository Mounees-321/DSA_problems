class Solution {
public:
    bool isPerfectSquare(int num) {
      
        int l = 1, r = num, m; 
        
        while(l<=r)
        {
            m = l + (r-l)/2;
            if((long long)m*m==num)
            {
                return true;
            }
            else if((long long)m*m>num)
            {
                r = m-1;
            }
            else
            {
                l = m+1;
            }
        }
        return false;
    }
};
 

