class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map=new TreeMap<>(Collections.reverseOrder());
        for(int i:arr) map.put(i,map.getOrDefault(i,0)+1);
        
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getKey()==e.getValue()) return e.getValue();
        }
        return -1;
    }
}