class Solution {
    public int numSquares(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return helper(n, map);
    }

    public int helper(int n, HashMap<Integer, Integer> map) {
        if (n <= 0) return 0;
        if (map.containsKey(n)) return map.get(n);

        int result = Integer.MAX_VALUE;
        int num = 1;

        while (num * num <= n) {
            result = Math.min(result, 1 + helper(n - (num * num), map));
            num++;
        }

        map.put(n, result);
        return result;
    }
}