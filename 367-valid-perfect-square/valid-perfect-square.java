class Solution {
    public boolean isPerfectSquare(int num) {
        long low = 0, high = num;

        while (low <= high) {
            long mid = (low + high) / 2;
            if (mid * mid == num) return true;
            if (mid * mid < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}