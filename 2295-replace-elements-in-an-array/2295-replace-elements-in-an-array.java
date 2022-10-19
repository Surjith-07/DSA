class Solution {
    public int[] arrayChange(int[] nums, int[][] op) {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<nums.length;++i) map.put(nums[i],i);
        for(int opp[]:op){
            int idx=map.get(opp[0]);
            nums[idx]=opp[1];
            map.remove(opp[0]);
            map.put(nums[idx],idx);
        }
        return nums;
    }
}