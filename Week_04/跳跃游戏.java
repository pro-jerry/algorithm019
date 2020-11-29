class Solution {
    public boolean canJump(int[] nums) {

        int rearch = 0;
        int n = nums.length;

        for (int i=0;i<n;i++) {

            if (i > rearch) {
                return false;
            }

            rearch = Math.max(i+nums[i],rearch);
        }

        return true;

    }
}