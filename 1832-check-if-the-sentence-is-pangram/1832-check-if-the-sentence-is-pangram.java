class Solution {
    public boolean checkIfPangram(String s) {
        for(char ch='a';ch<='z';++ch){
            if(s.indexOf(ch)==-1)return false;
        }
        return true;
    }
}