class Solution {

    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] copyArr = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            copyArr[i] = heights[i];
        }
        Arrays.sort(copyArr);

        for (int i = 0; i < n; i++) {
            if (copyArr[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
