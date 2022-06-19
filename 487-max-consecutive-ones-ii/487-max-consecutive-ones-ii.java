class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        // [1,0,1,1,0,1]
        
        
        boolean flag = false;
      int resMax = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int max = 0;
            for (int j = i; j < nums.length; j++) {
              if(flag == true && nums[j] == 0){
                break;
              }
                if (nums[j] == 0 && flag == false) {
                    count++;
                    flag = true;
                }
                if(nums[j] == 1){
                    count++;
                }
                max = Math.max(count,max);
              
            }
          flag = false;
          resMax = Math.max(resMax,max);
        }
        return resMax;
    }
}
