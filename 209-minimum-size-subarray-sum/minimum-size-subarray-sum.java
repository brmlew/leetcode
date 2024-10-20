class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int result = Integer.MAX_VALUE;
        int sum = 0;

        while (right < nums.length) {
            sum += nums[right];
            while (sum >= target) {
                sum -= nums[left];
                result = Math.min(result, right - left + 1);
                left++;
            }
            right++;
        }
        if (result == Integer.MAX_VALUE) return 0;

        return result;
    }
}