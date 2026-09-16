class Solution {
    public String longestCommonPrefix(String[] strs) {

        int i=0;
        StringBuffer s = new StringBuffer("");
        int len = strs.length;

        while(i<strs[0].length())
        {
            char l = strs[0].charAt(i);
            for(int j=1;j<len; j++)
            {
                if(strs[j].length()<=i ||  strs[j].charAt(i)!=l)
                {
                    return s.toString();
                }
            }
            i++;
            s.append(l);
        }
        return s.toString();
        
    }
}