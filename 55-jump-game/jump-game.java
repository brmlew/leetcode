class Solution {
    public boolean canJump(int[] nums) {
        int[] visited = new int[nums.length];
        visited[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            //System.out.println("i: " + i + " nums i: " + nums[i] + " vis i: " + visited[i]);
            if (visited[i] == 1) {
                if (i == nums.length - 1) return true;
                for (int j = 0; j < nums[i]; j++) {
                    if (i + j + 1 >= nums.length) return true;
                    visited[i + j + 1] = 1;
                }
            }
        }
        return false;
    }
}