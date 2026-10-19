class Solution {
    public int[][] merge(int[][] iv) {
        if (iv == null || iv.length <= 1) {
            return iv;
        }
        
        // Sort by start time
        Arrays.sort(iv, (a, b) -> Integer.compare(a[0], b[0]));
        
        // Use ArrayList<int[]> instead of ArrayList<ArrayList<Integer>>
        ArrayList<int[]> mg = new ArrayList<>();
        
        // Add first interval
        mg.add(new int[]{iv[0][0], iv[0][1]});
        
        // Merge intervals
        for (int i = 1; i < iv.length; i++) {
            int[] last = mg.get(mg.size() - 1);
            int[] current = iv[i];
            
            if (current[0] <= last[1]) {
                // Overlapping - merge
                last[1] = Math.max(last[1], current[1]);
            } else {
                // Non-overlapping - add new
                mg.add(new int[]{current[0], current[1]});
            }
        }
        
        // Convert to int[][]
        return mg.toArray(new int[mg.size()][]);
    }
}