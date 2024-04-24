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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode temp = new ListNode();
        result = temp;

        while (list1 != null || list2 != null) {
            temp.next = new ListNode();
            temp = temp.next;
            if (list1 == null) {
                temp.val = list2.val;
                list2 = list2.next;
            } else if (list2 == null) {
                temp.val = list1.val;
                list1 = list1.next;
            } else if (list1.val <= list2.val) {
                System.out.println("1: " + list1.val + " 2: " + list2.val);
                temp.val = list1.val;
                list1 = list1.next;
            } else {
                temp.val = list2.val;
                list2 = list2.next;
            }
        }
        return result.next;
    }
}