class TextEditor {
    public class Node{
        char letter;
        Node next, prev;
        public Node(char letter) {
            this.letter = letter;
            next = null;
            prev = null;
        }
    } 
    Node head;
    Node curr;

    public TextEditor() {
        this.head = new Node('\0');
        this.curr = head;
    }
    
    public void addText(String text) {
        for (int i = 0; i < text.length(); i++) {
            Node newChar = new Node(text.charAt(i));
            if (this.curr.next != null) {
                this.curr.next.prev = newChar;
            }
            newChar.next = this.curr.next;
            newChar.prev = this.curr;
            this.curr.next = newChar;
            this.curr = this.curr.next;   
        }
    }
    
    public int deleteText(int k) {
        int temp = k;
        while (temp > 0) {
            if (this.curr.letter == '\0') {
                return k - temp;
            }

            if (this.curr.next != null) {
                this.curr.next.prev = this.curr.prev;
            }
            this.curr.prev.next = this.curr.next;
            this.curr = this.curr.prev;
            temp--;
        }
        return k;
    }
    
    public String cursorLeft(int k) {
        while (k > 0) {
            if (this.curr.letter == '\0') {
                break;
            }
            this.curr = this.curr.prev;
            k--;
        }

        int count = 0;
        Node temp = this.curr;
        String result = "";
        while (count < 10) {
            if (temp.letter == '\0') {
                return result;
            }
            result = temp.letter + result;
            temp = temp.prev;
            count++;
        }
        return result;
    }
    
    public String cursorRight(int k) {
        while (k > 0) {
            if (this.curr.next == null) {
                break;
            }
            this.curr = this.curr.next;
            k--;
        }

        int count = 0;
        Node temp = this.curr;
        String result = "";
        while (count < 10) {
            if (temp.letter == '\0') {
                return result;
            }
            result = temp.letter + result;
            temp = temp.prev;
            count++;
        }
        return result;
    }
}

/**
 * Your TextEditor object will be instantiated and called as such:
 * TextEditor obj = new TextEditor();
 * obj.addText(text);
 * int param_2 = obj.deleteText(k);
 * String param_3 = obj.cursorLeft(k);
 * String param_4 = obj.cursorRight(k);
 */