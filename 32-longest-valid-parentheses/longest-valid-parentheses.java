class Solution {
    public int longestValidParentheses(String s) {
        
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.length() - i < result) break;
            Stack<Character> stack = new Stack<>();

            if (s.charAt(i) != ')') {
                stack.push(s.charAt(i));
                for (int j = i + 1; j < s.length(); j++) {
                    if (stack.size() > s.length() - j) break;
                    if (s.charAt(j) == '(') {
                        stack.push(s.charAt(j));
                    } else if (!stack.isEmpty()) {
                        stack.pop();
                        if (stack.isEmpty()) result = Math.max(result, j-i + 1);
                    } else {
                        break;
                    }
                }
            }
        }
        return result;
    }
}