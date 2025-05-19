class Solution {
    public List<List<Integer>> permute(int[] nums) {
        return helper(nums, 0);
    }

    public List<List<Integer>> helper(int[] nums, int index) {
        System.out.println("index: " + index);
        List<List<Integer>> result = new ArrayList<>();
        if (index == nums.length - 1) {
            List<Integer> temp = new ArrayList<>();
            temp.add(nums[index]);
            result.add(temp);
            return result;
        }

        List<List<Integer>> list = helper(nums, index + 1);

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j <= list.get(i).size(); j++) {
                List<Integer> temp = new ArrayList<>(list.get(i));

                temp.add(j, nums[index]);
                result.add(temp);
            }
        }
        return result;
    }
}