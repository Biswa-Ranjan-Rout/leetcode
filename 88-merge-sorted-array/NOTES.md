Solution With Extra Space:
-------------------
class Solution {
​
public void merge(int[] nums1, int m, int[] nums2, int n) {
int[] mergedArr = new int[m + n];
​
int idx1 = 0;
int idx2 = 0;
int i = 0;
​
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
​
for (int j = 0; j < mergedArr.length; j++) {
nums1[j] = mergedArr[j];
}
}
}
--------------------------------
Approach 3: Three Pointers (Start From the End)
--------------------------------
Intuition:
​
Interview Tip:
This is a medium-level solution to an easy-level problem. Many of LeetCode's easy-level problems have more difficult solutions, and good candidates are expected to find them.
​
Approach 2 already demonstrates the best possible time complexity, \mathcal{O}(n + m)O(n+m), but still uses additional space. This is because the elements of array nums1 have to be stored somwhere so that they aren't overwritten.
​
So, what if instead we start to overwrite nums1 from the end, where there is no information yet?
​
The algorithm is similar to before, except this time we set p1 to point at index m - 1 of nums1, p2 to point at index n - 1 of nums2, and p to point at index m + n - 1 of nums1. This way, it is guaranteed that once we start overwriting the first m values in nums1, we will have already written each into its new position. In this way, we can eliminate the additional space.
​
Interview Tip:
---------------
Whenever you're trying to solve an array problem in-place, always consider the possibility of iterating backwards instead of forwards through the array. It can completely change the problem, and make it a lot easier.
​