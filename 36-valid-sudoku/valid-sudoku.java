class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') continue;
                for (int k = i + 1; k < board.length; k++) {
                    if (board[k][j] == board[i][j]) {
                        System.out.println("1: i: " + i + " j: " + j + " k: " + k);
                        return false;
                    } 
                }

                for (int k = j + 1; k < board[0].length; k++) {
                    if (board[i][k] == board[i][j]) {
                        System.out.println("2: i: " + i + " j: " + j + " k: " + k);
                        return false;
                    } 
                }

                for (int k = i - (i % 3); k < i - (i % 3) + 3; k++) {
                    for (int l = j - (j % 3); l < j - (j % 3) + 3; l++) {
                        System.out.println("2: i: " + i + " j: " + j + " k: " + k + " l: " + l);
                        if (k == i && l == j) continue;
                        if (board[k][l] == board[i][j]) {
                            return false;
                        } 
                    }
                    
                }

            }   
        }
        return true;
    }
}