class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> li=new HashSet<>();
        for(int i:nums) li.add(i);
        Set<Integer> ans=new HashSet<>();
        for(int i=1;i<=nums.length;++i){
            if(!li.contains(i)) ans.add(i);
        }
        return ans.size()!=0?new ArrayList<>(ans):new ArrayList<>();
    }
}