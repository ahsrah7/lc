class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffledArray = new int[2*n];
        
        for(int i = 0,j = n,z = 0; i < n;i ++,j ++,z += 2){
            shuffledArray[z] = nums[i];
            shuffledArray[z+1] = nums[j];
         }
        return shuffledArray;
    }
}