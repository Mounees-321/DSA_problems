class Solution {
    public int trap(int[] height) {
        int lmx = 0, rmx = 0, n = height.length;
        int[] lm = new int[n];
        int[] rm = new int[n];

        for (int i = 0; i < n; i++) {
            lm[i] = lmx;
            lmx = Math.max(lmx, height[i]);

            rm[n - i - 1] = rmx;
            rmx = Math.max(rmx, height[n - i - 1]);

        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            int mi = Math.min(lm[i], rm[i]);
            if (mi - height[i] > 0) {
                res += mi - height[i];
            }

        }

        return res;
    }
}