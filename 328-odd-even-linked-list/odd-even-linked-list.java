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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = head;
        if (head == null || head.next == null) return head;
        ListNode evenHead = head.next;
        ListNode even = evenHead;

        boolean indexOdd = true;
        ListNode curr = even;

        while (curr.next != null) {
            if (indexOdd) {
                odd.next = curr.next;
                odd = odd.next; 
            } else {
                even.next = curr.next;
                even = even.next;
            }
            curr = curr.next;
            indexOdd = !indexOdd;
        }
        even.next = null;
        odd.next = evenHead;
        return head;
    }
}