class Solution {

    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
      
        int max = Collections.max(set);
      
        if (set.size() < 3) { //If there are less than 3 numbers then return the maximum
            return max;
        } else {
            set.remove(max);// removed the 1st max value
            max = Collections.max(set); 
            set.remove(max); // removed the 2nd max value

            max = Collections.max(set);
        }
        return max;
    }
}

