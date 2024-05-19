class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        n = len(digits) - 1
        
        while n >= 0:
            if digits[n] != 9:
                digits[n] += 1
                return digits
            
            digits[n] = 0
            n -= 1
        
        digits.insert(0, 1)
        return digits

        
        