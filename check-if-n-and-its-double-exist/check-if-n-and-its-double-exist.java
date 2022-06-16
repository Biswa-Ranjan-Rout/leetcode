class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();

          
        for(int i=0; i<n; i++){
          int a = arr[i], b = 2 * a;
          if(map.containsKey(b) ){
            return true;
          }
          else if( a % 2 == 0 && map.containsKey(a/2)){
            return true;
          }
          else{
            map.put(a,1);
          }
        }
      return false;
    }
}
