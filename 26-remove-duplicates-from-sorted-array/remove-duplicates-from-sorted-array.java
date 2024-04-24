class Solution {
    public int removeDuplicates(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            nums[result] = nums[i];
            result++;
        }

        return result;
    }
}