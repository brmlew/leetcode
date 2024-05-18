class Solution(object):
    def isValidSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: bool
        """
        for row in board:
            existing = []
            for cell in row:
                if (cell != "."):
                    if (cell in existing):
                        return False
                    else:
                        existing.append(cell)
        
        i = 0
        while (i < 9):
            existing = []
            for row in board:
                if (row[i] != "."):
                    if (row[i] in existing):
                        return False
                    else:
                        existing.append(row[i])
            i += 1

        i = 0
        while (i < 3):
            j = 0
            while (j < 3):
                existing = []
                k = 0
                while (k < 3):
                    l = 0
                    while (l < 3):
                        if (board[i*3 + k][j*3 + l] != "."):
                            if (board[i*3 + k][j*3 + l] in existing):
                                return False
                            else:
                                existing.append(board[i*3 + k][j*3 + l])
                        l += 1
                    k += 1
                j += 1
            i += 1
        
        return True
'''
[".",".",".",".","5",".",".","1","."],
[".","4",".","3",".",".",".",".","."],
[".",".",".",".",".","3",".",".","1"],
["8",".",".",".",".",".",".","2","."],
[".",".","2",".","7",".",".",".","."],
[".","1","5",".",".",".",".",".","."],
[".",".",".",".",".","2",".",".","."],
[".","2",".","9",".",".",".",".","."],
[".",".","4",".",".",".",".",".","."]]
'''