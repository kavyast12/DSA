class Solution {
    public int singleNumber(int[] nums) {
       for(int i=0;i<nums.length;i++){
        int s=nums[i];
        int count=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==s){
                count++;
            }
        }
        if(count==1){
            return nums[i];
        }
       }
       return -1;
        
    }
}