class Solution {
    public int[][] transpose(int[][] mat) {
        int r=mat.length,k=r,c=mat[0].length;
        int ans[][]=new int[c][r];
        for(int i=0;i<c;++i){
            for(int j=0;j<r;++j){
                ans[i][j]=mat[j][i];
            }
        }
        return ans;
    }
}