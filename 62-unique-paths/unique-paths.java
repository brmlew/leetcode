class Solution {
    public int uniquePaths(int m, int n) {
        int[][] area = new int[m][n];

        for (int i = 0; i < m; i++) {
            area[i][n - 1] = 1;
        }

        for (int i = 0; i < n; i++) {
            area[m-1][i] = 1;
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                area[i][j] = area[i+1][j] + area[i][j+1];
            }
        }

        return area[0][0];
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