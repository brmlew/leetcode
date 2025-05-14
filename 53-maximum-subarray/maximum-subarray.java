class Solution {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            if (total < 0) {
                total = 0;
            }

            total += nums[i];
            result = Math.max(result, total);
        }
        return result;
    }
}