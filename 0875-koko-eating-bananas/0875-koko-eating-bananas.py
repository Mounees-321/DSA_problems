def is_ok(piles, k, h):
    hr_cnt = 0

    for i in piles:
        hr_cnt += (i + k - 1) // k

        if hr_cnt > h:
            return False

    return True
class Solution:
    
    def minEatingSpeed(self, piles: list[int], h: int) -> int:
        max_ = 0
        for i in piles:
            max_ = max(max_,i)
        
        low = 1 
        high = max_
        res = max_
        while(low<high):
            mid = (low+high)//2
            print(low, " " , high, " " , mid)
            if(is_ok(piles,mid,h)):
                print("True")
                res = mid
                high = mid
            else:
                print("false")
                low = mid+1
        return res
        
 