class Solution {
    public int myAtoi(String s) {
     s=s.trim();
      if(s.isEmpty()){
        return 0;
      }
      long nums=0;
      int i=0;
      long sign=1;
      if(s.charAt(i)=='+' || s.charAt(i)=='-'){
        sign=(s.charAt(i)=='-')?-1:1;
        i++;
      }
      while(i<s.length() && Character.isDigit(s.charAt(i))){
        nums=nums*10+(s.charAt(i)-'0');
        if (nums*sign>Integer.MAX_VALUE) {
          return Integer.MAX_VALUE;
        }
        if(nums*sign<Integer.MIN_VALUE){
          return Integer.MIN_VALUE;
        }
        i++;
      }
      return (int)(nums*sign);
    }
}