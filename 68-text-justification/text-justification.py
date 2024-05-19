class Solution(object):
    def fullJustify(self, words, maxWidth):
        """
        :type words: List[str]
        :type maxWidth: int
        :rtype: List[str]
        """
        result = []

        i = 0
        while i < len(words):
            width = 0
            line = ""
            currWords = []
            while True:
                if i == len(words): break
                if width + len(words[i]) + len(currWords) > maxWidth:
                    break 
                currWords.append(words[i])
                width += len(words[i])
                i += 1
            

            if i != len(words):
                if len(currWords) == 1:
                    line = currWords[0] + " "*(maxWidth - len(currWords[0]))
                    result.append(line)
                else:
                    space, extra = divmod(
                        maxWidth - width,
                        len(currWords) - 1
                    )
                    j = 0
                    while extra > 0:
                        currWords[j] += " "
                        extra -= 1
                        j += 1
                    result.append((" " * space).join(currWords))
            else:
                j = 0
                while j < len(currWords) - 1:
                    line += currWords[j] + " "
                    j += 1
                line += currWords[j]
                line += " "*(maxWidth - len(line))
                result.append(line)
        
        return result


        