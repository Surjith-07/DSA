class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Map<Character,String> map=new TreeMap<>();
        map.put('a',".-"); map.put('b',"-..."); map.put('c',"-.-."); map.put('d',"-.."); map.put('e',"."); map.put('f',"..-."); map.put('g',"--."); map.put('h',"...."); map.put('i',".."); map.put('j',".---"); map.put('k',"-.-"); map.put('l',".-.."); map.put('m',"--"); map.put('n',"-.");map.put('o',"---"); map.put('p',".--."); map.put('q',"--.-"); map.put('r',".-."); map.put('s',"..."); map.put('t',"-"); map.put('u',"..-"); map.put('v',"...-"); map.put('w',".--"); map.put('x',"-..-"); map.put('y',"-.--"); map.put('z',"--..");
        
        Set<String> set=new LinkedHashSet<>();
        for(String i:words){
            String s="";
            for(char ch:i.toCharArray()){
                s+=map.get(ch);
            }
            set.add(s);
        }
        return set.size()>0?set.size():0;
    }
}