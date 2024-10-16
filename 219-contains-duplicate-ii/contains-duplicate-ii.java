class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0;
        int right = 1;
        while (right < nums.length) {
            for (int i = 0; i < k && i + right < nums.length; i++) {
                if (nums[left] == nums[right + i] && Math.abs(left - right) <= k) return true;
            }
            left++;
            right = left + 1;
        }
        return false;
    }
}