import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
       // Initialize a StringBuilder to hold the digits of the number
        StringBuilder numberStr = new StringBuilder();

        // Convert the array-form number to a string
        for (int digit : num) {
            numberStr.append(digit);
        }

        // Convert the string to a BigInteger to handle large numbers
        BigInteger number = new BigInteger(numberStr.toString());

        // Add k to the number
        BigInteger sum = number.add(BigInteger.valueOf(k));

        // Convert the sum back to a string
        String sumStr = sum.toString();

        // Prepare the result list
        List<Integer> result = new ArrayList<>();

        // Convert the string back to a list of digits
        for (char digitChar : sumStr.toCharArray()) {
            result.add(digitChar - '0');
        }

        return result;
    }
}