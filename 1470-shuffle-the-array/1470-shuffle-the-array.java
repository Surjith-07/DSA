class Solution {
    public int[] shuffle(int[] nums, int n) {
        int f=0,s=n,len=nums.length;
        int ans[]=new int[len];
        for(int i=0;i<len;){
            ans[i++]=nums[f++];
            ans[i++]=nums[s++];
        }
        return ans;
    }
}