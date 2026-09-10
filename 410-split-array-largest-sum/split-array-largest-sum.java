class Solution {
    public int splitArray(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int su=0;
        
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            su+=nums[i];
        }
        int low=max;int high=su;
        while(low<=high){
            int mid=(low+high)/2;
            if(split(nums,mid)<=k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
        
    }
    public static long split(int[] nums,long d){
        long a=1; long sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=d){
                sum+=nums[i];
            }
            else{
                a++;
                sum=nums[i];
            }
        }
        return a;
    }
}