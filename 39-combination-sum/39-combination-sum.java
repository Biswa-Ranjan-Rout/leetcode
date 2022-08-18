class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        findCombination(0, candidates, target, res, new ArrayList());

        return res;
    }

    private void findCombination(int idx, int[] arr, int target, List<List<Integer>> res, List<Integer> cur_list) {
        if (idx == arr.length) {
            if (target == 0) {
                res.add(new ArrayList(cur_list));
            }
            return;
        }

        if (arr[idx] <= target) {
            cur_list.add(arr[idx]);
            findCombination(idx, arr, target - arr[idx], res, cur_list);
            cur_list.remove(cur_list.size() - 1);
        }

        findCombination(idx + 1, arr, target, res, cur_list);
    }
}
