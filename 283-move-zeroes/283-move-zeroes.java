class Solution {

    public void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }

        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left++] = temp;
            }
        }
    }
}
// So the intuition is, we will have two pointers.
// We will use swap technique.

/* 
- We will start both left and right pointers from 0th index.
- If we will see a zero then we'll increment the right pointer but left pointer will remain same.
- If we will encounter a non-zero value then we'll swap both left and right pointer value. And we'll increment left and right pointer.

*/
