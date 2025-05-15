class Solution {
    public int minDistance(String word1, String word2) {
        HashMap<String, Integer> map = new HashMap<>();
        return helper(word1, word2, map);
    }

    public int helper(String word1, String word2, HashMap<String, Integer> map) {
        System.out.println(word1);
        if (word1 == word2) return 0;
        if (map.containsKey(word1)) return map.get(word1);

        for (int i = 0; i < word1.length(); i++) {
            if (i == word2.length()) return word1.length() - word2.length();
            if (word1.charAt(i) != word2.charAt(i)) {
                int result = Integer.MAX_VALUE;
                result = 1 + helper(word1.substring(0, i) + word2.charAt(i) + word1.substring(i), word2, map);
                result = Math.min(result, 1 + helper(word1.substring(0, i) + word1.substring(i + 1), word2, map));
                result = Math.min(result, 1 + helper(word1.substring(0, i) + word2.charAt(i) + word1.substring(i + 1), word2, map));
                map.put(word1, result);
                return result;
            }
        }

        map.put(word1, word2.length() - word1.length());
        return map.get(word1);
    }
}