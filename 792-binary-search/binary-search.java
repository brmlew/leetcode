class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;
            if (high - low <= 1) break;
            if (nums[mid] > target) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return -1;
    }
}