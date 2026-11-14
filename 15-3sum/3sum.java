class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> temp=new HashSet<>();
     int n=nums.length;
     for(int i=0;i<n;i++){
        Set<Integer> s=new HashSet<>();
        for(int j=i+1;j<n;j++){
            int third=-(nums[i]+nums[j]);
            if(s.contains(third)){
                List<Integer> t=Arrays.asList(nums[i],nums[j],third);
                Collections.sort(t);
                temp.add(t);
            }
            s.add(nums[j]);
        }
     }
     return new ArrayList<>(temp);
 }
}