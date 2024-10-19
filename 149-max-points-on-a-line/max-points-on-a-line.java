class Solution {
    public int maxPoints(int[][] points) {
        if (points.length <= 2) return points.length;
        int result = 0;

        for (int i = 0; i < points.length; i++) {
            HashMap<List<Float>, Integer> map = new HashMap<>();
            for (int j = i + 1; j < points.length; j++) {
                float m = 0f;
                if (points[j][0] != points[i][0]) {
                    m = (float) (points[j][1] - points[i][1]) / (points[j][0] - points[i][0]);
                    if (m == -0.0) m = 0f;
                } else {
                    m = Integer.MIN_VALUE;
                }
                
                float b = points[i][1] - (points[i][0] * m);
                List<Float> line = new ArrayList<>();
                line.add(m);
                line.add(b);
                if (map.containsKey(line)) {
                    map.replace(line, map.get(line) + 1);
                } else {
                    map.put(line, 2);
                }
                result = Math.max(result, map.get(line));
            }
        }
        return result;
    }
}