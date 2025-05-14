class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (word.length() == 1) return true; 
                    board[i][j] = ' ';
                    if (helper(board, i, j, word)) return true;
                    board[i][j] = word.charAt(0);
                }
            }
        }
        return false;
    }

    public boolean helper(char[][]board, int x, int y, String word) {
        if (word.length() == 1) return true;
        board[x][y] = ' ';
        boolean up = false, right = false, down = false, left = false;
        if (x > 0 && board[x-1][y] == word.charAt(1)) {
            up = helper(board, x-1, y, word.substring(1));
        }
        if (y < board[0].length - 1 && board[x][y+1] == word.charAt(1)) {
            right = helper(board, x, y+1, word.substring(1));
        }
        if (x < board.length - 1 && board[x+1][y] == word.charAt(1)) {
            down = helper(board, x+1, y, word.substring(1));
        }
        if (y > 0 && board[x][y-1] == word.charAt(1)) {
            left = helper(board, x, y-1, word.substring(1));
        }
        board[x][y] = word.charAt(0);
        return up || right || down || left;
    }
}