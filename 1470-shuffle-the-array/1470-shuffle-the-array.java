class Solution {
    public int[] shuffle(int[] nums, int n) {
        int f=0,s=n;
        int ans[]=new int[nums.length];
        int idx=0;
        while(idx<n*2){
            ans[idx++]=nums[f++];
            ans[idx++]=nums[s++];
        }
        return ans;
    }
}