class Solution {
    public int smallestDivisor(int[] nums, int limit) {
        int max=Integer.MIN_VALUE;
           for(int i=0;i<nums.length;i++){
            max=Math.max(max, nums[i]);
        }
        int low=1;int high=max;int result=-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(isPossible(nums, mid)<=limit){
                result=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
       
    }
    public  static long isPossible(int[] nums,int n){
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i]+n-1)/n;
        }
        return sum;
        
    }
}