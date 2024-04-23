class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = Integer.MAX_VALUE;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                //System.out.println("sum: " + sum + " i: " + i + ", " + nums[i] + " j: " + j + ", " + nums[j] + " k: " + k + ", " + nums[k]);
                //System.out.println("result: " + result);
                if (Math.abs(sum - target) < Math.abs(result - target)) result = sum;

                if (sum == target) {
                    return sum;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return result;
    }
}