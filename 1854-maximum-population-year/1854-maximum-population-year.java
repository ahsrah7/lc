class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] yearLine = new int[100];
        int maxYear = 1950;
        for(int[] person:logs)
            for(int i = person[0];i < person[1]; i ++){
                yearLine[i - 1950] ++;
               
            }
        int max = 0;
        for(int i = 0;i < yearLine.length;i ++){
             if(yearLine[i] > yearLine[max]){
                    max = i;
                }
        }
        // System.out.println(Arrays.toString(yearLine));
        return maxYear + max;
    }
}