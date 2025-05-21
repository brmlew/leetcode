class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int result = 0;
        result += (ax2 - ax1) * (ay2 - ay1);
        result += (bx2 - bx1) * (by2 - by1);
        int overlap_x = Math.max(0, Math.min(ax2, bx2) - Math.max(ax1, bx1));
        int overlap_y = Math.max(0, Math.min(ay2, by2) - Math.max(ay1, by1));
        
        return result - (overlap_x * overlap_y);
    }
}