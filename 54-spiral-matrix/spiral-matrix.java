class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0, bottom = matrix.length, left = 0, right = matrix[0].length;
        int horizontal = 1, vertical = 0;
        int x = 0, y = 0;

        while (top < bottom && left < right) {
            result.add(matrix[y][x]);
            if (horizontal == 1 &&  x == right - 1) {
                horizontal = 0;
                vertical = 1;
                top++;
            } else if (horizontal == -1 && x == left) {
                horizontal = 0;
                vertical = -1;
                bottom--;
            } else if (vertical == 1 && y == bottom - 1) {
                horizontal = -1;
                vertical = 0;
                right--;
            } else if (vertical == -1 && y == top) {
                horizontal = 1;
                vertical = 0;
                left++;
            }
            x += horizontal;
            y += vertical;
        }
        return result;
    }
}