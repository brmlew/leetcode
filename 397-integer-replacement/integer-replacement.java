class Solution {
    public int integerReplacement(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return helper(n, map);
    }

    public int helper(int n, HashMap<Integer, Integer> map) {
        
        if (n == 1) return 0;
        if (map.containsKey(n)) return map.get(n);

        int result = 0;

        if (n % 2 == 0) {
            result = 1 + helper(n/2, map);
        } else {
            if (n == Integer.MAX_VALUE) {
                result = helper(n-1, map);
            } else {
                result = Math.min(1 + helper(n+1, map), 1 + helper(n-1, map));
            }
        }

        map.put(n, result);
        System.out.println("n: " + n + " res: " + result);
        return result;
    }
}