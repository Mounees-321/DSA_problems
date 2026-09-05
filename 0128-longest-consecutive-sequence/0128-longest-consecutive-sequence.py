class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        a = set()
        for i in nums:
                a.add(i)

        best = 0
    
        for j in a:
            if j-1 not in a:
                cur = j
                tb = 0
                while cur in a:
                    print(cur)
                    cur = cur+1
                    tb = tb+1
                
                best = max(best,tb)
        return best


        