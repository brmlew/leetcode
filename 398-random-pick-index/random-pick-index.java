class Solution {
    HashMap<Integer, List<Integer>> nums;

    public Solution(int[] nums) {
        this.nums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (this.nums.containsKey(nums[i])) {
                this.nums.get(nums[i]).add(i);
            } else {
                this.nums.put(nums[i], new ArrayList<>());
                this.nums.get(nums[i]).add(i);
            }
        }
    }
    
    public int pick(int target) {
        List<Integer> indexes = this.nums.get(target);
        Random rand = new Random();
        int randomNum = rand.nextInt(indexes.size());
        return indexes.get(randomNum);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */