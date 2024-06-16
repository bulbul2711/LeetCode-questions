class Solution {
    public long countCompleteDayPairs(int[] hours) {
         Map<Integer, Integer> map = new HashMap<>();
        for (int hour : hours) {
            int rem = hour % 24;
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        long res = 0;
        for (int r = 0; r < 24; r++) {
            if (map.containsKey(r)) {
                long f = map.get(r);
                if (r == 0 || r == 12) {
                    res += (long)(f * (f - 1) / 2);
                } 
                else if (r < 12) {
                    int c = 24 - r;
                    if (map.containsKey(c)) {
                        res += (long)(f * map.get(c));
                    }
                }
            }
        }
        return res;
    }
}