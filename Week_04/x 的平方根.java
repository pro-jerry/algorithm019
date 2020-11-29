class Solution {
    public int mySqrt(int x) {

        if (x == 0) {
            return 0;
        }

        long left = 1;
        long right = x / 2;
        while (left < right) {
            // long mid = left + (right - left + 1)/2;
            long mid = (left + right + 1) >>> 1;
            long square = mid * mid;
            if (square > x) {
                right = mid - 1;
            }else {
                left = mid;
            }
        }

        return (int)left;


    }
}