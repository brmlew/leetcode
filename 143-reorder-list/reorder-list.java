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
    public void reorderList(ListNode head) {
        ListNode curr = head.next;
        if (curr == null) return;

        if (curr.next == null) return;
        
        while (curr.next.next != null) {
            curr = curr.next;
        }

        curr.next.next = head.next;
        head.next = curr.next;
        curr.next = null;

        reorderList(head.next.next);
    }
}