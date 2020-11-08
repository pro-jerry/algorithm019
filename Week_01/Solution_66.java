
//66. ¼ÓÒ»
class Solution {
    public int[] plusOne(int[] digits) {

        for (int i=digits.length-1;i>=0;i-- ) {

            digits[i]++;
            digits[i] = digits[i]%10;
            if (digits[i]!=0) return digits;
        }

        int[] digits0 = new int[digits.length+1];
        digits0[0] = 1;
        return digits0;

    }
}