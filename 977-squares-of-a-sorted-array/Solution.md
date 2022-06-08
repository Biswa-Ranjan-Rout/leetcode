1. Naive Solution:

class Solution {

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; ++i)
            ans[i] = nums[i] * nums[i];

        Arrays.sort(ans);
        return ans;
    }
}

2. Efficient Solution:

class Solution {

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 0, right = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            int squareNum = 0;
            if (Math.abs(nums[left]) < (Math.abs(nums[right]))) {
                squareNum = nums[right--];
            } else {
                squareNum = nums[left++];
            }
            res[i] = squareNum * squareNum;
        }
        return res;
    }
}


