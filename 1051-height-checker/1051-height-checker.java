class Solution {
    public int heightChecker(int[] heights) {
        int[] freq = new int[101];
        
        for (int height : heights) {
            freq[height]++;
        }
        
        int result = 0;
        int curHeight = 0;
        
        for (int i = 0; i < heights.length; i++) {
            while (freq[curHeight] == 0) {
                curHeight++;
            }
            if (curHeight != heights[i]) {
                result++;
            }
            freq[curHeight]--;
        }
        return result;
    }
}

/* 
One way of solving this problem is by sorting a copy of our input array and comparing it with the original array.

Every time we see a student in the original array not matching with the same position in the sorted array, we increment our minStudentsMove counter by 1.
*/


