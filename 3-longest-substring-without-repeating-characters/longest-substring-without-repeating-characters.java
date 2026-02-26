import java.util.Arrays;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int[] hash = new int[256];
        Arrays.fill(hash, -1);

        // Sliding ke liye l and r liya hai
        int l = 0, r = 0;
        int maxlen = 0;

        while (r < n) {

            char ch = s.charAt(r);

            // agar character already window me hai
            if (hash[ch] != -1 && hash[ch] >= l) {
                l = hash[ch] + 1;
            }

            // current index update karo
            hash[ch] = r;

            // window length
            int len = r - l + 1;
            maxlen = Math.max(maxlen, len);

            r++; // IMPORTANT: right pointer move karo
        }

        return maxlen;
    }
}