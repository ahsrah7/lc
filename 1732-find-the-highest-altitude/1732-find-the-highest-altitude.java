class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;
        for(int step:gain){
            altitude = altitude + step;
            maxAltitude = Math.max(altitude,maxAltitude);
        }
        
        return maxAltitude;
    }
}