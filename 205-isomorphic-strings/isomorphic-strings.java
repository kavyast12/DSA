class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> a=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char original=s.charAt(i);
            char replace=t.charAt(i);
            if(!a.containsKey(original)){
                if(!a.containsValue(replace)){
                    a.put(original,replace);
                }
                else{
                    return false;
                }
            }
            else{
                char map=a.get(original);
                if(map!=replace){
                    return false;
                }
            }
        }
        return true;
    }
}