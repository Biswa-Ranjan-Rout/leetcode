class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        findCombination(0, candidates, target, res, new ArrayList());
        return res;
    }

    private void findCombination(int i, int[] arr, int target, List<List<Integer>> res, List<Integer> ds) {
        if (arr.length== i) {
            if (target == 0) {
                res.add(new ArrayList(ds));
            }
            return;
        }
        if (arr[i] <= target) {
            ds.add(arr[i]);
            findCombination(i, arr, target - arr[i], res, ds);
            ds.remove((ds.size()) - 1);
        }
        findCombination(i + 1, arr, target, res, ds);
    }
}
