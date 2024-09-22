class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans = new int[r][c];
        
        if((mat.length)*(mat[0].length) != (r * c)){
            return mat;
        }
        
        int[] elements = new int[r*c];
        int k = 0;
         for(int i = 0; i < mat.length;i ++){
            for(int j = 0; j < mat[i].length; j++){
                elements[k++] = mat[i][j];
            }
        }
        
        
        k = 0;
        for(int i = 0; i < r;i ++){
            for(int j = 0; j < c; j++){
                ans[i][j] = elements[k++];
            }
        }
        
        return ans;
    }
}