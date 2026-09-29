class Solution {
    public String frequencySort(String s) {
               int[] freq=new int[256];
            
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }
      StringBuilder ans=new StringBuilder();
      for(int k=0;k<256;k++){
        int max=0;
        int index=-1;
        for(int i=0;i<256;i++){
            if(freq[i]>max){
                max=freq[i];
                index=i;
            }
        }
        if(index==-1){
            break;
        }
        for(int j=0;j<max;j++){
             ans.append((char)index);
        }
        freq[index]=0;
      }
      return ans.toString();
    }
}