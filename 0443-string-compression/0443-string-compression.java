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
                    String count = String.valueOf(cur_cnt);

                for (char c : count.toCharArray()) {
                    chars[left++] = c;
}
                }
                fix = j;
                cur_cnt=1;
            }
        }

        chars[left++] = chars[fix];
                
                if(cur_cnt>1)
                {  String count = String.valueOf(cur_cnt);

                    for (char c : count.toCharArray()) {
                        chars[left++] = c;
}
                }
        return left;
    }
}