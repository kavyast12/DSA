class Solution {
    public int[] searchRange(int[] nums, int target) {
   int f=first(nums, target);
        int l=last(nums, target);
        return new int[]{f,l};
    }
    public static int first(int[] nums,int target){
        int n=nums.length;
        int low=0;int high=n-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;
    }
    public static int last(int[] nums,int target){
        int n=nums.length;
        int low=0;int high=n-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;
        
    }
}