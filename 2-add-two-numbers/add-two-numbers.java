/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode(0);
        ListNode currResult = result;
        ListNode curr1 = l1;
        ListNode curr2 = l2;

        while (curr1 != null || curr2 != null) {
            int x, y = 0;
            if (curr1 != null) {
                x = curr1.val;
                curr1 = curr1.next;
            } else {
                x = 0;
            }

            if (curr2 != null) {
                y = curr2.val;
                curr2 = curr2.next;
            } else {
                y = 0;
            }

            int sum = x + y + carry;
            if (sum >= 10) {
                carry = 1;
                sum -= 10;
            } else {
                carry = 0;
            }

            currResult.next = new ListNode(sum);
            currResult = currResult.next;
        }
        if (carry != 0) {
            currResult.next = new ListNode(carry);
        }
        return result.next;
    }
}