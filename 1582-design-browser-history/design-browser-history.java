class BrowserHistory {
    public class Node{
        String url;
        Node next, prev;
        public Node(String url) {
            this.url = url;
            next = null;
            prev = null;
        }
    }

    Node head;
    Node curr;
    int length = 0;

    public BrowserHistory(String homepage) {
        this.head = new Node(homepage);
        this.curr = this.head;
        this.length = 1;
    }
    
    public void visit(String url) {
        curr.next = new Node(url);
        curr.next.prev = curr;
        curr = curr.next;
        this.length = this.length++;
    }
    
    public String back(int steps) {
        while (this.curr.prev != null) {
            if (steps > 0) {
                this.curr = this.curr.prev;
                steps--;
            } else {
                break;
            }
        }
        return this.curr.url;
    }
    
    public String forward(int steps) {
        while (this.curr.next != null) {
            if (steps > 0) {
                this.curr = this.curr.next;
                steps--;
            } else {
                break;
            }
        }
        return this.curr.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */