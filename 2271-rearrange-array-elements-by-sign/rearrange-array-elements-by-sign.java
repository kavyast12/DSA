class Solution {
    public int[] rearrangeArray(int[] nums) {
       int[] pos=new int[nums.length];
        int[] neg=new int[nums.length];
        //int[] temp=new int[nums.length];
        int posi=0;
        int nege=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos[posi]=nums[i];
                posi++;
            }
            else{
                neg[nege]=nums[i];
                nege++;
            }
        }
        if(posi>nege){
            for(int i=0;i<posi;i++){
               nums[2*i]=pos[i];
               nums[2*i+1]=neg[i];
            }
            int index=nege*2;
            for(int i=nege;i<posi;i++){
                nums[index]=pos[i];
                index++;
            }
        }
        else{
               for(int i=0;i<nege;i++){
               nums[2*i]=pos[i];
               nums[2*i+1]=neg[i];
            }
            int index=posi*2;
            for(int i=posi;i<nege;i++){
                nums[index]=neg[i];
                index++;
        }
    }
    return nums;
    }
}