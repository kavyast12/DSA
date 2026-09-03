class Solution {
    public int minEatingSpeed(int[] nums, int h) {
      int  max=Integer.MIN_VALUE;
      int ans=max;
      for(int i=0;i<nums.length;i++){
        max=Math.max(max,nums[i]);
      }
      int low=1;
      int high=max;
      //int ans=max;
      while(low<=high){
        int mid=(low+high)/2;
        long req=total(nums,mid);
        if(req<=h){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
      }
      return ans;
    }
    public static long total(int[] nums,int rate){
        long totalhr=0;
        for(int i=0;i<nums.length;i++){
            totalhr+=(nums[i]+rate-1)/rate;

        }
        return totalhr;
    }
}