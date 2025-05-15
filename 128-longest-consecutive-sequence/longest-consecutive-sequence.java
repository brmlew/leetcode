class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for  (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
        }

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i] - 1)) {
                int count = 0;
                while(map.containsKey(nums[i] + count)) {
                    map.remove(nums[i] + count);
                    count++;
                }
                result = Math.max(result, count);
            }
        }
        return result;
    }
}