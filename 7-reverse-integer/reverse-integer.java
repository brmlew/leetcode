class Solution {
    public int reverse(int x) {
        
        int curr = x;
        int result = 0;

        while (curr != 0) {
            int num = curr % 10;
            long longResult = result;
            long longNum = num;

            long resultL= (longResult * 10) + longNum;
            
            if (resultL >= Math.pow(2, 31) - 1 || resultL <= -Math.pow(2, 31)) {
                return 0;
            }   
            result = (result * 10) + num;
            curr = curr / 10;
        }

        return result;
    }
}