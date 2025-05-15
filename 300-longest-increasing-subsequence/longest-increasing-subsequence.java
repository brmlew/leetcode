class Solution {
    public int lengthOfLIS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = Math.max(result, helper(nums, i, map));
        }
        return result;
    }

    public int helper(int[] nums, int index, HashMap<Integer, Integer> map) {
        if (index == nums.length - 1) return 1;
        if (map.containsKey(index)) {
            return Math.max(map.get(index), helper(nums, index + 1, map));
        }

        int result = 1;
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[index] < nums[i]) {
                if (map.containsKey(i)) {
                    result = Math.max(result, 1 + map.get(i));
                    
                } else {
                    result = Math.max(result, 1 + helper(nums, i, map));
                }
                
            }
        }
        map.put(index, result);
        System.out.println("index: " + index + " map.get: " + map.get(index));
        return result;
    }

}