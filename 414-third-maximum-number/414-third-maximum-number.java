class Solution {

    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        int max = Collections.max(set);
        if (set.size() < 3) {
            return max;
        } else {
            set.remove(max);
            max = Collections.max(set);
            set.remove(max);

            max = Collections.max(set);
        }

        return max;
    }
}
//[2,2,3,1]
//3,2,1
