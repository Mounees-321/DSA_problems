class Solution {
    public int lengthOfLongestSubstring(String s) {
        int los = 0;
        int r = 0,sl = 0;
        HashSet<Character>mp = new HashSet<>();
        while(r<s.length())
        {
            while(mp.contains(s.charAt(r)))
            {
                mp.remove(s.charAt(sl));
                sl++;
                
            }
            mp.add(s.charAt(r++));
            los = Math.max(los,r-sl);
        }
        return los;
        
    }
}