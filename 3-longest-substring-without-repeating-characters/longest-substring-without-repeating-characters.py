class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        letters = []
        left = 0
        right = 0
        length = 0

        while right < len(s):
            print("test: " + s[right] + ", " + str(right))
            if s[right] in letters:
                if right - left > length:
                    length = right - left
                
                i = left
                while True:
                    if letters[0] != s[right]:
                        del letters[0]
                    else:
                        del letters[0]
                        letters.append(s[right])
                        left = i + 1
                        break
                    i += 1
                right += 1
            else:
                letters.append(s[right])
                right += 1
                if right == len(s):
                    if right - left > length:
                        length = right - left 
        return length
        