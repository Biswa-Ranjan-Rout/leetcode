class Solution {

    public int longestOnes(int[] nums, int k) {
        int zeroCount = 0;
        int res = 0;
        int j = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            }
            while (zeroCount > k) { // If 0 count become more than k
                j++; // then, we'll increment j until we reach see another zero
                if (nums[j] == 0) {
                    zeroCount--; // Once count will become 1, we'll exit this loop, now j will be at 1st zero location, which we can flip for next max search
                }
            }
            int length = i - j;
            res = Math.max(length, res);
        }
        return res;
    }
}
