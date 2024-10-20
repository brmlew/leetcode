class Solution {
    public int findMin(int[] nums) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            result = Math.min(result, nums[0]);
            
            int temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j >=0; j--) {
                if (j == 0) {
                    nums[0] = temp;
                } else {
                    nums[j] = nums[j-1];
                }
            }
        }
        return result;
    }
}