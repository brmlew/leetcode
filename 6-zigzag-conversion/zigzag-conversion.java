class Solution {
    public String convert(String s, int numRows) {
        String[][] letters = new String[numRows][s.length()];
        String[] arr = s.split("");
        
        int diagonals = 0;
        int verticals = numRows;
        for (int i = 0; i < s.length(); i++) {
            if (verticals > 0) {
                for (int j = 0; j < s.length(); j++) {
                    if (letters[numRows - verticals][j] == null) {
                        letters[numRows - verticals][j] = arr[i];
                        break;
                    } 
                }
                verticals--;
                if (verticals == 0) {
                    if (numRows > 2) {
                        diagonals = numRows - 2;
                    } else {
                        verticals = numRows;
                    }
                    
                }
            } else if (diagonals > 0) {
                for (int j = 0; j < s.length(); j++) {
                    if (letters[diagonals][j] == null) {
                        letters[diagonals][j] = arr[i];
                        break;
                    } 
                }
                diagonals--;
                if (diagonals == 0) {
                    verticals = numRows;
                }
            }
        }

        String result = "";
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (letters[i][j] != null) {
                    result += letters[i][j];
                } else {
                    break;
                }
            }
        }
        return result;
    }
}