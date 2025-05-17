class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int num = 1;

        int top = 0, bottom = n, left = 0, right = n;
        int x = 0, y = 0;
        int horizontal = 1, vertical = 0;

        while (top < bottom && left < right) {
            result[y][x] = num;
            if (horizontal == 1 && x == right - 1) {
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
            y += vertical;
            x += horizontal;
            num++;
        }
        return result;
    }
}