class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sorted = new int[nums1.length + nums2.length];

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < nums1.length + nums2.length; i++) {
            if (count1 >= nums1.length) {
                sorted[i] = nums2[count2];
                count2++;
            } else if (count2 >= nums2.length) {
                sorted[i] = nums1[count1];
                count1++;
            } else if (nums1[count1] <= nums2[count2]) {
                sorted[i] = nums1[count1];
                count1++;
            } else {
                sorted[i] = nums2[count2];
                count2++;
            }
        }

        double median;
        if ((nums1.length + nums2.length)%2 == 1) {
            median = sorted[(nums1.length + nums2.length)/2];
        } else {
            double lower = sorted[(nums1.length + nums2.length)/2];
            double upper = sorted[(nums1.length + nums2.length)/2 - 1];
            median = (lower + upper) / 2.0;
        }
        return median;
    }
}