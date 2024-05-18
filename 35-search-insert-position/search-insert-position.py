class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        result = 0

        left = 0
        right = len(nums)

        while left < right:
            mid = (left + right) // 2
            print(left, right, mid, nums[mid])
            if (nums[mid] == target):
                return mid
            elif (nums[mid] < target):
                left = mid + 1
                result = mid + 1
            else:
                right = mid
        
        if result < 0: return 0
        return result
            

        