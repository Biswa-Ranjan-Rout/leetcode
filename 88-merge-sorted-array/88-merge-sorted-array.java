class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Set idx1 and idx2 to point to the end of their respective arrays.
        int idx1 = m - 1;
        int idx2 = n - 1;
        
        // And move p backwards through the array, each time writing
        // the smallest value pointed at by idx1 or idx2.
        for (int p = m + n - 1; p >= 0; p--) {
          /* This if block is required because when idx2 will become -1 
              if we'll not break then, nums2[-1] will throw ArrayIndexOutOfBoundException          
          */
            if (idx2 < 0) {
                break;
            }
            if (idx1 >= 0 && nums1[idx1] > nums2[idx2]) {
                nums1[p] = nums1[idx1--];
            } else {
                nums1[p] = nums2[idx2--];
            }
        }
    }
}