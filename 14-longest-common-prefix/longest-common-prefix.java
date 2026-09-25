class Solution {
    public String longestCommonPrefix(String[] s) {
         String prefix="";
        for(int i=0;i<s[0].length();i++){
          char ch=s[0].charAt(i);
          for(int j=1;j<s.length;j++){
            if(i>=s[j].length()||s[j].charAt(i)!=ch){
              return prefix;
            }
            
          }
          prefix=prefix+ch;
        }
        return prefix;
    }
}