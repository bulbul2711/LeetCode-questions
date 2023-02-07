class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] sorted = new Integer[arr.length];
        Arrays.setAll(sorted, i -> arr[i]);
        Arrays.sort(sorted, Comparator.comparingInt(Integer::bitCount).
                            thenComparing(Comparator.naturalOrder()));
        Arrays.setAll(arr, i -> sorted[i]);
        return arr;
    }
}