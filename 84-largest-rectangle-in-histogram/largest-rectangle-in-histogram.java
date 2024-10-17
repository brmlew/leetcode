class Solution {
    public int largestRectangleArea(int[] heights) {
        int result = 0;
        for (int i = 0; i < heights.length; i++) {
            result = Math.max(result, heights[i]);

            int width = 1;
            int height = heights[i];
            while (i + width < heights.length) {
                if (heights[i+width] < height) {
                    height = heights[i+width];
                }
                if (height * (heights.length - i) < result) break;
                width++;
                result = Math.max(result, width * height);
                
            }
            result = Math.max(result, width * height);
        }

        return result;
    }
}