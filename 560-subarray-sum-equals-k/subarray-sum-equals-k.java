class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int n=nums.length;
        m.put(0, 1);
        int presum=0;
        int count=0;
        for(int i=0;i<n;i++){
            presum+=nums[i];
            int remove=presum-k;
            if(m.containsKey(remove)){
                count+=m.get(remove);
            }
            m.put(presum, m.getOrDefault(presum, 0)+1);
            
        }
        return count;
        
    }
}