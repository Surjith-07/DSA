class Solution {
    public String restoreString(String s, int[] indices) {
        Map<Integer,Character> mp=new LinkedHashMap<>();
        for(int i=0;i<s.length();++i){
            mp.put(indices[i],s.charAt(i));
        }
        String ans="";
        for(int i=0;i<s.length();++i){
            ans+=mp.get(i);
        }
        return ans;
    }
}