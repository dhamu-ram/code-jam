public class IncrementLargeInteger {
 
    /**
     * Increment the large integer by one.
     * 
     * Time Complexity: O(n) where n is the length of digits
     * Space Complexity: O(1) if we don't count the output array, O(n) for the output
     * 
     * @param digits array of digits from most to least significant
     * @return the incremented array of digits
     */
    public static int[] plusOne(int[] digits) {
        // Start from the rightmost digit (least significant)
        for (int i = digits.length - 1; i >= 0; i--) {
            // If current digit is less than 9, just increment it and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If digit is 9, set it to 0 and continue to the next digit (carry over)
            digits[i] = 0;
        }
        
        // If we exit the loop, all digits were 9
        // We need to add a new digit at the front
        // Example: [9,9,9] becomes [1,0,0,0]
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }