class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> li=new HashSet<>();
        for(int i=1;i<=nums.length;++i) li.add(i);
        List<Integer> ans=new ArrayList<>();
        for(int i:nums){
            if(li.contains(i)) li.remove(i);
        }
        ans.addAll(li);
        return ans.size()!=0?ans:new ArrayList<>();
    }
}