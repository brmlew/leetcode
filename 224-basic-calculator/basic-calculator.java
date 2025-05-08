class Solution {
    public int findClosingBracket(String s) {
        int openCount = 0;
        int closeCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openCount++;
            } else if (s.charAt(i) == ')') {
                closeCount++;
                if (openCount == closeCount) return i;
            }
        }
        return 0;
    }

    public int calculate(String s) {
        s = s.replaceAll("\\s+","");
        if (s.length() == 0) return 0;
        if (s.indexOf('+') == -1 && s.indexOf('-') == -1 && s.indexOf('(') == -1) return Integer.parseInt(s);

        int bracket = s.indexOf('(');
        if (bracket != -1) {
            int closing = findClosingBracket(s);
            int temp = calculate(s.substring(bracket + 1, closing));
            if (bracket > 0 && s.charAt(bracket - 1) == '-') {
                return calculate(s.substring(0, bracket - 1) + "-" + Integer.toString(temp) + s.substring(closing + 1));
            }
            return calculate(s.substring(0, bracket) + Integer.toString(temp) + s.substring(closing + 1));
        }   

        int plus = s.indexOf('+');
        if (plus != -1) {
            int index = plus + 1;
            while (Character.isDigit(s.charAt(index))) {
                index++;
                if (index == s.length()) break;
            }
            return calculate(s.substring(plus + 1, index)) + calculate(s.substring(0, plus)) + calculate(s.substring(index));
        }

        int subtract = s.indexOf('-');
        if (subtract != -1) {
            if (s.charAt(subtract + 1) == '-') {
                return calculate(s.substring(0, subtract) + "+" + s.substring(subtract+2));
            } 
            int index = subtract + 1;
            while (Character.isDigit(s.charAt(index))) {
                index++;
                if (index >= s.length()) break;
            }
            if (index == subtract + 1) {
                return calculate(s.substring(0, subtract)) - calculate(s.substring(subtract + 1));
            } else if (index >= s.length()) {
                return calculate(s.substring(0, subtract)) + -1 * calculate(s.substring(subtract + 1));
            }else {
                return calculate(s.substring(subtract, index)) + calculate(s.substring(0, subtract) + s.substring(index));
            }
            
        }
        return 0;
    }
}