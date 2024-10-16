/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) return head;
        if (head.child != null) {
            Node curr = head.child;
            while (curr != null) {
                if (curr.next == null) {
                    if (head.next != null) head.next.prev = curr;
                    curr.next = head.next;
                    break;
                } 
                curr = curr.next;
            }
            head.next = flatten(head.child);
            head.child.prev = head;
            head.child = null;
        } else {
            head.next = flatten(head.next);
        }
        return head;
    }
}