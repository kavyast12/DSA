class Solution {
    public int longestConsecutive(int[] nums) {
      int longest=0;
        int count=0;
        int small=Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==small){
                count++;
                small=nums[i];
            }
            else if(nums[i]!=small){
                count=1;
                small=nums[i];
            }
            longest=Math.max(longest, count);
        }
        return longest;
}
}