class Solution {
    public String addBinary(String a, String b) {
        int j = a.length() - 1;
        int k = b.length() - 1;
        int carry = 0;

        StringBuilder result = new StringBuilder();

        while (j >= 0 || k >= 0 || carry != 0) {
            int sum = carry;

            if (j >= 0) {
                sum += a.charAt(j) - '0';
                j--;
            }

            if (k >= 0) {
                sum += b.charAt(k) - '0';
                k--;
            }

            result.append(sum % 2); // current bit
            carry = sum / 2;        // carry
        }

        return result.reverse().toString();
    }
}