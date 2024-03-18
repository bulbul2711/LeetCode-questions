class Solution {
    public int minimumDeletions(String word, int k) {
        Map<Character, Integer> f = new HashMap<>();
        for (char ch : word.toCharArray()) {
            f.put(ch, f.getOrDefault(ch, 0) + 1);
        }
        List<Integer> freq = new ArrayList<>(f.values());
        Collections.sort(freq, Collections.reverseOrder());
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < freq.size(); ++i) {
            int target = freq.get(i);
            int del = 0;
            for (int x : freq) {
                if (x > target + k){
                    del += x - (target + k);
                } 
                else if (x < target) {
                    del += x;
                }
            }
            min = Math.min(min, del);
            if (min == 0) {  
                break;
            }
        }
        return min != Integer.MAX_VALUE ? min : 0;
    }
}