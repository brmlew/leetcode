class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        while (row < matrix.length) {
            int left = 0;
            int right = matrix[0].length - 1;
            while (left <= right) {
                int mid = (left+right) / 2;
                if (matrix[row][mid] == target) return true;
                if (matrix[row][mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            
            row++;
        }
        return false;
    }
}