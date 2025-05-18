class Solution {
    public int trap(int[] height) {
        int result = 0;
        int left = 0;
        while (left < height.length) {
            if (height[left] > 0) {
                int right = left + 1;
                int temp = 0;
                int max = right;
                int afterMax = 0;
                while (right < height.length && height[right] < height[left]) {
                    //System.out.println("here right: " + right + " temp: " + temp);
                    temp -= height[right];
                    afterMax += height[right];
                    if (height[right] >= height[max]) {
                        max = right;
                        afterMax = height[max];
                    }
                    right++;
                }
                
                if (right < height.length) {
                    temp += (right - left - 1) * (Math.min(height[left], height[right]));
                    //System.out.println("left: " + left + " right: " + right + " temp: " + temp);
                    result += temp;
                    left = right;
                } else {
                    if (max < height.length) {
                        temp += (max - left - 1) * (Math.min(height[left], height[max])) + afterMax;
                        //System.out.println("left: " + left + " max: " + max + " temp: " + temp + " after: " + afterMax);
                        result += temp;
                    } 
                    left = max;
                }
                
            } else {
                left++;
            }
        }
        return result;
    }
}