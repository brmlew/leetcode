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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr1 = list1;
        for (int i = 0; i < a-1; i++) {
            curr1 = curr1.next;
        }
        ListNode curr2 = list2;
        while (curr2.next != null) {
            curr2 = curr2.next;
        }
        curr2.next = curr1.next;
        curr1.next = list2;

        ListNode curr3 = curr2.next;
        for (int i = 0; i < b-a; i++) {
            curr3 = curr3.next;
        }
        curr2.next = curr3.next;

        return list1;
    }
}