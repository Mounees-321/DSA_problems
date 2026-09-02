class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
          

        
        res = 0
        j = 0
        for i in columnTitle[::-1]:
            res = res + ((26**j)*(ord(i)-65+1))
            j = j+1
        
        return res

               
        

        