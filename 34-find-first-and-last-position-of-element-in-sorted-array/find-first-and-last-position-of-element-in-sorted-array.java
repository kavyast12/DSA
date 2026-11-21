class Solution {
    public int[] searchRange(int[] nums, int target) {
      int l=lowerbound(nums,target);
      if(l==nums.length || nums[l]!=target){
        return new int[] {-1,-1};
      }
      return new int[] {l,upperbound(nums,target)-1};
}
public static int lowerbound(int[] nums,int target){
    int ans=nums.length;
    int low=0;
    int high=nums.length-1;
    while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]>=target){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    return ans;
}
public static int upperbound(int[] nums,int target){
    int ans=nums.length;
    int low=0;
    int high=nums.length-1;
    while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]>target){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    return ans;
}
}