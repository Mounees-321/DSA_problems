from itertools import permutations


class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:

        mp = {}

        for c in s1:
            mp[c] = mp.get(c, 0) + 1

        mp2 = {}
        l = 0
        for r in range(len(s2)):

            if s2[r] in mp:
                mp2[s2[r]] = mp2.get(s2[r], 0) + 1

            if r - l + 1 > len(s1):

                if s2[l] in mp:
                    mp2[s2[l]] -= 1

                    if mp2[s2[l]] == 0:
                        del mp2[s2[l]]
                l+=1
            if mp == mp2:
                return True
        return False
