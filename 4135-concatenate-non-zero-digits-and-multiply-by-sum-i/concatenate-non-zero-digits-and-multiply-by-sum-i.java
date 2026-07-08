class Solution {
    public long sumAndMultiply(int n) {

        String num = Integer.toString(n);

        long x = 0;
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);

            if (ch != '0') {
                int digit = ch - '0';
                x = x * 10 + digit;
                sum += digit;
            }
        }

        return x * sum;
    }
}