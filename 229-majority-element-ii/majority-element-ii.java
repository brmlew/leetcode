class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1); 
                
            } else {
                map.put(nums[i], 1);
            }
            if (map.get(nums[i]) > nums.length / 3 && !result.contains(nums[i])) {
                result.add(nums[i]);
            }
        }

        return result;
    }
}