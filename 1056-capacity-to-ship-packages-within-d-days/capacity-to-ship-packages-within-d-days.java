class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=Integer.MIN_VALUE;
        int right=0;
        for(int i=0;i<weights.length;i++){
            left=Math.max(left,weights[i]);
            right+=weights[i];
        }
        int low=left;int high=right;
        while(low<=high){
            int mid=(low+high)/2;
            int req=func(weights,mid);
            if(req<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return low;
    }
    public static int func(int[] weights,int d){
        int day=1;int load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>d){
                day++;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return day;
    }
}