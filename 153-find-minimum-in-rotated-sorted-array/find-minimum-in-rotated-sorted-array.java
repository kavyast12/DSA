class Solution {
    public int findMin(int[] nums) {
      int minval=Integer.MAX_VALUE;
      for(int i=0;i<nums.length;i++){
        minval=Math.min(minval,nums[i]);
      }
      return minval;
    }     
}
