class Solution {
    public List<Integer> majorityElement(int[] nums) {
      int count1=0,count2=0;
      int ele1=0,ele2=0;
      int n=nums.length;
      for(int i=0;i<n;i++){
        if(count1==0 && ele2!=nums[i]){
            count1=1;
            ele1=nums[i];
        }
        else if(count2==0 && ele1!=nums[i]){
            count2=1;
            ele2=nums[i];
        }
        else if(ele1==nums[i]){
            count1++;
        }
        else if(ele2==nums[i]){
            count2++;
        }
        else{
            count1--;
            count2--;
        }
      }
      int cnt1=0,cnt2=0;
      List<Integer> temp=new ArrayList<>();
      for(int i=0;i<n;i++){
        if(ele1==nums[i]){
            cnt1++;
        }
        else if(ele2==nums[i]){
            cnt2++;
        }
      }
      int min=n/3+1;
      if(cnt1>=min){
        temp.add(ele1);
      }
      if(cnt2>=min && ele1!=ele2){
        temp.add(ele2);
      }
      Collections.sort(temp);
      return temp;
    }
}