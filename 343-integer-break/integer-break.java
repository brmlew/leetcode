class Solution {
    public int integerBreak(int n) {
        if (n == 2) return 1;
        if (n==3) return 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        return helper(n, map);
    }

    public int helper(int n, HashMap<Integer, Integer> map) {
        if (n == 1) return 1;
        if (map.containsKey(n)) return map.get(n);
        int result = n;

        int i = 1;
        while (i < n) {
            result = Math.max(result, i * helper(n-i, map));
            i++;
        }
        map.put(n, result);
        return result;
    }
}