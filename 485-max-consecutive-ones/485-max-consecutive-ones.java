class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
      
        for(int i = 0; i<nums.length; i++){          
          if(nums[i] != 0){
            count += 1;
            max = Math.max(max, count);
          }
          else{
            count = 0;
          }
        }
      /* We have added this because if last index is 1 then control
         will not enter the else block to set the max count value. */

      return max;
    }
}
