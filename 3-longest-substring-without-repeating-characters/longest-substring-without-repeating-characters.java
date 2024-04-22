class Solution {
    public int lengthOfLongestSubstring(String s) {
        String[] split = s.split("");
        int result = 0;
        int curr = 0;

        for (int i = curr; i < split.length; i++) {
            List<String> arr = new ArrayList<>();
            arr.add(split[i]);

            for (int j = i + 1; j < split.length; j++) {
                if (arr.contains(split[j])) {
                    break;
                } else {
                    arr.add(split[j]);
                }
            }
            String stringTest = String.join("", arr);
            if (stringTest.length() > result) {
                result = stringTest.length();
            }
            curr++;
        }

        return result;
    }
}