class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        result = 0
        while True:
            y = result * result
            if y > x:
                return result - 1
            elif y == x:
                return result
            result += 1
        