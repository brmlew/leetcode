class Solution {
    public boolean isSubsequence(String s, String t) {
        int currS = 0;
        int currT = 0;

        while (currS < s.length() && currT < t.length()) {
            if (s.charAt(currS) == t.charAt(currT)) {
                currS++;
            } 
            currT++;
        }
        if (currS == s.length()) return true;

        return false;
    }
}