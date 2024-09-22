class Solution {
    public int[] plusOne(int[] digits) {
         List<Integer> list = new ArrayList<>();
        int carry = 0;
        int k = 1;
        for(int i= (digits.length - 1);i >= 0 ;i --){
            if(digits[i] == 9 && (k != 0 || carry != 0)){
                list.add(0);
                carry = 1;
                k = 0;
            }else{
              list.add( digits[i] + k + carry);
              carry = 0;
              k = 0;
            }
        }
        if(carry == 1){
            list.add(1);
            carry = 0;
        }
        Collections.reverse(list);
        int[] array = list.stream().mapToInt(i -> i).toArray();
        return array;
    }
}