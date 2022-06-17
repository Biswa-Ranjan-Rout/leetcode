class Solution {

    public int removeDuplicates(int[] nums) {
        int writePointer = 0;
        for (int j = 1; j < nums.length; j++) { // j is used as a readPointer
            if (nums[j-1] != nums[j]) { // This means duplicate run has ended
                nums[writePointer + 1] = nums[j];
                writePointer++;
            }
        }
      return writePointer+1; // As we are starting from 0.
    }
}

// i is the index which holds only unique element