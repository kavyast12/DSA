class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length()!=t.length()){
        return false;
      }
      int[] temp=new int[26];
      for(int i=0;i<s.length();i++){
        temp[s.charAt(i)-'a']++;
      }
      for(int j=0;j<t.length();j++){
        temp[t.charAt(j)-'a']--;
      }
      for(int i=0;i<temp.length;i++){
        if(temp[i]!=0){
            return false;
        }
      }
      return true;
      
    }
}