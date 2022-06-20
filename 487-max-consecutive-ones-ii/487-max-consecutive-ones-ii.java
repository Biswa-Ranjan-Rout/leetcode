class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int zeroCount = 0;
        int res = 0;
        int j = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            }
            while (zeroCount > 1) { // If 0 count become more than 1
                j++; // then, we'll increment j until we reach see another zero
                System.out.println(j);
                if (nums[j] == 0) {
                    zeroCount--; // Once count will become 1, we'll exit this loop, now j will be at 1st zero location, which we can flip for next max search
                }
            }
            int length = i - j;
            System.out.println("len: " + length);
            res = Math.max(length, res);
        }
        return res;
    }
}
// https://www.youtube.com/watch?v=ix_TazzqHn0
