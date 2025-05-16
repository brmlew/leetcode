class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;
        HashMap<Character, Integer> word = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            if (word.containsKey(p.charAt(i))) {
                word.put(p.charAt(i), word.get(p.charAt(i)) + 1);
            } else {
                word.put(p.charAt(i), 1);
            }
        }

        int left = 0, right = p.length();
        HashMap<Character, Integer> temp = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            if (temp.containsKey(s.charAt(i))) {
                temp.put(s.charAt(i), temp.get(s.charAt(i)) + 1);
            } else {
                temp.put(s.charAt(i), 1);
            }
        }
        if (temp.equals(word)) result.add(0);

        while (right < s.length()) {
            if (temp.get(s.charAt(left)) > 1) {
                temp.put(s.charAt(left), temp.get(s.charAt(left)) - 1);
            } else {
                temp.remove(s.charAt(left));
            }
            if (temp.containsKey(s.charAt(right))) {
                temp.put(s.charAt(right), temp.get(s.charAt(right)) + 1);
            } else {
                temp.put(s.charAt(right), 1);
            }
            left++;
            right++;
            if (temp.equals(word)) result.add(left);
            
        }

        return result;
    }
}