class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String, Boolean> map = new HashMap<>();
        return helper(s, wordDict, map);
    }

    public boolean helper(String s, List<String> wordDict, HashMap<String, Boolean> map) {
        if (s.length() == 0) return true;
        if (map.containsKey(s)) return map.get(s);

        for (int i = 0; i < wordDict.size(); i++) {
            //System.out.println("s: " + s + " sub: " + s.substring(0, wordDict.get(i).length()) + " word: " + wordDict.get(i));
            if (s.length() >= wordDict.get(i).length() && s.substring(0, wordDict.get(i).length()).equals(wordDict.get(i))) {
                //System.out.println("here: " + s.substring(wordDict.get(i).length(), s.length()));
                if (helper(s.substring(wordDict.get(i).length(), s.length()), wordDict, map)) {
                    map.put(s, true);
                    return true;
                }
            }
        }
        map.put(s, false);
        return false;
    }
}