class Solution {
    int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
    }
    
    public int[] reset() {
        return this.nums;
    }
    
    public int[] shuffle() {
        int[] res = new int[this.nums.length];
        List<Integer> random = new ArrayList<>();
        for (int i = 0; i < this.nums.length; i++) {
            int index = (int) (Math.random() * this.nums.length);
            while (random.contains(index)) {
                index = (int) (Math.random() * this.nums.length);
            }
            random.add(index);
            res[i] = this.nums[index];
        }
        return res;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */