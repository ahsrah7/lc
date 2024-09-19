class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int row = mat.length;
        int col = mat[0].length;
        
        int[][] rotatedArray = new int[row][col];
        int rotationCount = 0 ;
        while(rotationCount <4){
             for(int i = 0; i < row; i ++){
            for(int j = 0; j < col; j ++){
                rotatedArray[i][j] = mat[col - j - 1][i];
            }
        }
        boolean check = Arrays.deepEquals(rotatedArray, target);
        if(check){
            return check;
        }else{
            rotationCount ++;
            for(int i=0; i<mat.length; i++)
                for(int j=0; j<mat[i].length; j++)
                    mat[i][j]=rotatedArray[i][j];
        }
        }
        return false;
       
    }
}