class Solution {
    public char[][] updateBoard(char[][] board, int[] click) {
        if (board[click[0]][click[1]] == 'M') {
            board[click[0]][click[1]] = 'X';
            return board;
        }

        int count = 0;
        if (click[0] > 0) {
            for (int i = click[1] > 0? click[1] - 1:click[1]; i <= (click[1] < board[0].length - 1? click[1] + 1: click[1]); i++) {
                if (board[click[0]-1][i] == 'M') count++;
            }
        }
        
        if (click[1] > 0 && board[click[0]][click[1]-1] == 'M') count++;
        if (click[1] < board[0].length - 1 && board[click[0]][click[1]+1] == 'M') count++;

        if (click[0] < board.length - 1) {
            for (int i = click[1] > 0? click[1] - 1:click[1]; i <= (click[1] < board[0].length - 1? click[1] + 1: click[1]); i++) {
                if (board[click[0]+1][i] == 'M') count++;
            }
        }

        if (count > 0) {
            board[click[0]][click[1]] = (char) (count + '0');
            return board;
        }

        board[click[0]][click[1]] = 'B';

        if (click[0] > 0) {
            for (int i = click[1] > 0? click[1] - 1:click[1]; i <= (click[1] < board[0].length - 1? click[1] + 1: click[1]); i++) {
                if (board[click[0]-1][i] == 'E') {
                    board = updateBoard(board, new int[] {click[0]-1, i});
                }
            }
        }
        
        if (click[1] > 0 && board[click[0]][click[1]-1] == 'E') {
            board = updateBoard(board, new int[] {click[0], click[1]-1});
        }
        if (click[1] < board[0].length - 1 && board[click[0]][click[1]+1] == 'E') {
            board = updateBoard(board, new int[] {click[0], click[1]+1});
        }

        if (click[0] < board.length - 1) {
            for (int i = click[1] > 0? click[1] - 1:click[1]; i <= (click[1] < board[0].length - 1? click[1] + 1: click[1]); i++) {
                if (board[click[0]+1][i] == 'E') {
                    board = updateBoard(board, new int[] {click[0] + 1, i});
                }
            }
        }


        return board;

    }
}