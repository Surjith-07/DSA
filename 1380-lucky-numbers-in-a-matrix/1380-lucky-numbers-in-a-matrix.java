class Solution {
    public List<Integer> luckyNumbers (int[][] mat) {
        List<Integer> li1=new ArrayList<>();
        List<Integer> li2=new ArrayList<>();
        int r=mat.length,c=mat[0].length;
        for(int i=0;i<r;++i){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<c;++j){
                min=Math.min(mat[i][j],min);
            }
            li1.add(min);
        }
        for(int i=0;i<c;++i){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<r;++j){
                max=Math.max(mat[j][i],max);
            }
            li2.add(max);
        }
        li1.retainAll(li2);
        return li1;
    }
}