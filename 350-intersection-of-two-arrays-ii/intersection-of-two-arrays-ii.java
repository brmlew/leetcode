class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] result = new int[0];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                map.put(nums1[i], map.get(nums1[i]) + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                map.put(nums2[i], map.get(nums2[i]) - 1);
                if (map.get(nums2[i]) == 0) {
                    map.remove(nums2[i]);
                }
                int[] temp = new int[result.length + 1];
                for (int j = 0; j < result.length; j++) {
                    temp[j] = result[j];
                }
                temp[temp.length - 1] = nums2[i];
                result = temp;
            }
        }
        return result;
    }
}