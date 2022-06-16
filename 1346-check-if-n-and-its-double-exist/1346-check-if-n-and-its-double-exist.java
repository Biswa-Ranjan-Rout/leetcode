class Solution {

    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i], b = 2 * a;
            if (set.contains(b) || (a % 2 == 0 && set.contains(a / 2))) {
                return true;
            }
            set.add(a);
        }
        return false;
    }
}
