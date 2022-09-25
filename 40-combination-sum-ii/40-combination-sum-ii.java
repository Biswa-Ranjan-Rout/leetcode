class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(0, candidates, target, res, new ArrayList());
        return res;
    }

    private void findCombination(int idx, int[] arr, int target, List<List<Integer>> res, List<Integer> ds) {
        if (target == 0) {
            res.add(new ArrayList<>(ds));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1]) continue; // If we will not check (i > idx), then arr[i - 1] will give error for 1st index i.e. arr[-1] is not valid
            if (arr[i] > target) break;

            ds.add(arr[i]);
            findCombination(i + 1, arr, target - arr[i], res, ds);
            ds.remove(ds.size() - 1);
        }
    }
}
