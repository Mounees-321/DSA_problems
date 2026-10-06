class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> mp =new HashMap<>();

        int l = 0, r = 0 , gm  = 0 , mx = 0;
        while(r<s.length())
        {
            mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)+1);
            mx = Math.max(mx, mp.get(s.charAt(r)));

            while(((r-l+1)-mx)>k)
            {
                 mp.put(s.charAt(l),mp.get(s.charAt(l))-1);
                l++;
            }
            gm = Math.max(gm,r-l+1);
            r++;
        }
        return gm;
    }
}