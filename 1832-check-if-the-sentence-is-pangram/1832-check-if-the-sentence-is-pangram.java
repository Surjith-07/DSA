class Solution {
    public boolean checkIfPangram(String s) {
        for(int i=0;i<26;++i){
            if(s.indexOf((char)((int)'a'+i))==-1)return false;
        }
        return true;
    }
}