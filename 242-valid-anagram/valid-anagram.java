class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> count = new HashMap<>();
        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            if (count.containsKey(s.charAt(i))) {
                count.put(s.charAt(i), count.get(s.charAt(i)) + 1);
            } else {
                count.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (count.containsKey(t.charAt(i)) && count.get(t.charAt(i)) != 0) {
                count.put(t.charAt(i), count.get(t.charAt(i)) - 1);
            } else {
                return false;
            }
        }

        for (int val : count.values()) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}