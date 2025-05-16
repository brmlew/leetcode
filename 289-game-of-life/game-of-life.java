class Solution {
    public void gameOfLife(int[][] board) {
        int[][] temp = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                temp[i][j] = board[i][j];
                int neighbours = 0;
                if (i > 0) {
                    if (j > 0) {
                        neighbours += board[i-1][j-1];
                    }
                    if (j < board[0].length - 1) {
                        neighbours += board[i-1][j+1];
                    }
                    neighbours += board[i-1][j];
                }
                if (j > 0) {
                    neighbours += board[i][j - 1];
                }
                if (j < board[0].length - 1) {
                    neighbours += board[i][j + 1];
                }
                if (i < board.length - 1) {
                    if (j > 0) {
                        neighbours += board[i+1][j-1];
                    }
                    if (j < board[0].length - 1) {
                        neighbours += board[i+1][j+1];
                    }
                    neighbours += board[i+1][j];
                }
                
                if (board[i][j] == 1) {
                    if (neighbours < 2 || neighbours > 3) {
                        temp[i][j] = 0;
                    }
                } else {
                    if (neighbours == 3) {
                        temp[i][j] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = temp[i][j];
            }
        }
    }
}