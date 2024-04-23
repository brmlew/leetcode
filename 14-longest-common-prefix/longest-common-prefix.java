class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if (strs.length == 0) return result;

        for (int i = 0; i <= strs[0].length(); i++) {
            String sub = strs[0].substring(0, i);

            String test = "a";
            System.out.println(test.substring(0,1));

            for (int j = 1; j < strs.length; j++) {
                if (i > strs[j].length()) return result;
                String temp = strs[j].substring(0,i);
                if (!sub.equals(temp)) return result;
            }

            result = sub;
        }

        return result;

    }
}