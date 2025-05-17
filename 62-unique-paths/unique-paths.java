class Solution {
    public int uniquePaths(int m, int n) {
        HashMap<List<Integer>, Integer> map = new HashMap<>();
        return helper(m, n, 0, 0, map);
    }

    public int helper(int m, int n, int i, int j, HashMap<List<Integer>, Integer> map) {
        if (i == m-1 && j == n-1) return 1;
        List<Integer> start = new ArrayList<>();
        start.add(i);
        start.add(j);
        if (map.containsKey(start)) return map.get(start);
        int result = 0;
        if (i < m - 1) {
            result += helper(m, n, i + 1, j, map);
        }
        if (j < n - 1) {
            result += helper(m, n, i, j + 1, map);
        }

        map.put(start, result);
        return result;
    }
}