class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        findSub(0, nums, new ArrayList(), nums.length, result);
        
        return result;
    }
    public void findSub(int i, int[] arr, List<Integer> list, int n, List<List<Integer>> result){
       if(i == n){
           result.add(new ArrayList<>(list));
           return;
       }
        list.add(arr[i]);
        findSub(i+1, arr, list, n, result);
        list.remove(list.size() - 1);
        findSub(i+1, arr, list, n, result);
    }
}