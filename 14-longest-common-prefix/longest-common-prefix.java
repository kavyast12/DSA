class Solution {
    public String longestCommonPrefix(String[] s) {
       Arrays.sort(s);
       String first=s[0];
       String last=s[s.length-1];
       int i=0;
       while(i<first.length() && i<last.length() && first.charAt(i)==last.charAt(i)){
        i++;
       }
       return first.substring(0,i);
    }
}