class Solution:
    def soupServings(self, n: int) -> float:
        if n >= 5000:
             return 1.0
        
        n = ceil(n/25)

        ops = [(4,0),(3,1),(2,2),(1,3)]
        memo = {}

        def dp(a,b):
            if (a,b) in memo:
                return memo[(a,b)]
            if a<=0 and b<=0:
                return 0.5
            
            if a<=0:
                return 1
            
            if b<=0:
                return 0
            
            
            ans = 0
            for (x,y) in ops:
                ans+= dp(a-x,b-y)

            memo[(a,b)] = ans/4
            
            return memo[(a,b)]
        
        return dp(n,n)

                
            