class Solution {
    public boolean validMountainArray(int[] arr) {
      int n = arr.length;
      int i = 0;
      
      // Walk up
      while(i+1 < n && arr[i] < arr[i+1]){
        i++;
      }
      // peak can't be first or last
      if(i==0 || i == n-1){
        return false;
      }
      //walk down
      while(i+1 < n && arr[i] > arr[i+1]){
        i++;
      }
      
      // If we reach the end, the array is valid, otherwise its not.
      return i == n-1;
    }
}