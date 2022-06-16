class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        for(int i=0 ; i<n - 1; i++){
          int max = 0;
          for(int j=i; j<n-1; j++){         
             max = Math.max(max, arr[j+1]);
          }
          arr[i] = max;
        }
        arr[n-1] = -1;
      
      return arr;
    }
}