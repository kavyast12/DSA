class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        s=sb.toString();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
            StringBuilder word=new StringBuilder();
            //char ch=s.charAt(i);
            while (i<n && s.charAt(i)!=' ') {
                word.append(s.charAt(i));
                i++;
            }
            word.reverse();
            if(word.length()>0){
                ans.append(" ").append(word);
            }
        }
        return ans.substring(1);
    }
}