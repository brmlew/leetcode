class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1);
        }

        int i = 1;
        while (true) {
            if (map.get(i) == null) return i;
            i++;
        }
    }
}