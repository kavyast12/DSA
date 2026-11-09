class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> temp=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(temp.size()==0||temp.get(0)!=nums[i]){
                int count=0;
                for(int j=0;j<n;j++){
                    if(nums[i]==nums[j]){
                        count++;
                    }
                }
                if(count>(n/3)){
                    temp.add(nums[i]);
                }
            }
            if(temp.size()==2){
                break;
            }
        }
        return temp;
    }
}