class Solution {
    public int beautySum(String s) {
        int total=0;
        for(int i=0;i<s.length();i++){
          for(int j=i;j<s.length();j++){
            int[] freq=new int[26];
            for(int k=i;k<=j;k++){
              freq[s.charAt(k)-'a']++;
            }
            int max=0;
            int min=Integer.MAX_VALUE;
            for(int k=0;k<26;k++){
              if(freq[k]>0){
                max=Math.max(max, freq[k]);
                min=Math.min(min, freq[k]);
              }
              
            }
            total+=max-min;
          }
        }
        return total;
    }
}