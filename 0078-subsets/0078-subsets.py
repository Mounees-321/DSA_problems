class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res,sol = [],[]
        n = len(nums)

        def back(i):
            if i==n:
                res.append(sol[:])
                return 
            
            back(i+1)
            sol.append(nums[i])
            back(i+1)
            sol.pop()
        
        back(0)
        return res

        