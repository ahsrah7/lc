class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int i = 0; i < nums.length; i ++){
            start = Math.max(start,nums[i]);
            end = end + nums[i];
        }
        
        while(start < end){
            int mid = start + (end - start) / 2;
            
            int pieces = 0;
            int sum = 0;
            for(int num:nums){
                if(sum + num > mid){
                    sum = num;
                    pieces ++;
                }else{
                    sum = sum + num;
                }
            }
            
            if(pieces < k ){
                end = mid;
            }else{
                start = mid + 1;
            }
            
        }
        
        return start;
    }
}