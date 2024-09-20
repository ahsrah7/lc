class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0;i < matrix.length;i ++){
            int minEle = matrix[i][0];
            int col = 0;
            // System.out.println("min ele befor"+minEle);
            for(int j = 0; j < matrix[i].length;j ++){
                if(minEle > matrix[i][j]){
                    minEle = matrix[i][j];
                    col = j;
                }
            }
            // System.out.println("min ele"+minEle);
            int maxEle = matrix[0][col];
            for(int k = 0; k < matrix.length; k ++){
                if(maxEle < matrix[k][col]){
                    maxEle = matrix[k][col];
                }
            }
            // System.out.println("max ele" + maxEle);
            if(maxEle == minEle)
                ans.add(minEle);
        }
        
        return ans;
    }
}