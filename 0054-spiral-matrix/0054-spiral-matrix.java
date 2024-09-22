class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> ans = new ArrayList<>();
        int row = matrix.length;
int col = matrix[0].length;
        int left = 0;
        int up = 0;
        int down = row -1;
        int right = col - 1;
        int c = 0;
        while(c < (row * col)){
           
            for(int i = left; i <= right ; i ++){
                ans.add(matrix[up][i]);
                c++;
            }
            // if(up != right)
            for(int i = up+1; i <= down ; i ++){
                ans.add(matrix[i][right]);
                c++;
            }

            if(up != down)
            for(int i = right-1; i >= left; i --){
                ans.add(matrix[down][i]);
                c ++;
            }
            if(right != left)
            for(int i = down-1 ; i > up; i --){
                ans.add(matrix[i][left]);
                c ++;
            }

            right --;
            down --;
            left ++;
            up ++;
        }

        return ans;
    }
}