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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode temp = new ListNode();
        ListNode result = temp;

        while (true){
            

            int min = Integer.MAX_VALUE;
            int min_index = 0;

            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null && lists[i].val < min) {
                    min = lists[i].val;
                    min_index = i;
                }
            }
            if (min == Integer.MAX_VALUE) return result.next;

            temp.next = new ListNode();
            temp = temp.next;

            temp.val = min;
            lists[min_index] = lists[min_index].next;
        }
        
    }
}