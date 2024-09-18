class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        
        for(int[] i : indices){
            for(int a = 0; a < n; a++){
                matrix[i[0]][a] ++;
            }
            for(int b = 0; b < m; b++){
                matrix[b][i[1]] ++;
            }
        }
        int count = 0;
        for(int[] row : matrix)
            for(int digit:row)
                if((digit % 2) != 0){
                    count ++;
                }
        
        return count;
    }
}