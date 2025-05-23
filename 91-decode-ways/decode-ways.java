class Solution {
    public int numDecodings(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        return helper(s, map);
    }

    public int helper(String s, HashMap<String, Integer> map) {
        if (s.length() == 0) return 1;
        if (s.charAt(0) == '0') return 0;
        if (map.containsKey(s)) return map.get(s);

        int result = 0;
        int letter = 0;
        letter = Integer.parseInt(s.substring(0, 1));
        if (letter > 0 && letter < 10) {
            result += helper(s.substring(1), map);
        }

        if (s.length() > 1) {
            letter = Integer.parseInt(s.substring(0, 2));
            if (letter > 0 && letter < 27) {
                result += helper(s.substring(2), map);
            }
        }
        System.out.println("s: " + s + " res: " + result);

        map.put(s, result);
        return result;
    }
}