class Solution {

    public void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }

        int writeIndex = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[writeIndex] == 0 && nums[j] != 0) {
                nums[writeIndex] = nums[j];
                nums[j] = 0;
                writeIndex++;
            } else if (nums[writeIndex] != 0) {
                writeIndex++;
            }
        }
    }
}
