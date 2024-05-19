class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        result = ""
        n = max(len(a), len(b))
        i = 0
        carry = 0

        while i < n:
            sum = carry
            if i < len(a) and a[len(a)-i - 1] == "1": sum += 1
            if i < len(b) and b[len(b)-i - 1] == "1": sum += 1
            if sum == 0:
                result = "0" + result
                carry = 0
            elif sum == 1:
                result = "1" + result
                carry = 0
            elif sum == 2:
                carry = 1
                result = "0" + result
            elif sum == 3:
                carry = 1
                result = "1" + result
            i += 1
        
        if carry == 1:
            result = "1" + result
        return result
        