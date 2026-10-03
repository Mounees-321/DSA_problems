class Solution {
    public boolean isPalindrome(String s) {
        Boolean fl = true;
        int l = 0, h = s.length()-1;
        s = s.toLowerCase();

 
        while(l<h)
        {
            char c_l = s.charAt(l), c_r = s.charAt(h);
              if (!Character.isLetterOrDigit(c_l)) {
                l++;
                continue;
            }

            if (!Character.isLetterOrDigit(c_r)) {
                h--;
                continue;
            }
               if (c_l != c_r) {
                fl = false;
                break;
            }

            l++;
            h--;

         }

         return fl;
    }
}