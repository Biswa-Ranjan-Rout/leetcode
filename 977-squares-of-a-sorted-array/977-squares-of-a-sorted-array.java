class Solution {

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int square = 0;
            if (Math.abs(nums[right]) > Math.abs(nums[left])) {
                square = nums[right];
                right--;
            } else {
                square = nums[left];
                left++;
            }
            result[i] = square * square;
        }

        return result;
    }
}
