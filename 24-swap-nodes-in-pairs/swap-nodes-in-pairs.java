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
    public ListNode swapPairs(ListNode head) {
        ListNode curr = new ListNode();
        ListNode result = curr;
        curr.next = head;

        while (curr != null) {
            
            if (curr.next == null || curr.next.next == null) return result.next;

            ListNode temp1 = curr.next;
            ListNode temp2 = curr.next.next;
            temp1.next = temp2.next;
            temp2.next = temp1;
            curr.next = temp2;

            curr = curr.next.next;
        }

        return result.next;
    }
}