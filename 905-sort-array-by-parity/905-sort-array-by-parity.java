class Solution {

    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int i = 0, j = n - 1;

        while (i <= j) {
            if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j--;
            } else if (nums[i] % 2 == 0 && nums[j] % 2 != 0) {
                i++;
                j--;
            } else if (nums[i] % 2 == 0 && nums[j] % 2 == 0) {
                i++;
            } else {
                j--;
            }
        }
        return nums;
    }
}
/*
- We'll keep even at left and odd numbers at right side.
- So we need 2 pointers. 1 for left and 1 for right.
- Left will start from 0 and will move forward, right will start from last index and will come backward.

- So, we have 4 scenario here.
1. If left is odd and right is even then swap. And move i pointer 1 index forward and j pointer one index backward.
2. If left is even and right is odd, then no need to swap only move the pointer to cgheck the next indexes. i.e. i++ and j--
3. If left is even and right also even, then no need to change right pointer. Only change left pointer to next forward location. i.e. i++
4. If right is odd and left also odd, then no need to change left pointer. Only change right pointer to next backward location. i.e. j--

*/
