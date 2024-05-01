# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        curr = ListNode()
        result = curr

        remainder = 0

        while l1 != None or l2 != None:
            curr.next = ListNode()
            curr = curr.next
            sum = remainder
            if l1 != None:
                sum += l1.val
                l1 = l1.next
            if l2 != None:
                sum += l2.val
                l2 = l2.next
            if sum >= 10:
                remainder = 1
                sum -= 10
            else:
                remainder = 0
            
            curr.val = sum
            
        if remainder == 1:
            curr.next = ListNode()
            curr = curr.next
            curr.val = 1
        
        return result.next
        