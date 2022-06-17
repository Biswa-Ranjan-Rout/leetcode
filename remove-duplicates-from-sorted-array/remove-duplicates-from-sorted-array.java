class Solution {

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j-1] != nums[j]) { // This means duplicate run has ended
                nums[i + 1] = nums[j];
                i++;
            }
        }
      return i+1; // As we are starting from 0.
    }
}
