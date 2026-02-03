class Solution {
    static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {

        long ans = 1;

        long p1 = modPow(5, (n + 1) / 2);
        long p2 = modPow(4, n / 2);

        ans = (p1 * p2) % MOD;

        return (int) ans;
    }

    private long modPow(long base, long exp) {
        if (exp == 0) return 1;

        long half = modPow(base, exp / 2);
        half = (half * half) % MOD;

        if (exp % 2 == 1) {
            half = (half * base) % MOD;
        }

        return half;
    }
}
