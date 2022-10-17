class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len=nums.length,p=0,q=0;
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<len;++i){
            if(i<len/2){
                arr1[p++]=nums[i];
            }
            else arr2[q++]=nums[i];
        }
        int ans[]=new int[n*2],o=0;
        for(int i=0,j=0;i<p;++i,++j){
            ans[o++]=arr1[i];
            ans[o++]=arr2[i];
        }
        return ans;
    }
}