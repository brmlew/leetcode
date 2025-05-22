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
        Stack<Integer> s1 = new Stack<>();
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }

        Stack<Integer> s2 = new Stack<>();
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }

        int digit = 0;
        int carry = 0;
        ListNode result = null;
        
        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
            digit += !s1.isEmpty()? s1.pop(): 0;
            
            digit += !s2.isEmpty()? s2.pop(): 0;
            digit += carry;
            carry = digit / 10;
            ListNode temp = new ListNode(digit % 10);
            temp.next = result;
            result = temp;
            digit = 0;
        }
        return result;
    }
}