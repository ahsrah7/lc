class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] chars = sentence.toCharArray();
        int[] frequency = new int[26];
        
        for(char ch:chars){
            frequency[ch - 'a']++;
        }
        for(int freq : frequency)
            if(freq == 0)
                return false;
        return true;
    }
}