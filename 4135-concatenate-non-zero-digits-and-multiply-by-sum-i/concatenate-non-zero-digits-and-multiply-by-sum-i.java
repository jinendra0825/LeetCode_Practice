class Solution {
    public long sumAndMultiply(int n) {

        long newNum = 0;
        int sum = 0;
        while(n > 0){
            int digit = n % 10;

            if(digit == 0){
                n = n /10;
                continue;
            }

            sum += digit;

            newNum = newNum * 10 + digit;
            n = n /10;
        }

        long reverse = Reverse(newNum);

        return reverse * sum;
    }

    public long Reverse(long n){
        long num = 0;

        while(n > 0){
            long digit = n % 10;

            num = num * 10 + digit;

            n = n / 10;
        }

        return num;
    }
}