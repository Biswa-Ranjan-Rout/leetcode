class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergedArr = new int[m + n];

        int idx1 = 0;
        int idx2 = 0;
        int i = 0;

        while (idx1 < m && idx2 < n) {
            if (nums1[idx1] <= nums2[idx2]) {
                mergedArr[i++] = nums1[idx1++];
            } else if (nums1[idx1] > nums2[idx2]) {
                mergedArr[i++] = nums2[idx2++];
            }
        }
        while(idx1 < m){
          mergedArr[i++] = nums1[idx1++];
        }
        while(idx2 < n){
          mergedArr[i++] = nums2[idx2++];
        }

        for (int j = 0; j < mergedArr.length; j++) {
            nums1[j] = mergedArr[j];
        }
    }
}
