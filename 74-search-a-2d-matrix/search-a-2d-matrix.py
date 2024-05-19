class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        low, high = 0, len(matrix)
        while low <= high:
            if low + 1 == high: break
            mid = (low + high) // 2
            if target == matrix[mid][0]: return True
            elif target > matrix[mid][0]:
                low = mid
            else: 
                high = mid
        row = low
        
        low, high = 0, len(matrix[row])
        while low <= high:
            if matrix[row][low] == target: return True
            if low + 1 == high: break
            mid = (low + high) // 2
            if target == matrix[row][mid]: return True
            elif target > matrix[row][mid]:
                low = mid
            else: 
                high = mid
        
        return False
            