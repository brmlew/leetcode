class Solution(object):
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        rows = []
        cols = []
        m = len(matrix)
        n = len(matrix[0])
        
        i = 0
        while i < m:
            j = 0
            while j < n:
                if matrix[i][j] == 0:
                    if i not in rows: rows.append(i)
                    if j not in cols: cols.append(j)
                j += 1
            i += 1

        print("rows: ", rows, "cols", cols)
        i = 0
        while i < m:
            j = 0
            while j < n:
                if i in rows or j in cols:
                    matrix[i][j] = 0
                j += 1
            i += 1

        return matrix
