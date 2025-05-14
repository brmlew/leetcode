class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        while (n != 1) {
            if (map.containsKey(n)) {
                return false;
            } else {
                map.put(n, 1);
                int total = 0;
                while (n > 0) {
                    int remainder = n % 10;
                    total += remainder * remainder;
                    n = n / 10;
                }
                n = total;
            }
        }
        return true;
    }
}