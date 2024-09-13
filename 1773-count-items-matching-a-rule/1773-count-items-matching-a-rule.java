class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int ruleIndex;
        if(ruleKey.equals("type")){
                ruleIndex = 0;
        }else if(ruleKey.equals("color")){
            ruleIndex = 1;
        }else{
            ruleIndex = 2;
        }
        
        for(List<String> item:items){
            String s = item.get(ruleIndex);
           if(s.equals(ruleValue))
               count ++;
        }
        return count;
    }
}