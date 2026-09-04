class Solution {
    public int minDays(int[] nums, int m, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        if(n<m*k){
            return -1;
        }
        for(int i=0;i<n;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        int low=min;int high=max;int result=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(ispossible(mid,nums,m,k)){
                result=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }
    public static boolean ispossible(int n,int[] nums,int m,int k){
        long count=0;
        //int n=nums.length;
        long noofb=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=n){
            count++;
            if(count==k){
                noofb+=count/k;
                count=0;
            }
        }
        else{
            count=0;
        }
        }
        noofb+=count/k;
        if(noofb>=m){
            return true;
        }
        return false;
    }
}