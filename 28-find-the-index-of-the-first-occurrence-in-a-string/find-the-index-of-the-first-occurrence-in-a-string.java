class Solution {
    public int strStr(String haystack, String needle) {
        int result = -1;
        int len = needle.length();

        for (int i = 0; i <= haystack.length() - len; i++) {
            if (haystack.substring(i, i + len).equals(needle)) return i;
        }

        return result;
    }
}