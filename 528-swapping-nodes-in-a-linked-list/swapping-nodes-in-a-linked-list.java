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
    public ListNode swapNodes(ListNode head, int k) {
        int length = 0; 
        ListNode curr1 = head;
        while (curr1 != null) {
            length++;
            curr1 = curr1.next;
        }
        curr1 = head;
        if (k > length/2) {
            k = length - k + 1;
        }
        for (int i = 0; i < k-1; i++) {
            curr1 = curr1.next;
        }
        ListNode curr2 = curr1;

        for (int i = 0; i < length - k - k + 1; i++) {
            curr2 = curr2.next;
        }
        int temp = curr1.val;
        curr1.val = curr2.val;
        curr2.val = temp;

        return head;
    }
}