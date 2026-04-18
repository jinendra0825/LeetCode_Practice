class Solution {
    public int mirrorDistance(int n) {
        int rev = reverse(n);
        int ans = Math.abs(n - rev);

        return ans;
        
    }
    private int reverse(int num){
        int rev = 0 ;

        while(num > 0){
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;

        }

        return rev;
    }
}