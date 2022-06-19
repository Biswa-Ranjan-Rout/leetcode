class Solution {

    public int heightChecker(int[] heights) {
        int n = heights.length;
        int count = 0;
        int[] copyArr = new int[n];

        for (int i = 0; i < n; i++) {
            copyArr[i]  = heights[i];
        }
        Arrays.sort(copyArr);
      
        for (int i = 0; i < n; i++) {
            if(copyArr[i]  != heights[i]){
              count++;
            }
        }
       
        return count;
    }
}
/* 
One way of solving this problem is by sorting a copy of our input array and comparing it with the original array.

Every time we see a student in the original array not matching with the same position in the sorted array, we increment our minStudentsMove counter by 1.
*/
