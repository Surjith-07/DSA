class Solution {
    public String toLowerCase(String s) {
        String ss="";
        for(char ch:s.toCharArray()){
            if(Character.isLowerCase(ch)){
                ss+=(char)ch;
            } else if(Character.isUpperCase(ch)) ss+=(char)(ch+32);
            else ss+=ch;
        }
        return ss;
    }
}