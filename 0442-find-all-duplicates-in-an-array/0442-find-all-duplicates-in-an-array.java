class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int freq[]=new int[100001];
        for(int i:nums) freq[i]++;
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<freq.length;++i){
            if(freq[i]==2) ans.add(i);
        }
        return ans.size()!=0?ans:new ArrayList<>();
    }
}