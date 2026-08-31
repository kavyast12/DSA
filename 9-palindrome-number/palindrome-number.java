class Solution {
    public boolean isPalindrome(int n) {
        int original=n;
        int rev=0;
        while(n>0){
            int s=n%10;
            n=n/10;
            rev=rev*10+s;
        }
        if(original==rev){
            return true;
        }
        return false;
    }
}