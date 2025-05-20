class Solution {
    public int maximalSquare(char[][] matrix) {
        int result = 0;
        for (int i  = 0; i < matrix.length; i++) {
            if (matrix[i][0] == '1') result = 1;
        }
        for (int i  = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == '1') result = 1;
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] != '0') {
                    int temp = Math.min(matrix[i-1][j] - '0', matrix[i-1][j-1] - '0');
                    temp = Math.min(temp, matrix[i][j-1] - '0') + 1;
                    //System.out.println("temp: " + temp + " i: " + i + " j: " + j);
                    result = Math.max(result, temp);
                    matrix[i][j] = (char) (temp + '0');
                }
                
            } 
        }
        return result * result;
    }
}