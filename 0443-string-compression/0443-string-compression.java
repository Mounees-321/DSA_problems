class Solution {
    public int compress(char[] chars) {
        
        
        int cur_cnt = 1;
        int left = 0;
        int fix = 0;
        for(int j=1; j<chars.length; j++)
        {
            if(chars[fix]==chars[j])
                cur_cnt++;
            else
            {
                chars[left++] = chars[fix];
                
                if(cur_cnt>1)
                {
                    int nod = (int)Math.log10(cur_cnt)+1;
                    int temp = nod;
                    
                    while(nod!=0)
                    {
                        int val = cur_cnt%10;
                        System.out.println("fuck"+(nod+left-1));
                        chars[nod+left-1] = (char)('0' + val);
                        //System.out.println(chars[(nod+left-1)]);
                        cur_cnt/=10;  
                        nod--;
                    }

                    left +=temp;
                }
                fix = j;
                cur_cnt=1;
            }
        }

        chars[left++] = chars[fix];
                
                if(cur_cnt>1)
                {  int nod = (int)Math.log10(cur_cnt)+1;
                    int temp = nod;
                    while(nod!=0)
                    {
                        int val = cur_cnt%10;
                        chars[nod+left-1] = (char)('0' + val);
                        cur_cnt/=10;  
                        nod--;
                    }

                    left +=temp;
                }
        return left;
    }
}