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
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;

        ListNode reversed = reverseList(head.next);
        ListNode curr = reversed; 

        while (curr.next != null) {
            curr = curr.next;
        }
        head.next = null;
        curr.next = head;

        return reversed;
    }
}