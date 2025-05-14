class Solution {
    public int rob(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return Math.max(helper(nums, 0, map), helper(nums, 1, map));
    }

    public int helper(int[] nums, int index, HashMap<Integer, Integer> map) {
        if (index == nums.length - 1 || index == nums.length - 2) {
            map.put(index, nums[index]);
            return nums[index];
        }
        if (index >= nums.length) return 0;

        if (map.containsKey(index)) {
            return map.get(index);
        }

        map.put(index, nums[index] + Math.max(helper(nums, index + 2, map), helper(nums, index + 3, map)));
        return map.get(index);
    }
}