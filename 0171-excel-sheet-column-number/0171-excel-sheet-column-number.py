class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        alp = {}
        for i in range(0,26):
                alp[chr(ord('A') + i)] = i + 1
                print(alp[chr(ord('A') + i)])

        
        res = 0
        j = 0
        for i in columnTitle[::-1]:
            res = res + ((26**j)*alp[i])
            j = j+1
        
        return res

               
        

        