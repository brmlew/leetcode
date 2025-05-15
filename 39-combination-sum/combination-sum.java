class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] == target) {
                List<Integer> temp = new ArrayList<>();
                temp.add(candidates[i]);
                result.add(temp);
            } else if (candidates[i] < target) {
                List<List<Integer>> remaining = combinationSum(candidates, target - candidates[i]);
                for (int j = 0; j < remaining.size(); j++) {
                    remaining.get(j).add(0, candidates[i]);
                    remaining.get(j).sort(Integer::compareTo);
                    if (!result.contains(remaining.get(j))) {
                        result.add(remaining.get(j));
                    }
                }
            }
        }
        return result;
    }
}