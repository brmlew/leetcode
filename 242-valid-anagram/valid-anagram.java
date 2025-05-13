class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> s_map = new HashMap<>();
        HashMap<Character, Integer> t_map = new HashMap<>();
        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            if (s_map.containsKey(s.charAt(i))) {
                s_map.put(s.charAt(i), s_map.get(s.charAt(i)) + 1);
            } else {
                s_map.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t_map.containsKey(t.charAt(i))) {
                t_map.put(t.charAt(i), t_map.get(t.charAt(i)) + 1);
            } else {
                t_map.put(t.charAt(i), 1);
            }
        }

        if (s_map.equals(t_map)) return true;
        return false;
    }
}