class Solution {
    public boolean isPerfectSquare(int num) {

         if (num < 2) {
            return true;
        }

        long left = 2 ,right = num/2,guessSquared;
        while (left <= right) {

            long mid = left + (right - left + 1) /2;
            guessSquared = mid * mid;

            if (guessSquared == num) {
                return true;
            } else if (guessSquared > num) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }

        return false;

    }
}