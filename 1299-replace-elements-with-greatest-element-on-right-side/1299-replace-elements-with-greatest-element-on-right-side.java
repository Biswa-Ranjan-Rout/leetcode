class Solution {

    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = -1;
        int temp;
        for (int i = n - 1; i >= 0; i--) {
            temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }

        return arr;
    }
}
