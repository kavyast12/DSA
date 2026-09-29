class Solution {
    public String frequencySort(String s) {
          Map<Character,Integer> mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch, 0)+1);
        }
        StringBuilder ans=new StringBuilder();
        List<Character> list=new ArrayList<>(mp.keySet());
        list.sort((a,b)->mp.get(b)-mp.get(a));
        for(char ch:list){
            for(int i=0;i<mp.get(ch);i++){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}