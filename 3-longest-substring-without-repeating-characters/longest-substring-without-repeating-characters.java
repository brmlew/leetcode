class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0, right = 1;
        map.put(s.charAt(0), 0);
        result = 1;

        while (right < s.length()) {
            if (map.get(s.charAt(right)) == null) {
                map.put(s.charAt(right), right);
                right++;
                result = Math.max(result, right-left);
            } else {
                int index = map.get(s.charAt(right));
                for (int i = left; i <= index; i++) {
                    map.remove(s.charAt(i));
                }
                left = index + 1;
                map.put(s.charAt(right), right);
                result = Math.max(result, right-left);

                right++;
            }
        }
        return result;
    }
}