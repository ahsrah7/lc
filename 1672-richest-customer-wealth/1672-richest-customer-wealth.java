class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int[] customer_account:accounts){
            int wealth = 0;
            for(int money:customer_account){
                wealth += money;
            }
            maxWealth = Math.max(wealth,maxWealth);
        }
        return maxWealth;
    }
}