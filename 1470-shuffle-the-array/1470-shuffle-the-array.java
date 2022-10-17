class Solution {
    public int[] shuffle(int[] nums, int n) {
        int f=0,s=n;
        int ans[]=new int[nums.length];
        for(int i=0;i<n*2;){
            ans[i++]=nums[f++];
            ans[i++]=nums[s++];
        }
        return ans;
    }
}