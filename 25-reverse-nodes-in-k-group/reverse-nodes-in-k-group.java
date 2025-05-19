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
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<ListNode> s = new Stack<>();
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode curr = result; 
        while (curr != null) {
            //System.out.println(curr.val);
            int index = 0;
            ListNode temp = curr.next;
            while (index < k) {
                if(temp == null) return result.next;
                s.push(temp);
                index++;
                temp = temp.next;
            }
            while (!s.isEmpty()) {
                curr.next = s.pop();
                curr = curr.next;
                //System.out.println("val: " + curr.val);
                
            }
            curr.next = temp;
        }
        //System.out.println(result.val);
        return result.next;
    }
}