class Solution {

    public int uniqueXorTriplets(int[] nums) {

        final int MAX = 2048;

        boolean[] pairXor = new boolean[MAX];
        boolean[] tripletXor = new boolean[MAX];

        // All possible XORs of two numbers
        for (int x : nums) {
            for (int y : nums) {
                pairXor[x ^ y] = true;
            }
        }

        // Add the third number
        for (int xor = 0; xor < MAX; xor++) {

            if (!pairXor[xor]) continue;

            for (int z : nums) {
                tripletXor[xor ^ z] = true;
            }
        }

        int ans = 0;

        for (boolean possible : tripletXor) {
            if (possible) ans++;
        }

        return ans;
    }
}