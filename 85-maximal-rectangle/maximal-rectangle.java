class Solution {
    public int maximalRectangle(char[][] matrix) {
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int max_width = 0;
                if (matrix[i][j] == '1') {

                    // get the width
                    int width = 0;
                    while (j < matrix[0].length) {
                        if (matrix[i][j] == '1') {
                            j++;
                            width++;
                        } else {
                            break;
                        }
                    }

                    int height = 1;
                    int k = i + 1;
                    while (k < matrix.length) {
                        for (int l = 0; l < width; l++) {
                            //System.out.println("i: " + i + " j: " + j + " k: " + k + " l: " + l + " width: " + width + " height: " + height + " matrix[k][j-width+1]: " + matrix[k][j-width+l] + " area: " + width*height);
                            result = Math.max(result, width * height);
                            if (matrix[k][j-width+l] != '1') {
                                j = j - width + l;
                                width = l;
                                height++;
                                
                            } else if (l == width - 1) {
                                height++;
                            }
                        }
                        k++;
                    }
                    
                    result = Math.max(result, width * height);
                }
            }
        }
        return result;
    }
}