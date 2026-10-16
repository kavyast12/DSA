class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
    int longest=0;
    HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<nums.length;i++){
        set.add(nums[i]);
    }
    for(int st:set){
        //int count=0;
        if(!set.contains(st-1)){
            int count=1;
            int x=st;
            while(set.contains(x+1)){
                x=x+1;
                count++;
            }
            longest=Math.max(longest,count);
        }
        
    }
    return longest;
}
}